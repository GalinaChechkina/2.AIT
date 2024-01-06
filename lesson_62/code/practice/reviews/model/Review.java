package practice.reviews.model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Random;

public class Review implements Comparable<Review>{
    String comment;
    private long id;
    int rating;
    final String author;
    String product;
    int likes;
    LocalDateTime date;

    public Review(String comment, long id, int rating, String author, String product, int likes, LocalDateTime date) {
        this.comment = comment;
        this.id = id;
        this.rating = rating;
        this.author = author;
        this.product = product;
        this.likes = likes;
        this.date = date;
    }

    //мы можем делать конструктор по одним полям, а внутрь помещать способ создания и других полей
    //здесь создаем лайки, для которых ниже будет метод их генерирования
    public Review(int rating, String comment, String author, String product) {
        this.rating = rating;
        this.comment = comment;
        this.author = author;
        this.likes=getLikes();
        this.product = product;

    }

    public long getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getAuthor() {
        return author;
    }

    public String getProduct() {
        return product;
    }

    public int getLikes() {
        Random random=new Random();
        return random.nextInt(10 ,51);
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review{" +
                "comment='" + comment + '\'' +
                ", rating=" + rating +
                ", likes" + likes +
                ", author='" + author + '\'' +
                ", product='" + product + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return id == review.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int addLike(){
        return likes++;
    }

    //сделали ДВА метода сравнения в самом классе (по лайкам и рейтингу)
    public int compareTo(Review other) {
        // Compare based on the number of likes
        return Integer.compare(other.likes, this.likes);
    }

    public int compareToRating(Review o) {
        return this.rating-(o.rating);
    }
}