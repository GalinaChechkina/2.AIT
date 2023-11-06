package practice.pat.model;

public class Cat extends Pat {
//Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями: порода, рост, вес.
// Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
// Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки.
// Смоделируйте жизнь в этом доме в течение дня.

    private String breed;
    private double height;
    private double weight;

    public Cat(int id, String typ, int age, String nickname,String breed,double height,double weight) {
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

    public void sound(String breed, String type, String nickname){
        super.sound( nickname);
        System.out.println("Our "+breed+" "+type+": meow-meow!!");
    }
}
