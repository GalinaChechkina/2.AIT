package practice.company.dao;

import practice.company1.dao.Company;
import practice.company1.model.Employee1;

public class CompanyImpl implements Company {

    //создаем поля

    private Employee1[] employee; //массив сотрудников
    private int size;              //текущее количество сотрудников

    //конструктор (не сгенерирован- делаем сами)

    public CompanyImpl(int capacity) {
        employee = new Employee1[capacity]; //максимальное число сотрудников

    }

    @Override
    public boolean addEmployee(Employee1 employee) {

        return false;
    }

    @Override
    public Employee1 removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee1 findEmployee(int id) {
        return null;
    }

    @Override
    public int quantityEmployee() {
        return 0;
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double averageSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public void printEmployees() {

    }

    @Override
    public Employee1[] findEmployeesHoursGreatesThan(int hours) {
        return new Employee1[0];
    }

    @Override
    public Employee1[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return new Employee1[0];
    }
}
