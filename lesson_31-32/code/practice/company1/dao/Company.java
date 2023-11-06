package practice.company1.dao;
//  Cоздаем интерфейс Company с методами:
//  -добавить сотрудника
//  -удалить сотрудника
//  -найти сотрудника
//  -кол-во сотрудников
//  -ФОТ (total salary)
//  -средняя з/п
//  -объем продаж
//  -напечатать список сотрудников
//  Cоздаем класс CompanyImpl, который implements Company
//  Cоздаем класс CompanyImplTest, в котором создаем тесты для методов
//  Pеализуем методы в классе CompanyImpl

import practice.company1.model.Employee1;

public interface Company {
//объявляем методы без тел (только сигнатуры)
    boolean addEmployee(Employee1 employee);
    Employee1 removeEmployee(int id);
    Employee1 findEmployee(int id);
    int quantityEmployee();
    double totalSalary();
    double averageSalary();
    double totalSales();
    void printEmployees();

    //список работников, у которых отработано больше, чем ... часов
    Employee1[]findEmployeesHoursGreatesThan(int hours);

    //список работников, у которых зарплата в интервале от...до...
    Employee1[]findEmployeesSalaryRange(int minSalary, int maxSalary);

}
