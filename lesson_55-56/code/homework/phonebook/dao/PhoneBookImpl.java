package homework.phonebook.dao;

import homework.phonebook.model.Contact;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class PhoneBookImpl implements PhoneBook{

    private Collection<Contact>phoneList;
    private int capacity;

    public PhoneBookImpl(){
        phoneList=new TreeSet<>();
    }
    public PhoneBookImpl(int capacity){
        this();
        this.capacity=capacity;
        phoneList.forEach(c->add(c));
    }

    @Override //O(1)
    public boolean add(Contact contact) {
        return contact!=null&& phoneList.add(contact);
    }

    @Override
    public boolean remove(String name) {
        Contact contact= find(name);
        return contact != null && phoneList.remove(contact);
    }

    @Override
    public Contact find(String name) {
        for (Contact contact:phoneList ) {
            if(contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }

    @Override
    public void print() {
        ArrayList<Contact>printList=new ArrayList<>();
        for (Contact c:phoneList ) {
            printList.add(c);
            printList.sort((s1,s2)-> s1.compareTo(s2));
        }
        printList.forEach(c-> System.out.println(c));
    }
    public int size(){
       return phoneList.size();
    }
}
