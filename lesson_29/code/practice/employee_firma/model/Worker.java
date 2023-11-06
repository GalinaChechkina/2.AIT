package practice.employee_firma.model;

public class Worker extends Employee{
    private int grade;

    public Worker(int id, String firstName, String lastName, int age, double hours, int grade) {
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
