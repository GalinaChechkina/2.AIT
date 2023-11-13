package practice.mystring.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    private StringBuilder str;
    private int size;
    private int curPos;

    public MyStringIterator(StringBuilder str) {
        this.str = str;
    }
    //проверка, есть ли следующий элемент
    @Override
    public boolean hasNext() {
        return curPos<size;// логическое выражение (истина, когда еще есть элементы)
    }

    //должен вернуть элемент множества
    @Override
    public Character next() {
        Character curChar=str.charAt(curPos);
        curPos++;
        return curChar;
    }

    @Override
    public void remove() {
        str.deleteCharAt(--curPos);
        size--;
    }
}
