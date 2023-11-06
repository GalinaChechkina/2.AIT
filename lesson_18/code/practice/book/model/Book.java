package practice.book.model;

public class Book {
//Создайте класс Book с полями: название - title автор - author год издания - year уникальный номер - ISBN
// В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display,
// который выводит информацию о книге.Создайте класс Dictionary, который расширяет класс Book.
// Предложите для него набор полей и переопределите метод display.
// В классе BookAppl в методе main создайте несколько словарей и выведите информацию о них в консоль.

    private long ISBN;
    private int year;
    private String title;
    private String author;

    public Book(long ISBN, int year, String title, String author) {
        this.ISBN = ISBN;
        this.year = year;
        this.title = title;
        this.author = author;
    }

    public long getISBN() {
        return ISBN;
    }
    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void display(){
        System.out.println("ISBN: "+ISBN+"  Book author: "+author+"  Book title: "+title+"  Year of publishing: "+year);
    }
}
