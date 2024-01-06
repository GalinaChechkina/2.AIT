package practice.dao;

import practice.model.Employee;
import practice.model.SalesManager;

import java.util.ArrayList;
import java.util.List;

public class CompanyArrayListImpl implements Company {

    private List<Employee>employees; //вместо массива Лист
    private int capacity;

    public CompanyArrayListImpl(int capacity){
        employees=new ArrayList<>();//новый конструктор, но уже с ArrayList
        this.capacity=capacity;//ограничение по количеству набора
    }
    @Override
    public boolean addEmployee(Employee employee) { //O(n)
        if (employee==null||employees.size()==capacity||findEmployee(employee.getId())!=null){
            return false;
        }
        employees.add(employee);
        return true;
    }
    @Override
    public Employee removeEmployee(int id) {  //O(n)

        Employee victim=findEmployee(id);
        if (victim!=null) {
            employees.remove(victim);
            return victim;
        }
        return null;
    }
    @Override
    public Employee findEmployee(int id) {  //O(n)

        for (Employee e:employees) {
            if (e.getId()==id){
                return e;
            }
        }
        return null;
    }
    @Override
    public int quantity() {  // O(1)
        return employees.size();
    }
    @Override
    public double totalSalary() { //O(n)
        double res=0;
        for (Employee e:employees){
              res+=e.calcSalary();
        }
        return res;
    }
    @Override
    public double avgSalary() {  //O(n)
        return totalSalary()/employees.size();
    }

    @Override
    public double totalSales() { //O(n)
        double res=0;
        for (Employee e:employees) {
             if(e instanceof SalesManager){
                 res+=((SalesManager) e).getSalesValue();
             }
        }
        return res;
    }

    @Override
    public void printEmployees() {  //O(n)
        for (Employee e:employees ) {
            System.out.println(e);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        int count=0;
        for (Employee e:employees) {
             if(e.getHours()>hours){
                 count++;
             }
        }
        Employee[]res= new Employee[count];
        count=0;
        for (Employee e:employees ) {
            if(e.getHours()>hours){
              res[count]=e;
              count++;
            }
        }
        return res;
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        int count = 0;
        for (Employee e:employees) {
            if(e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                count++;
            }
        }
        Employee[] res = new Employee[count];
        count=0;
        for (Employee e:employees) {
            if(e.calcSalary() > minSalary && e.calcSalary() < maxSalary){
                res[count] = e;
                count++;
            }
        }
        return res;
    }
}
