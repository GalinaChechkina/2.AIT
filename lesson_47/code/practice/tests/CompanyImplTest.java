package practice.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.dao.Company;
import practice.dao.CompanyArrayListImpl;
import practice.dao.CompanyImpl;
import practice.model.Employee;
import practice.model.Manager;
import practice.model.SalesManager;
import practice.model.Worker;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {
    Company company;
    Employee[] e;

    @BeforeEach
    void setUp() {
        company = new CompanyArrayListImpl(5);
        e = new Employee[4];
        e[0] = new Manager(101, "John", "Smith", 45, 160,20,"1 PHD", 5000, 5);
        e[1] = new SalesManager(102, "Anna", "Black", 36, 160,7,"2 Master", 25000, 0.1);
        e[2] = new SalesManager(103, "Thomas", "White", 28, 160,2,"3 Bachelor", 30000, 0.1);
        e[3] = new Worker(104, "Gans", "Bauer", 30, 80,11,"4 Ausbildung", 5);

        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }
    }

    @Test
    void addEmployee() {

        assertFalse(company.addEmployee(null));

        assertFalse(company.addEmployee(e[1]));
        Employee employee1 = new Manager(105, "Ivan", "Dubin", 55, 160, 30,"3 Bachelor",6000, 6);
        assertTrue(company.addEmployee(employee1));
        assertEquals(5, company.quantity());

        Employee employee2 = new Manager(106, "Peter", "Dubin", 55, 160, 25,"1 PHD",6000, 6);
        assertFalse(company.addEmployee(employee2));
        company.printEmployees();
    }

    @Test
    void removeEmployee() {

        company.printEmployees();
        System.out.println("---------------------");

        assertEquals(e[1], company.removeEmployee(102));
        assertEquals(3, company.quantity());
        assertNull(company.removeEmployee(102));
        assertNull(company.findEmployee(102));
        company.printEmployees();
    }

    @Test
    void findEmployee() {
        company.printEmployees();

        assertEquals(e[1], company.findEmployee(102));

        assertNull(company.findEmployee(105));
    }

    @Test
    void quantity() {
        assertEquals(4, company.quantity());
    }

    @Test
    void totalSalary() {
        assertEquals(11700., company.totalSalary(), 0.01);
    }

    @Test
    void avgSalary() {
        assertEquals( 11700.0 / 4, company.avgSalary(), 0.01);
    }

    @Test
    void totalSales() {
        assertEquals(55000, company.totalSales());
    }

    @Test
    void printEmployees() {
        company.printEmployees();
    }

    @Test
    void findEmployeesHoursGreaterThan() {
        Employee[] actual = company.findEmployeesHoursGreaterThan(100);
        Employee[] expected = {e[0], e[1], e[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeesSalaryRange() {
        company.printEmployees();
        Employee[] actual = company.findEmployeesSalaryRange(2900, 6000);
        Employee[] expected = {e[0], e[2]};
        assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));
    }
}