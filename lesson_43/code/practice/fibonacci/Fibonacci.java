package practice.fibonacci;

import java.util.Arrays;
import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{

    private int quantity; //количество элементов последовательности
    public Fibonacci(int quantity) {
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Fibonacci{" +
                "quantity=" + quantity +
                '}';
    }
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(quantity);
    }
}
