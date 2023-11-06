package practice.company;

import practice.company1.model.Employee1;
import practice.company1.model.Manager1;
import practice.company1.model.SalesManager1;
import practice.company1.model.Worker1;


public class Employee1Appl {
    public static void main(String[] args) {

        Employee1[]empl=new Employee1[5];
        empl[0]= new Manager1(100,"John","Smith",45,160,5000,5);
        empl[1]=new SalesManager1(200,"Anna","Black",36,160,25000,0.1);
        empl[2]=new SalesManager1(201,"Tom","White",25,160,30000,0.1);
        empl[3]=new Worker1(300,"Hans","Bauer",30,160,5);
        double sum=totalSalary(empl);
        System.out.println(sum);
        double average=averageAge(empl);
        System.out.println(average);
    }
    private static double totalSalary(Employee1[]empl){
        double res=0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i]!=null){
                res+=empl[i].calcSalary();
            }
        }
        return res;
    }

    private static double averageAge(Employee1[]empl) {
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
