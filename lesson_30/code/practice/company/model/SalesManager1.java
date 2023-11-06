package practice.company.model;

import practice.company1.model.Employee1;

public class SalesManager1 extends Employee1 {
    private double salesValue;
    private double percent;

    public SalesManager1(int id, String firstName, String lastName, int age, double hours, double salesValue, double percent) {
        super(id, firstName, lastName, age, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }
    public double getSalesValue() {
        return salesValue;
    }
    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }
    public double getPercent() {
        return percent;
    }
    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double calcSalary() {
        double salary=salesValue*percent;
        return salary;
    }
}
