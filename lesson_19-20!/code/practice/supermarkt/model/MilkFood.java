package practice.supermarkt.model;

public class MilkFood extends Food{
    private String milkType;
    private double fat;
    public MilkFood(String name, long barCode, double price, String expDate, boolean organic, String milkType, double fat ) {
        super(name, barCode, price, expDate, organic);
        this.milkType=milkType;
        this.fat=fat;
    }

    public String getMilkType() {
        return milkType;
    }
    public double getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return "MilkFood{" +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                "} " + super.toString();
    }
}
