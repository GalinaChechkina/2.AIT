package homework.phonebook.dao;

import homework.phonebook.model.Contact;

public interface PhoneBook {
    boolean add(Contact contact);
    boolean remove(String name);
    Contact find(String name);
    void print();
    int size();
}
