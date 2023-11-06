package practice.employee.model;

public class Employee {
    private int id; //внутренний идентификатор в компании
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private boolean gender; //(0-женщина, 1-мужчина

    public Employee(int id, String firstName, String lastName, int age, double salary, boolean gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void display(){
        System.out.println("ID: "+id+"; First name: "+firstName+"; Last name: "+lastName+"; Salary: "+salary+"; Gender: "+(gender? "male ":"female "));
    }
    public void work(){
        System.out.println("Employee is working hard ");
    }
    public void lunch(){
        System.out.println("Employee eating lunch ");
    }
    public void sleep(){
        System.out.println("Employee is sleeping ");
    }
}
