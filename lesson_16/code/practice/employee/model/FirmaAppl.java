package practice.employee.model;

public class FirmaAppl {
    public static void main(String[] args) {
        Employee empl1= new Employee(1," John "," Smith ",36,24000, true );
        Employee empl2= new Employee(2," Mary "," Poppins ",35,24000, false);
        empl1.display();
        empl2.display();
        double totalSalary=empl1.getSalary()+ empl2.getSalary();
        System.out.println("Total salary: "+totalSalary);
        empl1.lunch();
        empl2.work();
    }
}
