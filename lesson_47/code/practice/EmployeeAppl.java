package practice;

import practice.dao.Company;
import practice.dao.CompanyImpl;
import practice.model.Employee;
import practice.model.Manager;
import practice.model.SalesManager;
import practice.model.Worker;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeAppl {
    public static void main(String[] args) {
        CompanyImpl company;
        Employee[] empl;
        //company= new CompanyImpl(6);
        empl=new Employee[]{
                new Manager(100, "John", "Smith", 45, 160, 20, "1 PHD", 5000, 5),
                new SalesManager(201, "Tom", "White", 25, 160, 2, "3 Bachelor", 30000, 0.1),
                new SalesManager(200, "Anna", "Black", 36, 160, 7, "2 Master", 25000, 0.1),
                new Worker(300, "Hans", "Bauer", 30, 160, 11, "4 Ausbildung", 5)
             };
        /*for (int i = 0; i < empl.length; i++) {
            company.addEmployee(empl[i]);
        }
        company.printEmployees();
        */
        for (int i = 0; i < empl.length; i++) {
            System.out.println(empl[i]);
        }
        System.out.println();
        Comparator<Employee>comparatorWE= new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getWorkExp()-o1.getWorkExp();
            }
        };
        Arrays.sort(empl,comparatorWE);
        //company.printEmployees();
        for (int i = 0; i < empl.length; i++) {
            System.out.println(empl[i]);
        }
        System.out.println();

        Comparator<Employee>comparatorED= new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEducation().compareTo(o2.getEducation());
            }
        };
        Arrays.sort(empl,comparatorED);
        //company.printEmployees();
        for (int i = 0; i < empl.length; i++) {
            System.out.println(empl[i]);
        }


        double sum=totalSalary(empl);
        System.out.println("Total Salary: "+sum);
        double average=averageAge(empl);
        System.out.println("Average Age: "+ average);
        double sum1=totalSales(empl);
        System.out.println("Total Sales: "+sum1);
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

    private static double totalSales(Employee[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] instanceof SalesManager){
                SalesManager salesManager = (SalesManager) empl[i];
                sum += salesManager.getSalesValue();
            }
        }
        return sum;
    }
}
