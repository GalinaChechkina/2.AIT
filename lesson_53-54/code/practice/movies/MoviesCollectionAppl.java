package practice.movies;

import practice.movies.dao.MoviesCollectionImpl;
import practice.movies.model.Movie;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class MoviesCollectionAppl {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        MoviesCollectionImpl moviesCollection=new MoviesCollectionImpl(List.of(
                new Movie(1,"Oppenheimer","Christopher Nolan","thriller",now.minusYears(0)),
                new Movie(2,"The Eight Mountains","Felix van Groeningen and Charlotte Vandermeersch","drama",now.minusYears(1)),
                new Movie(3,"Finch","Miguel Sapochnik","science fiction",now.minusYears(2)),
                new Movie(4,"Holidate","John Whitesell","romantic comedy",now.minusYears(3)),
                new Movie(5,"Fantastic Beasts: The Crimes of Grindelwald","David Yates","fantasy",now.minusYears(5)),
                new Movie(6,"Now You See Me","Louis Leterrier","thriller",now.minusYears(10)),
                new Movie(7,"Pirates of the Caribbean: The Curse of the Black Pearl","Gregor Verbinski","adventure film",now.minusYears(20))));
        System.out.println("-------------------Our film collection-----------------");
        print(moviesCollection);

        Iterable<Movie> lastMovies=moviesCollection.findMoviesCreatedBetweenDates(now.minusYears(5),now);
        System.out.println("--------List of films produced in the last 5 years-----");
        print(lastMovies);
    }
    public static void print(Iterable<Movie> movies){
        for (Movie m:movies) {
            System.out.println(m);
        }
        System.out.println();
    }
}
