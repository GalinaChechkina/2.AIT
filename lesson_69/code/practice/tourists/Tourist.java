package practice.tourists;

import java.util.Arrays;
import java.util.Objects;

public class Tourist {

    private String name;
    private String[] countries;

    public Tourist(String name, String... countries) {//...-var args-подвижный аргумент позволяет использовать массивы разной длины
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public String[] getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tourist tourist = (Tourist) o;

        if (!Objects.equals(name, tourist.name)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(countries, tourist.countries);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(countries);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tourist{");
        sb.append("name='").append(name).append('\'');
        sb.append(", countries=").append(Arrays.toString(countries));
        sb.append('}');
        return sb.toString();
    }
}
