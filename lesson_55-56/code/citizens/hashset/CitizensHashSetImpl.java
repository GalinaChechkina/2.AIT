package citizens.hashset;

import citizens.dao.Citizens;
import citizens.model.Person;

import java.time.LocalDate;
import java.util.*;


public class CitizensHashSetImpl implements Citizens {
    private HashSet<Person> idList;

    private static Comparator<Person> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName());
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId());
    };

    private static Comparator<Person> ageComparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAge(), p2.getAge());
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId());
    };

    public CitizensHashSetImpl(){//пустой конструктор: создаем структуру
        idList=new HashSet<>();
    }

    public CitizensHashSetImpl(List<Person> citizens){//конструктор
        this();//вызываем пустой конструктор
        for (Person person:citizens) {//заполняем лист
            citizens.forEach(p->add(p));
        }
    }

    @Override
    public boolean add(Person person) {
        return person!=null && idList.add(person);
    }

    @Override
    public boolean remove(int id) {
        Person person= find(id);
        return person != null && idList.remove(person);
    }

    @Override
    public Person find(int id) {
        for (Person person:idList ) {
            if(person.getId()==id){
                return person;
            }
        }
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        List<Person>res=new ArrayList<>();
        for (Person person:idList ) {
            if(person.getAge() >= minAge && person.getAge() <= maxAge){
                res.add(person);
            }
        }
        return res;
    }

    @Override
    public Iterable<Person> find(String lastName) {
        List<Person>res=new ArrayList<>();
        for (Person person:idList ) {
            if(person.getLastName().equals(lastName)){
                res.add(person);
            }
        }
        return res;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        List<Person>res=new ArrayList<>();
        for (Person person:idList) {
            res.add(person);
        }
        return res;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        List<Person>res=new ArrayList<>();
        for (Person person:idList) {
            res.add(person);
        }
        res.sort(ageComparator);
        return res;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        List<Person>res=new ArrayList<>();
        for (Person person:idList) {
            res.add(person);
        }
        res.sort(lastNameComparator);
        return res;
    }

    @Override
    public int size() {
        return idList.size();
    }
}
