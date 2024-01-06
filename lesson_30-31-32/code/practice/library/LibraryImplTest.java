package practice.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    Library library;  //заводим библиотеку в классе Library для тестов
    Book[] book;      //заводим массив book типа Book, куда будем складывать наши книги

    @BeforeEach
    void setUp() {
        library= new LibraryImpl(6); //определяем библиотеку размером на 6 книг
        book= new Book[6];                  //и сейчас у нас 6 книг в наличии
        book[0]= new Book(1,"J.Tolkien","The Hobbit or There and Back Again","1937");
        book[1]= new Book(2,"Maria Parr","Vaffelhjarte","2005");
        book[2]= new Book(3,"Khaled Hosseini","Тысяча сияющих солнц","2013");
        book[3]= new Book(4,"Michelle Dean","Нахалки","2021");
        book[4]= new Book(5,"Thomas Mayne Reid","The Boy Tar","1859");
        book[5]= new Book(6,"J.Tolkien","The Lord of the Ring","1954");
        for (int i = 0; i < book.length; i++) {
            library.addBook(book[i]);
        }
        /*for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }*/
    }

    @Test
    void addBook() {
        assertFalse(library.addBook(null)); //не можем класть пустой объект
        assertFalse(library.addBook(book[1]));//не можем класть уже имеющийся объект

        Book book1= new Book(7,"А.С.Пушкин","Kапитанская дочка","1836");
        assertFalse(library.addBook(book1));   //добавили новую книгу
        assertEquals(6,library.quantity());  //теперь книг стало больше

        Book book2= new Book(7,"А.С.Пушкин","Дубровский","1841");
        assertFalse(library.addBook(book2));  //не можем положить книгу, т.к. библиотека забита
    }

    @Test
    void removeBook() {
        assertEquals(book[4],library.removeBook(5));//убрали книгу
        assertEquals(5,library.quantity());  //посчитали количество оставшихся книг
        assertNull(library.removeBook(5)); //не можем убрать уже убранную книгу
        assertNull(library.findBook(5));   //не можем найти уже убранную книгу
    }

    @Test
    void findBook() {
        assertEquals(book[5],library.findBook(6)); //находим книгу по id
        assertNull(library.findBook(12));  //не можем найти книгу по несуществующему id
    }

    @Test
    void quantity() {
        assertEquals(6,library.quantity());
    }

    @Test
    void printBooks() {
        library.printBooks();
    }
    @Test
    void findBookByAuthor(){
        Book[]act=library.findBookByAuthor("J. Tolkien");
        Book[]exp={book[0],book[5]};
        assertArrayEquals(exp,act);
    }

    @Test
    void testBookSort(){
        System.out.println("========== Book Array ==========");
        printArray(book);  //не отсортированный
        System.out.println();
        Arrays.sort(book); //выполнили сортировку по году издания
        System.out.println("========== Sort by year ===========");
        printArray(book);
    }

    @Test
    void testBookSortComparator(){
        System.out.println("=========== Sort by author ==========");
        Comparator<Book> bookComparator= new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        };
        Arrays.sort(book,bookComparator);
        printArray(book);
    }

    public void printArray(Object[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}