package practice.movies.dao;

import java.time.LocalDate;

public interface MoviesCollection<Movie> extends Iterable<Movie> {
    boolean addMovie(Movie movie);
    Movie removeMovie(long imdb);
    practice.movies.model.Movie findById(long imdb);
    Iterable<Movie> findByGenre(String genre);
    Iterable<Movie> findByDirector(String director);
    Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from,LocalDate to);
    int totalQuantity();


}
