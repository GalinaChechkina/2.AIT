package practice.dao;

import practice.model.Employee;


public interface Company {
    boolean addEmployee(Employee employee);
    Employee removeEmployee(int id);
    Employee findEmployee(int id);
    int quantity();
    double totalSalary();
    double avgSalary();
    double totalSales();
    void printEmployees();

    Employee[] findEmployeesHoursGreaterThan(int hours);

    Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary);

}
