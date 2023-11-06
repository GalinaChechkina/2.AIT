package practice.book;

import practice.book.model.Book;
import practice.book.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
        Book book=new Book(0,1997," Harry Potter and the Philosopher's Stone "," J.K. Rowling ");
        Dictionary a1=new Dictionary(1,1960," Толковый словарь ", " С.И. Ожегов ","толковый",true);
        Dictionary a2=new Dictionary(2,2000," Русско-немецко-английский словарь ", " И.А. Сухарь ","лингвистический",true);
        Dictionary a3=new Dictionary(3,1907," Энциклопедический словарь ", " Ф.А. Брокгауз, И.А. Ефрон ","энциклопедический",false);

        book.display();
        a1.display();
        a2.display();
        a3.display();

    }
}
