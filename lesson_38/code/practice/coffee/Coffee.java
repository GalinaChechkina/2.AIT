package practice.coffee;

public enum Coffee {
    ESP("espresso",3), AMR("americano",3),
    CAP("cappuccino",4), LAT("latte",4.50), EXIT("exit",0);

    //поля
    private String type;
    private double price;

    Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
