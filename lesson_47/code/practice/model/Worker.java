package practice.model;

public class Worker extends Employee{
    private double grade;

    public Worker(int id, String firstName, String lastName, int age, double hours,
                  int workExp,String education, double grade) {
        super(id, firstName, lastName, age, hours, workExp, education);
        this.grade = grade;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    @Override
    public double calcSalary() {
        double salary = hours * grade;
        return salary;
    }
}
