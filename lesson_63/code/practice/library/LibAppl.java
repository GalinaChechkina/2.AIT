package practice.library;

import practice.library.model.*;
import practice.library.model.Book;
import practice.library.model.Library;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class LibAppl {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1=new Book("A","A",1980,true);
        Book book2=new Book("B","B",2015,false);
        Book book3=new Book("C","C",2000,false);
        Book book4=new Book("D","C",1880,true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        Review review1= new Review(5,"AAAAAA");
        Review review2= new Review(4,"bbbbbb");
        Review review3= new Review(2,"ccccccc");
        Review review4= new Review(3,"ddddddd");
        Review review5= new Review(5,"eeeeeee");

        library.addReview(book1,review1);
        library.addReview(book1,review5);
        library.addReview(book2,review3);
        library.addReview(book3,review2);
        library.addReview(book4,review4);

        library.printBookReviews(book1);
        library.printBookReviews(book2);
        library.printBookReviews(book3);
        library.printBookReviews(book4);

//        System.out.println("------------Activities----------");
//        library.getReaders().forEach(System.out::println);
//
//        System.out.println("------------Books Unsorted----------");
//        library.getBooks().forEach(System.out::println);
//
//        System.out.println("------------Books sorted----------");
//        List<Book> listByYearIssue = library.getBooks().stream()
//                .sorted(Comparator.comparing(Book::getIssueYear))
//                .toList();
//        listByYearIssue.forEach(System.out::println);
//
//        System.out.println("------------Mailing List All Users----------");
////        ArrayList<Email>listEmail=new ArrayList<>();
////        for (Reader r: library.getReaders()) {
////             listEmail.add(new Email(r.getEmail()));
////        }
////        for (Email e:listEmail) {
////            System.out.println(e);
////        }
//        List<Email> addresses = library.getReaders().stream()
//                .map(Reader::getEmail)
//                .map(Email::new)
//                .toList();
//        addresses.forEach(System.out::println);
//
//        System.out.println("------------Mailing List Subscribed Users----------");
//        //        List<Email> addressesSubscribed = new ArrayList<>();
////        for (Reader reader : library.getReaders()){
////            if (reader.getBooks().size() >=  && reader.isSubscriber())
////                addressesSubscribed.add(new Email(reader.getEmail()));
////        }
////        addressesSubscribed.forEach(System.out::println);
//        List<Email> addressesSubscribed = library.getReaders().stream()
//                .filter(Reader::isSubscriber)
//                .filter(r -> r.getBooks().size() >= 1)
//                .map(Reader::getEmail)
//                .map(Email::new)
//                .toList();
//        addressesSubscribed.forEach(System.out::println);
//
//        System.out.println("------------List of Book----------");
////        Set<Book> list=new HashSet<>();
////        for (Reader r: library.getReaders() ) {
////            list.addAll(r.getBooks());
////        }
////        list.forEach(System.out::println);
//        List<Book> list = library.getReaders().stream()
//                .flatMap(r -> r.getBooks().stream())
//                .distinct()
//                .toList();
//        list.forEach(System.out::println);
//
//        System.out.println("------------Max books rented----------");
//        int maxBooks=library.getReaders().stream()
//                .mapToInt(r->r.getBooks().size())
//                .max()
//                .orElse(0);
//        System.out.println(maxBooks);
//
////        int max=0; //2 способ
////        for (Reader r: library.getReaders() ) {
////            if(r.getBooks().size()>max){
////                max=r.getBooks().size();
////            }
////        }
////        System.out.println(max);
//
////        Integer res = library.getReaders().stream() //3 способ
////                .map(reader -> reader.getBooks().size())
////                .reduce(0, (max, size) -> size > max ? size : max);
////        System.out.println(res);
//
////        Map<Integer, Reader> mapReader = library.getReaders().stream()
////                .collect(Collectors.toMap(
////                        reader -> reader.getBooks().size(),
////                        reader -> reader
////                ));
//        //System.out.println(mapReader.entrySet());
//
//        Map<String, List<Email>> result = new HashMap<>();// Соберем всех пользователей, которые взяли более 2-х книг в группу "TO_MUCH", остальных
//        // в группу с ключем "OK"
//        for (Reader reader : library.getReaders()) {
//            if (reader.isSubscriber()) {
//                if (reader.getBooks().size() > 2) {
//                    if (!result.containsKey("TOO_MUCH")) {
//                        result.put("TOO_MUCH", new ArrayList<>());
//                    }
//                    result.get("TOO_MUCH").add(new Email(reader.getEmail()));
//                } else {
//                    if (!result.containsKey("OK")) {
//                        result.put("OK", new ArrayList<>());
//                    }
//                }
//            }
//            for (String key:result.keySet()) {
//                System.out.println("key"+key+"value"+result.get(key));
//            }
//            System.out.println();
//            System.out.println(result.entrySet());
//        }
//
//        System.out.println("-----------------------------------");
//        Map<String, List<Email>> map =library.getReaders().stream()
//                .filter(Reader::isSubscriber)
//                .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
//                mapping(r -> new Email(r.getEmail()), Collectors.toList())));
//        System.out.println(map.entrySet());
//
//        boolean check=checkBook(library,"George Orwell");
//        System.out.println(check);
//
//    }
//
//    private static boolean checkBook(Library library,String author){
//        boolean match=library.getReaders().stream()
//                .flatMap(reader -> reader.getBooks().stream())
//                .anyMatch(book -> author.equals(book.getAuthor()));//логическое сравнение (находит хотя бы одну истину)
//        return match;
    }
}
