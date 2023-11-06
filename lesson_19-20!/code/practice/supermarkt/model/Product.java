package practice.supermarkt.model;

public class Product {

    private String name;
    private long barCode;
    private double price;

    public Product(String name, long barCode, double price) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
    }

    public String getName() {
        return name;
    }
        public long getBarCode() {
        return barCode;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", barCode=" + barCode +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;//если две ссылки идут на один объект, то все отлично
        if (object == null || getClass() != object.getClass()) return false;//если ссылки идут на пустоту или данные разного типа, то ложь

        Product product = (Product) object;

        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return (int) (barCode ^ (barCode >>> 32));
    }
}
