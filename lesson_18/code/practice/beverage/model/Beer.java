package practice.beverage.model;

public class Beer extends Beverage{

    private String type;

    public Beer(String title, String packing, int quantity,String type) {
        super(title, packing, quantity);
        this.type= type;
    }

    public Beer() {
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void toBuy(String title, String packing, int quantity){
        super.toBuy(title,packing,quantity);

    }
    public void displayStock(){
        super.displayStock();
        System.out.println("This is "+type+" beer");
    }
}
