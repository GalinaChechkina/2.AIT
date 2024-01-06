package practice.reviews;

import practice.reviews.dao.Ratings;
import practice.reviews.dao.RatingsImpl;
import practice.reviews.model.Review;

import java.util.*;
import java.util.stream.Collectors;

/*Рассчитайте рейтинг продуктов на основании оценок в отзывах на эти продукты.
        Получите также:
        - список продуктов, отсортированный по их рейтингу;
        - список продуктов, отсортированный по количеству отзывов на них;
        - список авторов, отсортированный по количеству лайков под их отзывами.*/
public class ReviewsAppl {
    public static void main(String[] args) {
        Random random=new Random();
        Ratings ratings=new RatingsImpl();
        ArrayList<Review> reviews = new ArrayList<>();
        reviews.add(new Review(random.nextInt(1,11),"Fine","Cat","Tomato" ));
        reviews.add(new Review(random.nextInt(1,11),"Bad","Cat","Tomato" ));
        reviews.add(new Review(random.nextInt(1,11),"very recommended","Si","Tomato" ));
        reviews.add(new Review(random.nextInt(1,11),"Fresh and nice","Tine","Orange" ));
        reviews.add(new Review(random.nextInt(1,11),"very good","Cat","Orange" ));
        reviews.add(new Review(random.nextInt(1,11),"fine","Kim","Orange" ));
        reviews.add(new Review(random.nextInt(1,11),"Fresh","Kim","Tomato" ));
        reviews.add(new Review(random.nextInt(1,11),"delivery was too late","Kim","Potato" ));
        reviews.add(new Review(random.nextInt(1,11),"tasty","Tine","Potato" ));
        reviews.add(new Review(random.nextInt(1,11),"tasty","Stark","Pizza" ));
        reviews.add(new Review(random.nextInt(1,11),"too hot","Dave","Pizza" ));


        System.out.println("-------------Print List-------------");
        reviews.forEach(System.out::println);


        System.out.println("-------Sorting by rating---------");
//        reviews.stream().sorted(Review::compareToRating).forEach(System.out::println);
//        reviews.stream()
//               .sorted((s1,s2)->Double.compare(getAvgRatingByProduct(reviews,s2.getProduct()),getAvgRatingByProduct(reviews,s1.getProduct())))
//                                .forEach(System.out::println);

        Map<Double, List<Review>> mapAvgRat = reviews.stream()
                .collect(Collectors.groupingBy(s->getAvgRatingByProduct(reviews, s.getProduct())));

        mapAvgRat.entrySet().stream()
                .sorted(Map.Entry.<Double, List<Review>>comparingByKey().reversed())//сортируем по ключу Map по убыванию
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


        System.out.println("-------Sorting by comment---------");
        Map<String, Long> productFrequency = reviews.stream()
                .collect(Collectors.groupingBy(Review::getProduct, Collectors.counting()));
        System.out.println(productFrequency);//Результат группировки
        System.out.println();
        productFrequency.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())//Сортируем по значению Map по убыванию
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


        System.out.println("---------- Get Avg Rating -----------");
        System.out.println( getAvgRatingByProduct(reviews,"Pizza"));


        System.out.println("-------Sorting by likes---------");
        reviews.stream().sorted(Review::compareTo).forEach(System.out::println); // проверка что бы понять правильный ли список авторов отсортированный по лайкам
        reviews.stream()
                .sorted(Review::compareTo)
                .map(Review::getAuthor).distinct().
                forEach(System.out::println);

    }

    public static double getAvgRatingByProduct(ArrayList<Review> reviews, String product) {
        return reviews.stream()
                .filter(review -> review.getProduct().equals(product))
                .mapToDouble(Review::getRating)
                .average()
                .orElse(0.0);
    }
}