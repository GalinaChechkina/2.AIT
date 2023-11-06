package practice.jsonWrapper;

import java.util.Objects;

public class JsonWrapper1 {

    //поле класса
    private Object value;

    //создаем конструктоор

    public JsonWrapper1(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{ value= " + value + " }";
    }
}
