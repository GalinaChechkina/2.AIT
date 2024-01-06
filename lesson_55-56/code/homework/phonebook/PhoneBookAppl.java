package homework.phonebook;

import homework.phonebook.dao.PhoneBookImpl;
import homework.phonebook.model.Contact;

public class PhoneBookAppl {
    //  Создайте приложение "Телефонная книга" для нашей группы со следующим функционалом:
    //     -добавить контакт (имя и телефон);
    //     -напечатать все контакты;
    //     -найти контакт;
    //     -удалить контакт.
    //   Главное - определите/выберите и обоснуйте выбор структуры данных
    //   для хранения из тех, что есть в JCF (пока, исключая Map).
    //   Данные в приложении сохраняются до выхода из нее.
    //   Mожно посмотреть Java Files I/O: https://www.w3schools.com/java/java_files_create.asp
    //   и добавить сохранение/чтение данных из простого текстового файла.
    public static void main(String[] args) {
        PhoneBookImpl phoneBook= new PhoneBookImpl(20);
        phoneBook.add(new Contact("A","1"));
        phoneBook.add(new Contact("Z","12"));
        phoneBook.add(new Contact("S","123"));
        phoneBook.add(new Contact("L","451"));
        phoneBook.add(new Contact("O","251"));
        phoneBook.add(new Contact("N","14"));
        phoneBook.add(new Contact("G","1-45-7"));
        phoneBook.add(new Contact("B","178"));

        System.out.println("---------Alphabetical List of contacts---------");
        phoneBook.print();
        System.out.println();
        System.out.println("Find contact by name: "+phoneBook.find("L"));
        System.out.println("Remove contact by name: "+phoneBook.find("O"));
    }
}
