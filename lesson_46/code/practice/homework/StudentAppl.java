package practice.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentAppl {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"F","n1",1400));
        studentList.add(new Student(2,"E","n2",2200));
        studentList.add(new Student(3,"D","n3",3300));
        studentList.add(new Student(4,"C","n4",2200));
        studentList.add(new Student(5,"B","n5",5010));
        studentList.add(new Student(6,"A","n6",4000));
        studentList.forEach(s-> System.out.println(s+" "));
        System.out.println("----------------------------------------");

        studentList.sort((s1, s2) -> s1.compareTo(s2));
        studentList.forEach(s-> System.out.println(s+" "));
        System.out.println("----------------------------------------");
        Comparator<Student>comparator= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        };
        studentList.sort(comparator);
        studentList.forEach(s-> System.out.println(s+" "));
        System.out.println("----------------------------------------");

        double res=0;
        int count=0;
        for (Student s:studentList) {
            res+=s.getRating();
            count++;
        }
        System.out.println("Total reiting: "+res+"  Average reiting: "+res/count);
    }
}
