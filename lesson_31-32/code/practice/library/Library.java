package practice.library;

public interface Library {
    //  Cоздаем класс Book c полями ISBN, автор, название книги, год издания;
    //  Cоздаем интерфейс Library с методами:
    //  - добавить книгу;
    //  - удалить книгу;
    //  - найти книгу;
    //  - кол-во книг;
    //  - напечатать список книг.
    //  Cоздаем класс LibraryImpl, который implements Library;
    //  Cоздаем класс LibraryImplTest, в котором создаем тесты для вышеперечисленных методов.

    boolean addBook(Book book);
    Book removeBook(int ISBN);
    Book findBook(int ISBN);
    int quantity();
    void printBooks();
    Book[] findBookByAuthor(String author);
}
