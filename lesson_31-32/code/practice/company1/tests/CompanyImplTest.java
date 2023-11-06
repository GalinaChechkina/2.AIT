package practice.company1.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company1.dao.Company;
import practice.company1.dao.CompanyImpl;
import practice.company1.model.Employee1;
import practice.company1.model.Manager1;
import practice.company1.model.SalesManager1;
import practice.company1.model.Worker1;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {
    Company company;
    Employee1[]e;

    @BeforeEach
    void setUp() {
        company= new CompanyImpl(5);
        e= new Employee1[4];
        e[0]= new Manager1(100,"John","Smith",45,160,5000,5);
        e[1]=new SalesManager1(200,"Anna","Black",36,160,25000,0.1);
        e[2]=new SalesManager1(201,"Tom","White",25,160,30000,0.1);
        e[3]=new Worker1(300,"Hans","Bauer",30,80,5);
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].calcSalary());
        }
    }

    @Test
    void addEmployeeTest() {
        assertFalse(company.addEmployee(null));//добавляем пустого сотрудника
        assertFalse(company.addEmployee(e[3]));//добавляем уже существующего
        
        Employee1 employee1=new Manager1(101,"Ivan","Dubin",55,160,6000,6);
        assertTrue(company.addEmployee(employee1));//добавляем сотрудника Ивана
        assertEquals(5,company.quantityEmployee());//теперь в компании 5 сотрудников

        Employee1 employee2=new Manager1(102,"Petr","Dubin",55,160,6000,6);
        assertFalse(company.addEmployee(employee2));//не можем превысить capacity
    }

    @Test
    void removeEmployeeTest() {
        assertEquals(e[1],company.removeEmployee(200));
        assertEquals(3,company.quantityEmployee());//сотрудников стало на один меньше
        assertNull(company.removeEmployee(200));//дважды не можем удалить
        assertNull(company.findEmployee(200));//не можем найти после удаления
        company.printEmployees();
    }

    @Test
    void findEmployeeTest() {
       assertEquals(e[1] , company.findEmployee(200));//существующий сотрудник
       assertNull( company.findEmployee(500));     //несуществующий сотрудник
    }

    @Test
    void quantityEmployeeTest() {
        assertEquals(4,company.quantityEmployee());
    }

    @Test
    void totalSalaryTest() {
        assertEquals(11700,company.totalSalary());
    }

    @Test
    void averageSalaryTest() {
        assertEquals(2925,company.averageSalary(),0.01);//метод может округлять через запятую и 0,01
    }

    @Test
    void totalSalesTest() {
        assertEquals(55000,company.totalSales());
    }

    @Test
    void printEmployeesTest() {
        company.printEmployees();
    }
    @Test
    void findEmployeesHoursGreatesThanTest(){
       /* Employee1[]actual=company.findEmployeesHoursGreatesThan(100);
        Employee1[]expected={e[0],e[1],e[2]};*/
        assertArrayEquals(new Employee1[]{e[0], e[1], e[2]},company.findEmployeesHoursGreatesThan(100));

    }

    @Test
    void findEmployeesSalaryRange(){
        assertArrayEquals(new Employee1[]{e[0]},company.findEmployeesSalaryRange(3000,6000));

    }
}