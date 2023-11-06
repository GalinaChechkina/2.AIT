package practice.library;

public class LibraryImpl implements Library{

    private Book[] books; //массив для нашей библиотеки
    private int size;    //сколько книг в ней находится в настоящее время

    public LibraryImpl(int capacity){
        books =new Book[capacity];  //capacity- сколько всего книг может поместиться  в библиотеку
    }
    @Override
    public boolean addBook(Book book) {
        if (book == null || size == books.length || findBook(book.getISBN()) != null) {
            return false;
        }
        books[size] = book;
        size++;
        return true;
    }

    @Override
    public Book removeBook(int ISBN) {
        for (int i = 0; i < size; i++) {
            if(books[i].getISBN()==ISBN) {
                Book vict = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return vict;
            }
        }
        return null;
    }

    @Override
    public Book findBook(int ISBN) {
        for (int i = 0; i < size; i++) {
            if(books[i].getISBN()==ISBN) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }

    }

    @Override
    public Book[] findBookByAuthor(String author) {
        int count=0;
        for (int i = 0; i < size; i++) {
            if(books[i].getAuthor().equals(author)){
                count++;
            }
        }
        Book[]res=new Book[count];
        for (int i = 0,j=0; j <res.length ; i++) {
            if(books[i].getAuthor().equals(author)){
               res[j++]=books[i];
            }
        }
        return res;
    }
}
