package practice.computers.model;

public class Smartphone extends Laptop{
    private int pixCam;

    public Smartphone(String cpu, int ram, int hdd, String brand, String display, int batteryCapacity, double weight,int pixCam) {
        super(cpu, ram, hdd, brand, display, batteryCapacity, weight);
        this.pixCam=pixCam;
    }
    public int getPixCam() {
        return pixCam;
    }
    public void setPixCam(int pixCam) {
        this.pixCam = pixCam;
    }

    @Override
    public String toString() {
        return super.toString()+" Smartphone{" +
                "pixCam=" + pixCam +
                '}';
    }
}
