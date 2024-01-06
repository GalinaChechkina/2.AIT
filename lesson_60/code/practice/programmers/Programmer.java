package practice.programmers;

import java.util.Arrays;
import java.util.Objects;

public class Programmer {
    // В этом классе нужно учесть состав и количество языков программирования,
    // которые знает программист (technology).

private String name;
private String[] technologies;

    public Programmer(String name, String... technologies) {//...-var args-подвижный аргумент позволяет использовать массивы разной длины
        this.name = name;
        this.technologies = technologies;
    }
    public String getName() {
        return name;
    }
    public String[] getTechnologies() {
        return technologies;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Programmer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", technologies=").append(Arrays.toString(technologies));
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Programmer that = (Programmer) o;

        if (!Objects.equals(name, that.name)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(technologies, that.technologies);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(technologies);
        return result;
    }
}
