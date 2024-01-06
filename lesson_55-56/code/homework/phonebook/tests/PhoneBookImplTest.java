package homework.phonebook.tests;

import homework.phonebook.dao.PhoneBook;
import homework.phonebook.dao.PhoneBookImpl;
import homework.phonebook.model.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookImplTest {
    PhoneBook phoneBook;
    @BeforeEach
    void setUp(){
        phoneBook=new PhoneBookImpl();
                phoneBook.add(new Contact("N1","ph1"));
                phoneBook.add(new Contact("N2","ph2"));
                phoneBook.add(new Contact("N3","ph3"));
                phoneBook.add(new Contact("N4","ph4"));
                phoneBook.add(new Contact("N5","ph5"));
                phoneBook.add(new Contact("N6","ph6"));
    }

    @Test
    void add() {
        assertFalse(phoneBook.add(new Contact("N1","ph1")));
        phoneBook.add(new Contact("N7","ph7"));
        assertEquals(7,phoneBook.size());
    }

    @Test
    void remove() {
        assertFalse(phoneBook.remove(null));
        assertFalse(phoneBook.remove("N7"));
        phoneBook.remove("N1");
        assertEquals(5,phoneBook.size());

    }

    @Test
    void find() {
        Contact contact=phoneBook.find("n2");
        assertEquals("N2",contact.getName());
        assertEquals(null,phoneBook.find(""));
        assertEquals(null,phoneBook.find("N8"));
    }

    @Test
    void print() {
        PhoneBook pb=new PhoneBookImpl();
        pb.add(new Contact("Z","1"));
        pb.add(new Contact("M","2"));
        pb.add(new Contact("A","6"));
        pb.print();
    }
}