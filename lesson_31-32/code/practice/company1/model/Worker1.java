package practice.company1.model;

public class Worker1 extends Employee1 {
    private int grade;

    public Worker1(int id, String firstName, String lastName, int age, double hours, int grade) {
        super(id, firstName, lastName, age, hours);
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary=grade*hours;
        return salary;
    }
}
