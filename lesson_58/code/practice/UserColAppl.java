package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UserColAppl {
    public static void main(String[] args) {

        List<UserCol>userColList= Arrays.asList(
                new UserCol("Aob", 15),
                new UserCol("Alex", 22),
                new UserCol("Eve", 19),
                new UserCol("Anna", 16),
                new UserCol("John", 28),
                new UserCol("Ali", 45)
        );
        userColList.forEach(s-> System.out.println(s));
        System.out.println("------------------------");

        List<UserCol>list18=findUserByPredicate(userColList,s-> s.getAge()>=18 && s.getAge()<=25);
        list18.forEach(s-> System.out.println(s));
        System.out.println("------------------------");

        List<UserCol>list30=findUserByPredicate(userColList,s-> s.getAge()<30 && s.getName().startsWith("A"));
        list30.forEach(s-> System.out.println(s));
        System.out.println("------------------------");


    }

    private static List<UserCol> findUserByPredicate(List<UserCol> userColList, Predicate<UserCol>predicate) {
        List<UserCol>resList= new ArrayList<>();
        for (UserCol u:userColList) {
             if (predicate.test(u)){
                 resList.add(u);
             }
        }
        return resList;
    }
}
