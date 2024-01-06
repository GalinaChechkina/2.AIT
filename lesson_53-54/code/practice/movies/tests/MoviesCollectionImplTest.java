package practice.movies.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.citizens.model.Person;
import practice.movies.dao.MoviesCollection;
import practice.movies.dao.MoviesCollectionImpl;
import practice.movies.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoviesCollectionImplTest {

    MoviesCollection moviesCollection;
    static final LocalDate now=LocalDate.now();
    @BeforeEach
    void setUp(){
        moviesCollection= new MoviesCollectionImpl(List.of(
        new Movie(1, "A", "A", "A", now.minusYears(3)),
                new Movie(2, "B", "B", "B", now.minusYears(4)),
                new Movie(3, "C", "C", "C", now.minusYears(1)),
                new Movie(4, "D", "D", "D", now.minusYears(2)),
                new Movie(5, "E", "E", "E", now.minusYears(7))
        ));

    }

    @Test
    void testConstructor(){
        moviesCollection=new MoviesCollectionImpl(List.of(
                new Movie(1,"T1","G1","D1",now),
                new Movie(1,"T1","G1","D1",now)
        ));
        assertEquals(1,moviesCollection.totalQuantity());
    }


    @Test
    void addMovie() {
        assertFalse(moviesCollection.addMovie(null));
        assertFalse(moviesCollection.addMovie(new Movie(1, "A", "A", "A", now.minusYears(3))));
        assertEquals(5,moviesCollection.totalQuantity());
        assertTrue(moviesCollection.addMovie(new Movie(6, "F", "F", "F", now.minusYears(9))));
        assertEquals(6,moviesCollection.totalQuantity());

    }

    @Test
    void removeMovie() {
        assertNull(moviesCollection.removeMovie(6));
        assertEquals(5,moviesCollection.totalQuantity());
        assertEquals(new Movie(5, "E", "E", "E", now.minusYears(7)),moviesCollection.removeMovie(5));

    }

    @Test
    void findById() {
        Movie movie = moviesCollection.findById(1);
        assertEquals(1, movie.getImdb());
        assertEquals("A", movie.getTitle());
        assertEquals("A", movie.getDirector());
        assertEquals("A" , movie.getGenre());
        assertNull(moviesCollection.findById(10));

    }

    @Test
    void findByGenre() {
        Iterable<Movie> movies = moviesCollection.findByGenre("B");

        List<Movie> actual = new ArrayList<>();
        for (Movie m : movies) {
            actual.add(m);
        }
        List<Movie> expected = List.of (
                new Movie(2, "B", "B", "B", now.minusYears(4))
        );
        assertIterableEquals(expected, actual);
    }

    @Test
    void findByDirector() {
        Iterable<Movie> movies = moviesCollection.findByDirector("C");

        List<Movie> actual = new ArrayList<>();
        for (Movie m : movies) {
            actual.add(m);
        }
        List<Movie> expected = List.of (
                new Movie(3, "C", "C", "C", now.minusYears(1))
        );
        assertIterableEquals(expected, actual);
    }

    @Test
    void findMoviesCreatedBetweenDates() {
        LocalDate from=LocalDate.now().minusYears(4);
        LocalDate to=LocalDate.now();

        Iterable<Movie> movies = moviesCollection.findMoviesCreatedBetweenDates(from,to);
        List<Movie> actual = new ArrayList<>();
        for (Movie m : movies) {
            actual.add(m);
        }
        List<Movie> expected = List.of (
                new Movie(1, "A", "A", "A", now.minusYears(3)),
                new Movie(2, "B", "B", "B", now.minusYears(4)),
                new Movie(3, "C", "C", "C", now.minusYears(1)),
                new Movie(4, "D", "D", "D", now.minusYears(2))
        );
        assertIterableEquals(expected, actual);
    }

    @Test
    void totalQuantity() {
        assertEquals(5,moviesCollection.totalQuantity());

    }

    @Test
    void iterator() {
        moviesCollection.iterator();
    }
}