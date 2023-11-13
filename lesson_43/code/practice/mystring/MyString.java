package practice.mystring;

import practice.mystring.model.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character>{
    private StringBuilder str;

    public MyString(StringBuilder str) {
        this.str = str;
    }
    public StringBuilder getStr() {
        return str;
    }
    public void setStr(StringBuilder str) {
        this.str = str;
    }
    //метод добавления символов
    public void addChar(char c){
        str.append(c);
    }
    //метод удаления символов
    public void removeChar(char c){
        int ind=str.indexOf(Character.toString(c));
        str.deleteCharAt(ind);
    }

    @Override
    public String toString() {
        return  str.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);
    }
}
