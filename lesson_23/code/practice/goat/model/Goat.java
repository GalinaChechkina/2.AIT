package practice.goat.model;

public class Goat {
    public static final int count_max=120;//так сoздаются константы в Java
    public  int count;
    public final String name;

    public Goat(String name) {
        this.name = name;
    }

    public int getCount(){
        return count;
    }
    public void increment(){
        count++;
    }

    @Override
    public String toString() {
        return "Goat{" +
                "count=" + count +
                ", name='" + name + '\'' +
                '}';
    }
}
