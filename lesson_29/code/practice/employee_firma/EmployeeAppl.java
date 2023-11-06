package practice.employee_firma;

import practice.employee_firma.model.Employee;
import practice.employee_firma.model.Manager;
import practice.employee_firma.model.SalesManager;
import practice.employee_firma.model.Worker;

public class EmployeeAppl {
    public static void main(String[] args) {

        Employee[]empl=new Employee[6];
        empl[0]= new Manager(100,"John","Smith",45,160,5000,5);
        empl[1]=new SalesManager(200,"Anna","Black",36,160,25000,0.1);
        empl[2]=new SalesManager(201,"Tom","White",25,160,30000,0.1);
        empl[3]=new Worker(300,"Hans","Bauer",30,160,5);
        double sum=totalSalary(empl);
        System.out.println(sum);
        double average=averageAge(empl);
        System.out.println(average);
    }
    private static double totalSalary(Employee[]empl){
        double res=0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i]!=null){
                res+=empl[i].calcSalary();
            }
        }
        return res;
    }

    private static double averageAge(Employee[]empl) {
        double res = 0;
        double count=0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                res += empl[i].getAge();
                count+=1;
            }
        }
        return res/count;
    }
}
