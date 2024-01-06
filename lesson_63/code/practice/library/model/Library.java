package practice.library.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Map<Book,List<Review>> bookReviews; //библиотека будет Мар с ключом (книгой) и значением (списком отзывов)

    public Library(){ //пустой конструктор
        this.bookReviews=new HashMap<>();
    }

    public boolean addBook(Book book){ //добавим книги, как ключ в Мар
        bookReviews.put(book,new ArrayList<>());
        return true;
    }

    public boolean addReview(Book book, Review review){
        if(bookReviews.containsKey(book)){ //если такая книга есть, то
            bookReviews.get(book).add(review); //добавим к ней отзыв (по ключу)
            return true;
        }
        return false;
    }
    public void printBookReviews(Book book){
        if(bookReviews.containsKey(book)){
            ArrayList<Review>reviews= (ArrayList<Review>) bookReviews.get(book); //взяли список отзывов из Мар
            System.out.println(book.getName()+":");
            for (Review r:reviews){
                System.out.println("Rating: "+r.getRating());
                System.out.println("Comment: "+r.getComment());
            }
        } else {
            System.out.println("Attention! Our library does not have this book.");
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Library{");
        sb.append("bookReviews=").append(bookReviews);
        sb.append('}');
        return sb.toString();
    }
}
