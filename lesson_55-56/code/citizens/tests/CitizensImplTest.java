package citizens.tests;

import citizens.dao.Citizens;
import citizens.dao.CitizensImpl;
import citizens.dao.CitizensSetImpl;
import citizens.hashset.CitizensHashSetImpl;
import citizens.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CitizensImplTest {

    Citizens citizens;
    static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        citizens = new CitizensHashSetImpl(List.of(
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(2, "John", "Smith", now.minusYears(20)),
                new Person(3, "Mary", "Jackson",now.minusYears(23)),
                new Person(4, "Bruce", "Willis", now.minusYears(25))
        ));
    }

    @Test
    void testCitizensConstructor(){
        // вызываем конструктор с одинаковыми объектами
        citizens = new CitizensHashSetImpl(List.of(
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(1, "Peter", "Jackson", now.minusYears(23))
        ));
        // проверяем, что добавился только один объект
        assertEquals(1,citizens.size());
    }
    @Test
    void addTest() {
        assertFalse(citizens.add(null));
        assertFalse(citizens.add(new Person(2, "John", "Smith", now.minusYears(20))));
        assertEquals(4, citizens.size());
        assertTrue(citizens.add(new Person(5, "Jack", "Willis", now.minusYears(25))));
        assertEquals(5, citizens.size());
    }

    @Test
    void removeTest() {
        assertFalse(citizens.remove(5));
        assertEquals(4, citizens.size());
        assertTrue (citizens.remove(4));
        assertEquals(3, citizens.size());
    }

    @Test
    void findTest() {
        Person person = citizens.find(1);
        assertEquals(1, person.getId());
        assertEquals("Peter", person.getFirstName());
        assertEquals("Jackson", person.getLastName());
        assertEquals(23 , person.getAge());
        assertNull(citizens.find(5)); // по несуществующему id метод возвращает null
    }

    @Test
    void testFindByLastName() {
        Iterable<Person> persons = citizens.find("Jackson");//выбираем однофамильцев
        List<Person> actual = new ArrayList<>();
        for (Person person : persons) {
            actual.add(person);
        }
        Collections.sort(actual); //сортируем их по id
        List<Person> expected = List.of (
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(3, "Mary", "Jackson",now.minusYears(23))
        );
        assertIterableEquals(expected, actual);
    }

    @Test
    void testFindByAgeRange() {
        Iterable<Person> persons = citizens.find(20, 23);//выбираем людей возраста от 20 до 23 лет включительно
        List<Person> actual = new ArrayList<>();
        for (Person person : persons) {
            actual.add(person);
        }
        Collections.sort(actual);//сортируем их по id
        List<Person> expected = List.of (
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(2, "John", "Smith", now.minusYears(20)),
                new Person(3, "Mary", "Jackson",now.minusYears(23))
        );
        assertIterableEquals(expected, actual);
    }

    @Test
    void getAllPersonsSortedByIdTest() {
        Iterable<Person> persons = citizens.getAllPersonsSortedById(); //список всех граждан, отсортированный по id
        int id = -1;
        int count = 0;
        for (Person person : persons) {
            count++;
            assertTrue(person.getId() > id); // проверка, что сортировка по id работает
            id = person.getId();
        }
        assertEquals(count,citizens.size());//никого не потеряли
    }

    @Test
    void getAllPersonsSortedByAgeTest() {
        Iterable<Person> persons = citizens.getAllPersonsSortedByAge();//список всех граждан, отсортированный по возрасту
        int age = -1;
        int count = 0;
        for (Person person : persons) {
            count++;
            assertTrue(person.getAge() >= age); // проверка, что сортировка по возрасту работает
            age = person.getAge();
        }
        assertEquals(count,citizens.size());//никого не потеряли
    }

    @Test
    void getAllPersonsSortedByLastNameTest() {
        Iterable<Person> persons = citizens.getAllPersonsSortedByLastName();//список всех граждан, отсортированный по фамилии
        String lastName = "";
        int count = 0;
        for (Person person : persons) {
            count++;
            assertTrue(person.getLastName().compareTo(lastName) >= 0); // проверка, что сортировка по фамилии работает
            lastName = person.getLastName();
        }
        assertEquals(count,citizens.size());//никого не потеряли

    }

    @Test
    void sizeTest() {
        assertEquals(4, citizens.size());
    }
}