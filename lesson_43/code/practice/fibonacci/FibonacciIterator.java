package practice.fibonacci;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int quantity;
    private int cur=0;
    private int ind=0;
    private int next=1;

    public FibonacciIterator(int quantity) {
        this.quantity= quantity;
    }

    @Override
    public boolean hasNext() { return ind<quantity; } //TODO проверка на количество чисел в ряду

    @Override
    public Integer next() { //TODO как получить следующее число в ряду(предыдущее+текущее)
        if(ind==0) {
            ind=1;
            return cur;
        }
        int t=cur;
        cur=next;
        next=t+next;
        ind++;
        return next;
    }
}
