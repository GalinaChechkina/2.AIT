package practice.users;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserAppl {

    public static void main(String[] args) {

        User[] users = new User[8];

        users[0] = new User(1, "Michael", "Jackson", 37, "TR");
        users[1] = new User(2, "Mary", "Curie", 21, "EN");
        users[2] = new User(3, "John", "Connor", 17, "FR");
        users[3] = new User(4, "Jennifer", "Lopez", 77, "TR");
        users[4] = new User(5, "William", "Shakespeare", 23, "US");
        users[5] = new User(6, "Sue", "Farrington", 16, "IT");
        users[6] = new User(7, "Michael", "Thomson", 37, "EN");
        users[7] = new User(8,"Bill", "Murray", 56, "EN");

        List<User> userList = new ArrayList<>();
        for (int i = 0; i < users.length; i++) {
            userList.add(users[i]);
        }
        printUsers(userList);
        printUsersInitials(userList);
        printUsersSortedByAge(userList);
        printUsersSortedByAgeAndNames(userList);
        calcUsersAvgAge(userList);
        isAgeMore18(userList, 18);
        calcUserByCountries(userList);

    }

    private static void calcUserByCountries(List<User> userList) {
        System.out.println("----------------------------------------");
        long countDifferentCountries = userList.stream()
                .map(User::getCountry)
                .distinct()//исключили повторы
                .count();//посчитали количество
        System.out.println("Number of Countries: " + countDifferentCountries);
    }

    private static void isAgeMore18(List<User> userList, int age) {
        int checkAge = age;
        System.out.println("----------------------------------------");
        boolean isAgeMore18 = userList.stream()
                .allMatch(user -> user.getAge() > checkAge);
        System.out.println("Are all users grate than " + checkAge + " : " + isAgeMore18);
    }

    private static void calcUsersAvgAge(List<User> userList) {
        System.out.println("----------------------------------------");
        double averageAge = userList.stream()
                .mapToInt(User::getAge)
                .summaryStatistics()
                .getAverage();
        System.out.print("averageAge: " + averageAge);
        System.out.println();
    }

    private static void printUsersSortedByAgeAndNames(List<User> userList) {
        System.out.println("----------------------------------------");
        userList.stream()
                .map(u -> {
                    return new User(
                            u.getId(),
                            u.getFirstName().charAt(0) + ".",
                            u.getLastName().charAt(0) + ".",
                            u.getAge(),
                            u.getCountry());
                })
                .sorted(Comparator.comparing(User::getAge)
                        .thenComparing(User::getLastName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void printUsersSortedByAge(List<User> userList) {
        System.out.println("----------------------------------------");
        userList.stream()
                .map(u -> {
                    return new User(
                            u.getId(),
                            u.getFirstName().charAt(0) + ".",
                            u.getLastName().charAt(0) + ".",
                            u.getAge(),
                            u.getCountry());
                })
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    private static void printUsersInitials(List<User> userList) {
        System.out.println("----------------------------------------");
        userList.stream()
                .map(u -> {
                    return new User(
                            u.getId(),
                            u.getFirstName().charAt(0) + ".",
                            u.getLastName().charAt(0) + ".",
                            u.getAge(),
                            u.getCountry());
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void printUsers(List<User> userList) {
        System.out.println("------------------------------------------");
        userList.stream()
                .forEach(System.out::println);

    }

}