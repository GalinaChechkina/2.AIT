package practice.students.model;

public class Students {

    private int id;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String speciality;

    public Students(int id, String firstName, String lastName, int yearOfBirth, String speciality) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.speciality = speciality;
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
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void display(){
        System.out.println("ID: "+id+"; First Name "+firstName+"; Last Name: "+lastName+"; Year of birth: "+yearOfBirth+"; Student's specialization: "+speciality);
    }
    public void stud(String lastName){
        System.out.println("Student "+lastName+" studies. ");
    }
    public void academ(String lastName){
        System.out.println("Student "+lastName+" went on academic leave. ");
    }
    public void leave(String lastName){
        System.out.println("Student "+lastName+" is skipping Uni. ");
    }
    public void sick(String lastName){
        System.out.println("Student "+lastName+" got sick today. ");
    }
    public void exam(String lastName){
        System.out.println("Student "+lastName+" passes exam. ");
    }
    public static void split(){
        System.out.println("-----------------------------------------------------------");
    }
}
