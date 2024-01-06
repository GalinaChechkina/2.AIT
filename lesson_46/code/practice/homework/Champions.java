package practice.homework;

public class Champions implements Comparable<Champions>{

    private int id;
    private String name;
    private String club;
    private double res;

    public Champions(int id, String name,String club, double res) {
        this.id = id;
        this.name = name;
        this.club = club;
        this.res = res;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "Champions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", club='" + club + '\'' +
                ", res=" + res +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Champions champions = (Champions) object;

        return id == champions.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Champions o) {
        return Double.compare(this.res,o.res);
    }
}
