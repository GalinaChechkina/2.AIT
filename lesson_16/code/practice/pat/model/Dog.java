package practice.pat.model;

public class Dog extends Pat{
    private String breed;
    private double height;
    private double weight;
    public Dog(int id, String typ, int age, String nickname, String breed, double height, double weight) {
        super(id, typ, age, nickname);
        this.breed=breed;
        this.height=height;
        this.weight=weight;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display(){
        super.display();
        System.out.println("Breed: "+breed+"  Height: "+height+"  Weight: "+weight);
    }


    public void sound(String breed,String nickname, String type){
        super.sound( nickname);
        System.out.println("Our "+breed+" "+type+": Woof-woof!!");
    }
}
