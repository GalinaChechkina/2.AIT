package practice.homework.exchanger.model;

public enum Menu {
    USD (1, "USD", 1.09,0.91),
    GBR(2, "GEL", 2.95,0.34),
    JPY (3, "AUD", 1.67,0.60),
    AUD(4, "JPY", 161.66,0.0062),
    RUB(5, "Ruble",0,0);

    private int num;
    private String name;
    private double courseBuying;
    private double courseSelling;

    Menu(int num, String name, double courseBuying, double courseSelling) {
        this.num = num;
        this.name = name;
        this.courseBuying = courseBuying;
        this.courseSelling=courseSelling;
    }

    public int getNum() {
        return num;
    }
    public String getName() {
        return name;
    }
    public double getCourseBuying() {
        return courseBuying;
    }
    public double getCourseSelling() {
        return courseSelling;
    }

    @Override
    public String toString() {
        return num + " : Currency " + name  + ", " + courseBuying+" / "+courseSelling;
    }
}