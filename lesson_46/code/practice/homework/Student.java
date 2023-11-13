package practice.homework;

public class Student implements Comparable<Student> {
    private int id;
    private String lastName;
    private String firstName;
    private double rating;

    public Student(int id, String lastName, String firstName, double rating) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        int res=(int) (this.rating-o.rating);
        return res!=0? res:Integer.compare(this.id,o.id);
    }
}
