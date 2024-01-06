package practice.movies.dao;

import practice.movies.model.Movie;

import java.time.LocalDate;
import java.util.*;

public class MoviesCollectionImpl implements MoviesCollection<Movie>{

    private Collection<Movie>movies;
    public MoviesCollectionImpl(){
        movies=new ArrayList<>();
    }
    public MoviesCollectionImpl(List<Movie> list) {
        this();
        for (Movie m : list) {
            addMovie(m);
        }
    }

    @Override
    public boolean addMovie(Movie movie) {
        if(movie==null||movies.contains(movie)) {
            return false;
        }
        movies.add(movie);
        return true;
    }

    @Override
    public Movie removeMovie(long imdb) {
        Movie victim=findById(imdb);
        if(victim==null){
            return null;
        }
        movies.remove(victim);
        return victim;
    }

    @Override
    public Movie findById(long imdb) {
        for (Movie m : movies) {
            if (m.getImdb() == imdb) {
                return m;
            }
        }
        return null;
    }

    @Override
    public Iterable<Movie> findByGenre(String genre) {
        List<Movie> listG = new ArrayList<>();
        for (Movie m : movies) {
            if(m.getGenre().equals(genre)) {
                listG.add(m);
            }
        }
        return listG;
    }

    @Override
    public Iterable<Movie> findByDirector(String director) {
        List<Movie> listD = new ArrayList<>();
        for (Movie m : movies) {
            if(m.getDirector().equals(director)) {
                listD.add(m);
            }
        }
        return listD;
    }

    @Override
    public Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from, LocalDate to) {
        List<Movie> listBetweenDates = new ArrayList<>();
        Movie f=new Movie(Integer.MIN_VALUE,null,null,null,from);
        Movie t=new Movie(Integer.MAX_VALUE,null,null,null,to);
        for (Movie m : movies) {
            if(m.getDate().compareTo(f.getDate())>=0&&m.getDate().compareTo(t.getDate())<=0) {
                listBetweenDates.add(m);
            }
        }
        return listBetweenDates;
    }

    @Override
    public int totalQuantity() {
        return movies.size();
    }

    @Override
    public Iterator<Movie> iterator() {
        return movies.iterator();
    }
}
