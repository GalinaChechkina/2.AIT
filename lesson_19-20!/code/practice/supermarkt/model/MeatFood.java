package practice.supermarkt.model;

public class MeatFood extends Food{
    private String meatType;

    public MeatFood(String name, long barCode, double price, String expDate, boolean organic, String meatType) {
        super(name, barCode, price, expDate, organic);
        this.meatType=meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    @Override
    public String toString() {
        return "MeatFood{" +
                "meatType='" + meatType + '\'' +
                "} " + super.toString();
    }
}
