package practice.reviews.dao;

import practice.reviews.model.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class RatingsImpl implements Ratings{

    Collection<Review> reviews;

    public RatingsImpl(){ // пустой конструктор для ревью- наши ревью будут ArrayList
        reviews=new ArrayList<>();
    }

    @Override
    public boolean add(Review review) {
        return review!=null && reviews.add(review);
    }

    @Override
    public boolean remove(Long id) {
        Review removed=findById(id);
        if(removed !=null){
            reviews.remove(removed);
            return true;
        }
        return false;
    }
    public Review findById(Long id){
        for(Review p:reviews){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean update(Long id, int newRating) {
        Review review = findById(id);
        if (review == null) {
            return false;
        }
        review.setRating(newRating);
        return true;
    }

    @Override
    public Iterable<Review> getReviewsByProduct(String product) {
        return reviews.stream().filter(p->p.getProduct().equalsIgnoreCase(product)).collect(Collectors.toList());
    }

    @Override
    public Iterable<Review> getReviewsByAuthor(String author) {
        return reviews.stream().filter(p->p.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }

    @Override
    public double getAvgRatingByProduct(String product) {
//        List<Review> productReviews = reviews.stream()
//                .filter(review -> review.getProduct().equals(product))
//                .collect(Collectors.toList());
//
//        int ratingSum = productReviews.stream()
//                .mapToInt(Review::getRating)
//                .sum();
//
//        return productReviews.size() > 0 ? (double) ratingSum / productReviews.size() : 0.0;//если отзывов нет, то рейтинг 0, иначе делим сумму рейтингов на количество отзывов
        return reviews.stream()
                .filter(review -> review.getProduct().equals(product))
                .mapToDouble(Review::getRating)
                .average()
                .orElse(0.0);
    }

    @Override
    public Iterable<Review> getReviewsWithMaxLikes() {
        int maxLike = reviews.stream()
                .mapToInt(Review::addLike)
                .max()
                .orElse(0);
        return reviews.stream()
                .filter(c -> c.addLike()>=maxLike)
                .collect(Collectors.toList());

    }
}