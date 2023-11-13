package practice.citybas;

public class Bus implements Comparable<Bus>{

    private String model;//модель автобуса
    private String regNumber;//регистрационный номер (подобие id)
    private String route;//маршрут
    private int busCapacity;//сколько таких автобусов

    public Bus(String model, String regNumber, String route, int busCapacity) {
        this.model = model;
        this.regNumber = regNumber;
        this.route = route;
        this.busCapacity = busCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(int busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", route='" + route + '\'' +
                ", busCapacity=" + busCapacity +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Bus bus = (Bus) object;
        return regNumber.equals(bus.regNumber);
    }

    @Override
    public int hashCode() {
        return regNumber.hashCode();
    }

    @Override
    public int compareTo(Bus o) {
        int res= this.route.compareTo(o.route);
        return res!=0 ? res : Integer.compare(o.busCapacity,this.busCapacity); //по убыванию
    }
}
