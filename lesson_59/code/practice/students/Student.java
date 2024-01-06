package practice.students;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Student {
 //По аналогии с классом User создать класс Student с полями:
 // id, firstName, lastName, birthDay, course, groupNum (номер группы), country, gender(пол).
 // В приложении DekanatAppl создать студентов из разных стран,
 // которые учатся на разных курсах, в разных группах. Сделать списки студентов по курсам,
 // по группам, отсортированные по фамилиям и возрасту. Сколько студентов мужчин?
 // Сколько женщин? Какой у них средний возраст по курсу? По всем студентам?
 // Дополнительное задание (**): добавить у каждого студента поле int[] marks
 // с его оценками и рассчитать средний балл.

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private int course;
    private String groupNum;
    private String country;
    private String gender;
    private int[] marks;


    public Student(int id, String firstName, String lastName, LocalDate birthDay, int course, String groupNum, String country, String gender,int... marks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.course = course;
        this.groupNum = groupNum;
        this.country = country;
        this.gender = gender;
        this.marks = marks;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getAge(){
        int age = (int) ChronoUnit.YEARS.between(birthDay, LocalDate.now());
        return age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", birthDay=").append(birthDay);
        sb.append(", course=").append(course);
        sb.append(", groupNum='").append(groupNum).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", marks='").append(Arrays.toString(marks)).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
