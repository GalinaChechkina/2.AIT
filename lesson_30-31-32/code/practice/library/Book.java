package practice.library;

import practice.cats.Cat;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private int ISBN;
    private String author;
    private String name;
    private String year;

    public Book(int ISBN, String author, String name, String year) {
        this.ISBN = ISBN;
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Book book = (Book) object;

        if (ISBN != book.ISBN) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = ISBN;
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
    //  метод, позволяющий осуществлять сортировку по году издания книги
    //  возвращает целое число
    //  сравнивает текущий объект с объектом Book o

    @Override
    public int compareTo(Book o) {
        int res=this.getYear().compareTo(o.getYear());
        return res;
    }
}
