package practice.month;

public enum Month {
    JAN("january",31), FEB("february",28), MAR("march",31),
    APR("april",30), MAY("may",31), JUN("june",30),
    JUL("July",31), AUG("august",31), SEP("september",30),
    OKT("october",31), NOV("november",30), DES("december",31),
    ;
    //поля
    private String name;
    private int days;

    Month(String name, int days) {
        this.name = name;
        this.days = days;
    }
    public String getName() {
        return name;
    }
    public int getDays() {
        return days;
    }

    //Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
    //Пример: AUG + 6 month = FEB
    //Проверьте работу метода в приложении.

    public Month plusMonth(int n){
        int index=ordinal();  //текущий номер месяца
        index=index+n;
        Month[]months=values();
        return months[index%months.length]; //возвращаем объект типа Month, индекс которого равен остатку отделения на 12

    }

}
