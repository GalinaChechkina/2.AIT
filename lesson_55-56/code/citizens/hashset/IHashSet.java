package citizens.hashset;

import java.util.Iterator;
import java.util.LinkedList;

public class IHashSet<E>implements ISet<E> {

    private int size;
    private int capacity;
    private double loadFactor;
    private LinkedList<E>[]hashset;//массив из LinkedList

    public IHashSet(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashset=new LinkedList[capacity];
    }

    //конструктор для определения loadFactor
    public IHashSet(int capacity){
        this(capacity,0.75); //задаем нашу структуру длиной capacity и глубиной 0,75
    }

    //конструктор по умолчанию (если не указываем параметры, то hashset будет такого размера
    public IHashSet(){
        this(16,0.75);
    }
    @Override
    public boolean add(E element) {
        if(size>=capacity*loadFactor){
            rebuildArray();
        }
        int index=getIndex(element);
        if(hashset[index]==null){
            hashset[index]=new LinkedList<>();
        }
        if(hashset[index].contains(element)){//смотрим, чтобы элемент был уникальным
            return false;
        }
        hashset[index].add(element);
        size++;
        return true;
    }
    private void rebuildArray() {
        capacity=capacity*2;
        LinkedList<E>[]newHashSet=new LinkedList[capacity];//переделали наш лист в новый с новым размером
        for (int i = 0; i < hashset.length; i++) {//обегаем старый массив
            if(hashset[i]!=null){
                for (E e:hashset[i] ) {
                    int index=getIndex(e);
                    if(newHashSet[index]==null){
                        newHashSet[index]=new LinkedList<>();
                    }
                    newHashSet[index].add(e);
                }
            }
        }
        hashset=newHashSet;//переопределили ссылку на новый hashSet
    }
    private int getIndex(E element) {
        int hashcode=element.hashCode();//вычисляем hashcode элемента
        hashcode=hashcode>=0 ?hashcode: -hashcode;
        return hashcode % capacity; //индекс- остаток от деления hashcode на capacity
    }
    @Override
    public boolean contains(E element) {
        int index=getIndex(element);
        if(hashset[index]==null){
            return false;
        }
        return hashset[index].contains(element);//проверяем налие элемента
    }
    @Override
    public boolean remove(E element) {
        int index=getIndex(element);
        if(hashset[index]==null){
            return false;
        }
        boolean res=hashset[index].remove(element);
        if(res){
            size--;
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() { //анонимный класс Итератор имеет два метода

            private int i;
            private int j;
            private int totalCounter;
            @Override
            public boolean hasNext() {
                return totalCounter<size;//двигаемся к следующему, пока можем
            }

            @Override
            public E next() {
                while (hashset[i]==null||hashset[i].isEmpty()){//если пусто, идем к следующему
                    i++;
                }
                E res=hashset[i].get(j);//берем элемент
                totalCounter++;
                if (j<hashset[i].size()-1){//внутри листа
                    j++;
                } else {
                    j=0;
                    i++;
                }
                return res;
            }
        };
    }
}
