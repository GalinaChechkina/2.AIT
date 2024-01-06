package practice.students;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class DekanatAppl {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();

        Student[]students=new Student[10];
        students[0]=new Student(1,"A","A",now.minusYears(23),6,"6-N1","A","m", 5, 4, 3,5,5,4,5,3);
        students[1]=new Student(2,"B","B",now.minusYears(18),1,"1-N5","B","f",5, 5, 5,5,5,5,5,5);
        students[2]=new Student(3,"C","C",now.minusYears(19),2,"2-N1","C","o",3, 4, 3,3,5,4,5,4);
        students[3]=new Student(4,"D","C",now.minusYears(21),5,"5-N2","D","m",4, 4, 4,5,5,4,5,5);
        students[4]=new Student(5,"E","D",now.minusYears(35),3,"3-N3","A","m",5, 4, 3,5,5,4,5,3);
        students[5]=new Student(6,"G","E",now.minusYears(87),4,"4-N4","B","f",5, 5, 5,5,5,5,5,5);
        students[6]=new Student(7,"H","G",now.minusYears(23),6,"6-N1","C","f",3, 4, 3,3,5,4,3,3);
        students[7]=new Student(8,"I","I",now.minusYears(22),6,"6-N2","D","f",4, 4, 4,4,4,4,4,4);
        students[8]=new Student(9,"A","J",now.minusYears(30),1,"1-N1","A","m",3, 4, 3,5,5,4,3,4);
        students[9]=new Student(10,"B","A",now.minusYears(23),2,"2-N3","B","m",5, 3, 3,3,3,3,3,3);
        List<Student>studentList=new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            studentList.add(students[i]);
        }
        System.out.println("List of all students: ");
        studentList.forEach(student -> System.out.println(student));

        printListCourseSortByNameAndAge(studentList,6);
        printListGroupSortByNameAndAge(studentList,"6-N1");
        calcStudentsByGender(studentList,"m");
        calcStudentsByGender(studentList,"f");
        calcAverageAge(studentList);
        calcAverageAgeGroup(studentList,1);
        studentRating(studentList);
    }

    private static void studentRating(List<Student> studentList) {
        System.out.println("----------------------------------------");
//        Map<Integer,List<Programmer>>map= programmers.stream()
//                .collect(Collectors.groupingBy(p->p.getTechnologies().length));
//        Integer max=map.keySet().stream()
//                .max(Integer::compareTo).orElse(0);
//        map.get(max).forEach(System.out::println);
        Map<Double,List<Student>>map=new HashMap<>();
                studentList.stream()
                .map(student -> rating(student))
                .sorted((s1,s2)->Double.compare(s2,s1))
                        .collect(Collectors.toList())

                .forEach(System.out::println);
    }

    private static Double rating(Student student) {
        int[]arr= student.getMarks();
        double res= Arrays.stream(arr).average()
                .getAsDouble();
        return res;
    }

    private static void calcAverageAgeGroup(List<Student> studentList, int i) {
        System.out.println("----------------------------------------");
        double averageAge = studentList.stream()
                .filter(s->s.getCourse()==i)
                .mapToInt(Student::getAge)
                .summaryStatistics()
                .getAverage();
        System.out.print("Average Age of group "+i+" students: " + averageAge);
        System.out.println();
    }

    private static void calcAverageAge(List<Student> studentList) {
        System.out.println("----------------------------------------");
        double averageAge = studentList.stream()
                .mapToInt(Student::getAge)
                .summaryStatistics()
                .getAverage();
        System.out.print("Average Age of all students: " + averageAge);
        System.out.println();
    }

    private static void calcStudentsByGender(List<Student> studentList, String m) {
        System.out.println("----------------------------------------");
        double count = studentList.stream()
                .filter(s->s.getGender().equalsIgnoreCase(m))
                .count();
        System.out.print("Total students with gender " +m+ " : " + count);
        System.out.println();
    }

    private static void printListGroupSortByNameAndAge(List<Student> studentList, String s) {
        System.out.println("---------Group "+s+"  sorted by lastname and age-------------------------------");
        studentList.stream()
                .filter(st->st.getGroupNum().equalsIgnoreCase(s))
                .sorted(Comparator.comparing(Student::getLastName)
                        .thenComparing(Student::getBirthDay))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void printListCourseSortByNameAndAge(List<Student> studentList, int i) {
        System.out.println("----------Course "+i+"  sorted by name and age------------------------------");
        studentList.stream()
                .filter(s->s.getCourse()==i)
                .sorted(Comparator.comparing(Student::getLastName)
                        .thenComparing(Student::getBirthDay))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}
