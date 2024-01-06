package practice.homework;

public class Planet implements Comparable<Planet>{
    private String name;
    private double distSun;
    private double weight;
    private int numSat;
    public Planet(String name, double distSun, double weight, int numSat) {
        this.name = name;
        this.distSun = distSun;
        this.weight = weight;
        this.numSat = numSat;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDistSun() {
        return distSun;
    }
    public void setDistSun(double distSun) {
        this.distSun = distSun;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getNumSat() {
        return numSat;
    }
    public void setNumSat(int numSat) {
        this.numSat = numSat;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Planet planet = (Planet) object;

        return Double.compare(distSun, planet.distSun) == 0;
    }
    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(distSun);
        return (int) (temp ^ (temp >>> 32));
    }
    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distSun=" + distSun +
                ", weight=" + weight +
                ", numSat=" + numSat +
                '}';
    }

    @Override
    public int compareTo(Planet o) {
        return Double.compare(this.distSun,o.distSun);
    }
}
