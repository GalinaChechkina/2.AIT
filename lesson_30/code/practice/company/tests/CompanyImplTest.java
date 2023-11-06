package practice.company.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company1.dao.Company;
import practice.company1.dao.CompanyImpl;
import practice.company1.model.Employee1;
import practice.company1.model.Manager1;
import practice.company1.model.SalesManager1;
import practice.company1.model.Worker1;

class CompanyImplTest {
    Company company;
    Employee1[]employee;

    @BeforeEach
    void setUp() {
        company= new CompanyImpl(5);
        employee= new Employee1[4];
        employee[0]= new Manager1(100,"John","Smith",45,160,5000,5);
        employee[1]=new SalesManager1(200,"Anna","Black",36,160,25000,0.1);
        employee[2]=new SalesManager1(201,"Tom","White",25,160,30000,0.1);
        employee[3]=new Worker1(300,"Hans","Bauer",30,160,5);
    }

    @Test
    void addEmployee() {
       /* assertFalse(company.addEmployee(null));//добавляем пустого сотрудника
        assertFalse(company.addEmployee(employee[3]));//добавляем уже существующего

        Employee1 employee1=new Manager1(101,"Ivan","Dubin",55,160,6000,6);
        assertTrue(company.addEmployee(employee1));//добавляем сотрудника Ивана
        assertEquals(5,company.quantityEmployee());//теперь в компании 5 сотрудников

        Employee1 employee2=new Manager1(102,"Petr","Dubin",55,160,6000,6);
        assertFalse(company.addEmployee(employee2));//не можем превысить capacity*/
    }

    @Test
    void removeEmployee() {
        /*assertEquals(employee[1],company.removeEmployee(200));
        assertEquals(3,company.quantityEmployee());//сотрудников стало на один меньше
        assertNull(company.removeEmployee(200));//дважды не можем удалить
        assertNull(company.findEmployee(200));//не можем найти после удаления*/
    }

    @Test
    void findEmployee() {
       /*assertEquals(employee[1] , company.findEmployee(200));//существующий сотрудник
       assertNull( company.findEmployee(500));     //несуществующий сотрудник*/
    }

    @Test
    void quantityEmployee() {
    }

    @Test
    void totalSalary() {
    }

    @Test
    void averageSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void printEmployees() {
    }
}