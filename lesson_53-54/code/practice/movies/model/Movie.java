package practice.movies.model;

import java.time.LocalDate;

public class Movie {
    private long imdb;
    private String title;
    private String director;
    private String genre;
    private LocalDate date;

    public Movie(long imdb, String title, String director, String genre, LocalDate date) {
        this.imdb = imdb;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.date = date;
    }

    public long getImdb() {
        return imdb;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("imdb: ").append(imdb);
        sb.append("   title: '").append(title).append('\'');
        sb.append("   director: '").append(director).append('\'');
        sb.append("   genre: '").append(genre).append('\'');
        sb.append("   date: ").append(date);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        return imdb == movie.imdb;
    }

    @Override
    public int hashCode() {
        return (int) (imdb ^ (imdb >>> 32));
    }
}
