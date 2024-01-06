package homework.residents.model;

import java.time.LocalDate;
import java.util.Objects;

public class Resident {
    private String name;
    private String firstName;
    private String gender;
    private LocalDate birthDay;
    private int floor;
    private int apartNum;

    public Resident(String name, String firstName, String gender, LocalDate birthDay, int floor, int apartNum) {
        this.name = name;
        this.firstName = firstName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.floor = floor;
        this.apartNum = apartNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getApartNum() {
        return apartNum;
    }

    public void setApartNum(int apartNum) {
        this.apartNum = apartNum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Resident{");
        sb.append("name='").append(name).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", birthDay=").append(birthDay);
        sb.append(", floor=").append(floor);
        sb.append(", apartNum=").append(apartNum);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resident resident = (Resident) o;

        if (floor != resident.floor) return false;
        if (apartNum != resident.apartNum) return false;
        if (!Objects.equals(name, resident.name)) return false;
        if (!Objects.equals(firstName, resident.firstName)) return false;
        if (!Objects.equals(gender, resident.gender)) return false;
        return Objects.equals(birthDay, resident.birthDay);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (birthDay != null ? birthDay.hashCode() : 0);
        result = 31 * result + floor;
        result = 31 * result + apartNum;
        return result;
    }
}
