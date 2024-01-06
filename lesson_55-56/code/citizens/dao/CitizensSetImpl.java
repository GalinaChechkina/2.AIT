package citizens.dao;

import citizens.model.Person;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class CitizensSetImpl implements Citizens{
    private TreeSet<Person>idList;
    private TreeSet<Person>lastNameList;
    private TreeSet<Person>ageList;

    private static Comparator<Person> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName());
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId());
    };

    private static Comparator<Person> ageComparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAge(), p2.getAge());
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId());
    };

    public CitizensSetImpl(){//пустой конструктор: создаем структуры TreeSet
        idList=new TreeSet<>(); //будет сортировка по умолчанию (по id)
        lastNameList=new TreeSet<>(lastNameComparator);//будет сортировка при помощи компаратора lastNameComparator
        ageList=new TreeSet<>(ageComparator);//будет сортировка при помощи компаратора ageComparator
    }

    public CitizensSetImpl(List<Person>citizens){//конструктор
        this();//вызываем пустой конструктор
        for (Person person:citizens) {//заполняем лист
             citizens.forEach(p->add(p));
        }
    }

    @Override//O(log n)
    public boolean add(Person person) {
        return person!=null && idList.add(person) && lastNameList.add(person) && ageList.add(person);
    }

    @Override//O(log n)
    public boolean remove(int id) {
        Person person= find(id);
        return person != null && idList.remove(person) && lastNameList.remove(person) && ageList.remove(person);
    }

    @Override
    public Person find(int id) {
        Person pattern = new Person(id,null,null,null);
        Person person = idList.ceiling(pattern);//ищем паттерн в дереве снизу вверх
        return pattern.equals(person) ? person: null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now=LocalDate.now();//
        Person from=new Person(idList.first().getId()-1,null,null,now.minusYears(minAge));
        Person to=new Person(idList.last().getId()+1,null,null,now.minusYears(maxAge));
        return ageList.subSet(from,to);//вынимаем поддерево
    }

    @Override
    public Iterable<Person> find(String lastName) {
        Person from=new Person(Integer.MIN_VALUE,null,lastName,null);
        Person to=new Person(Integer.MAX_VALUE,null,lastName,null);
        return lastNameList.subSet(from,to);
    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return idList;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return ageList;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return lastNameList;
    }

    @Override
    public int size() {
        return idList.size();
    }
}
