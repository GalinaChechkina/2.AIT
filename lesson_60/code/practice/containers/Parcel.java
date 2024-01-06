package practice.containers;

public class Parcel {

    double weight;
    public Parcel(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "\nParcel have " + weight + "kg";
    }
}