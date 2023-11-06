package practice.company1.dao;

import practice.company1.model.Employee1;
import practice.company1.model.SalesManager1;

public class CompanyImpl implements Company {

    //создаем поля

    private Employee1[] employees; //массив сотрудников
    private int size;              //текущее количество сотрудников

    //конструктор (не сгенерирован- делаем сами)

    public CompanyImpl(int capacity) {
        employees = new Employee1[capacity]; //максимальное число сотрудников

    }

    @Override
    public boolean addEmployee(Employee1 employee) {
        if (employee == null || size == employees.length || findEmployee(employee.getId()) != null){
            return false;
        }
        /*employees[size] = employee;
        size++;*/

        employees[size++]=employee; //постификсная операция
        return true;
    }

    @Override
    public Employee1 removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId()==id){
                Employee1 vict =employees[i];  //завели объект класса Employee1, который вернем, как удаленный

                /*employees[i]=employees[size-1];//поставили последний существующий элемент массива на место i-го
                employees[size-1]=null;  //обнулили последнего
                size--;  //уменьшили массив на единицу*/

                //employees[i]=employees[--size];//префиксная операция


                //еще один способ убирания элемента из массива
                System.arraycopy(employees,i+1,employees,i,size-i-1);
                employees[--size]=null;
                return vict;
            }
        }
        return null;
    }

    @Override
    public Employee1 findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId()==id){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int quantityEmployee() {
        return size;
    }

    @Override
    public double totalSalary() {
        double res=0;
        for (int i = 0; i < size; i++) {
            res+= employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double averageSalary() {
        return totalSalary()/size;
    }

    @Override
    public double totalSales() {
        double res=0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager1){
                res+=((SalesManager1) employees[i]).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }

    }

    @Override
    public Employee1[] findEmployeesHoursGreatesThan(int hours) {
        int count=0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > hours) {
                count++;
            }
        }
        Employee1[]res=new Employee1[count];
        for (int i = 0, j=0; j < res.length; i++) { //пробегаем по массиву и ищем наших сотрудников, и запихиваем их в новый массив
            if (employees[i].getHours() > hours){
                res[j++]=employees[i];
            }
        }
        return res;
    }

    @Override
    public Employee1[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        int count=0;
        for (int i = 0; i < size; i++) {
            if(employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary){
                count++;
            }
        }
        Employee1[]res=new Employee1[count];
        for (int i = 0,j=0; j <res.length; i++) {
            if(employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary){
                res[j++]=employees[i];
            }
        }
        return res;
    }
}
