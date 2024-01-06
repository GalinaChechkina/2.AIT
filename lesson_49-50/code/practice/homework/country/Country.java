package practice.homework.country;

import java.util.Comparator;
import java.util.Objects;

public class Country implements Comparable<Country>{
    private String name;
    private double population;
    private String continent;

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (Double.compare(population, country.population) != 0) return false;
        if (!name.equals(country.name)) return false;
        return Objects.equals(continent, country.continent);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Country o) {
        return this.name.compareTo(o.name);
    }

    Comparator<Country>comparatorC=new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            int res=o1.continent.compareTo(o2.continent);
            return res!=0 ? res: Double.compare(o1.getPopulation(), o2.getPopulation());
        }
    };
}
