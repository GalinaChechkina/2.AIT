package practice.model;

public class Manager extends Employee{
    private double baseSalary;
    private int grade;

    public Manager(int id, String firstName, String lastName, int age, double hours,
                   int workExp,String education, double baseSalary, int grade) {
        super(id, firstName, lastName, age, hours, workExp, education);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = baseSalary + grade * hours;
        return salary;
    }
}
