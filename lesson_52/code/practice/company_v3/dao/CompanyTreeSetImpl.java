package practice.company_v3.dao;

import practice.company_v3.model.Employee;
import practice.company_v3.model.SalesManager;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;

public class CompanyTreeSetImpl implements Company{

    private TreeSet<Employee> employees;
    private int capacity;

    public CompanyTreeSetImpl(int capacity){
        this.capacity=capacity;
        employees=new TreeSet<>();
    }

    @Override//O(1)
    public boolean addEmployee(Employee employee) {
        return employee!=null&&employees.size()!=capacity&&employees.add(employee);
    }

    @Override//O(log n)
    public Employee removeEmployee(int id) {
        Employee victim=findEmployee(id);
        if(victim==null){
            return null;
        }
        employees.remove(victim);
        return victim;
    }

    @Override//O(log n)
    public Employee findEmployee(int id) {
        for (Employee e:employees) {
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }

    @Override //O(1)
    public int quantity() {
        return employees.size();
    }

    @Override //O(n)
    public double totalSalary() {
        double res=0;
        for (Employee e:employees) {
            res+=e.calcSalary();
        }
        return res;
    }

    @Override //O(1)
    public double avgSalary() {
        return totalSalary()/employees.size();
    }

    @Override //O(n)
    public double totalSales() {
        double res=0;
        for (Employee e:employees ) {
            if(e instanceof SalesManager){
                res+=((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        employees.forEach(s-> System.out.println(s));
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return findEmployeesByPredicate(e->e.getHours()>=hours);
    }
    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate) {//O(n)
        List<Employee>res=new ArrayList<>();
        for (Employee e:employees ) {
            if(predicate.test(e)){
                res.add(e);
            }
        }
        return res.toArray(new Employee[0]);
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findEmployeesByPredicate(s->s.calcSalary()>=minSalary && s.calcSalary()<maxSalary);
    }
}
