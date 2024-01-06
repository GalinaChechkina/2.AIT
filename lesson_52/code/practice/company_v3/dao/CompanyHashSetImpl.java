package practice.company_v3.dao;

import practice.company_v3.model.Employee;
import practice.company_v3.model.SalesManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CompanyHashSetImpl implements Company{

    private Set<Employee>employees;// instead of a List Set
    private int capacity;

    public CompanyHashSetImpl(int capacity){
        this.capacity=capacity;
        employees=new HashSet<>();
    }
    @Override
    public boolean addEmployee(Employee employee) {//O(1)
        if (employee == null || employees.size() == capacity) {
            return false;
        }
        return employees.add(employee);//операция добавления и удаления из множества имеет сложность O(1)
    }

    @Override
    public Employee removeEmployee(int id) {//O(n)
        Employee victim=findEmployee(id);
        employees.remove(victim);
        return victim;//множества не содержат null
    }

    @Override
    public Employee findEmployee(int id) {//O(n)
        for (Employee e:employees) {
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }

    @Override
    public int quantity() {//O(1)
        return employees.size();
    }

    @Override
    public double totalSalary() {//O(n)
        double res=0;
        for (Employee e:employees) {
             res+=e.calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {//O(1)
        return totalSalary()/employees.size();
    }

    @Override
    public double totalSales() {//O(n)
        double res=0;
        for (Employee e:employees ) {
            if(e instanceof SalesManager){
                res+=((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {//O(n)
        employees.forEach(s-> System.out.println(s));
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {//O(n)

        return findEmployeesByPredicate(e->e.getHours()>=hours);
    }

    private Employee[] findEmployeesByPredicate(Predicate<Employee>predicate) {//O(n)
        List<Employee>res=new ArrayList<>();
        for (Employee e:employees ) {
            if(predicate.test(e)){
                res.add(e);
            }
        }
        return res.toArray(new Employee[0]);
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {//O(n)
        return findEmployeesByPredicate(s->s.calcSalary()>=minSalary && s.calcSalary()<maxSalary);
    }
}
