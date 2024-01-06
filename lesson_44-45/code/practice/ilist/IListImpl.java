package practice.ilist;

import java.util.Arrays;
import java.util.Iterator;

public class IListImpl<E> implements IList<E> {

    private Object[] elements; // массив для списка объектов
    private int size;          // размер списка

    public IListImpl(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal capacity = " + initialCapacity); // выбросили исключение
        }
        elements = new Object[initialCapacity];
    }
    public IListImpl() {
        this(10);
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public void clean() {  //O(n)
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
    @Override
    public boolean add(E element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }
    private void ensureCapacity() {
        if (size == elements.length) {
            if (size == Integer.MAX_VALUE) {
                throw new OutOfMemoryError(); // большего по размеру массива создать не можем
            }
            int newCapacity = elements.length + elements.length / 2; // вырастили длину массива в 1,5 раза
            if (newCapacity < 0) {
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity); // скопировали в новый массив
        }
    }
    @Override
    public boolean add(int index, E element) { //O(n)
        if (index == size) { // добавление в конец списка
            add(element);
            return true;
        }
                             // добавление в середину списка
        checkIndex(index);   // O(1)
        ensureCapacity();    // O(n)
        System.arraycopy(elements, index, elements, index + 1, size++ - index); //O(n)
        elements[index] = element;  //O(1)
        return true;
    }
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }
    @Override
    public E remove(int index) {
        checkIndex(index);
        E el = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size- index-1 );
        elements[--size] = null;
        return el;
    }
    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index]; // (E) - кастинг к типу
    }
    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E victim = (E) elements[index]; // нашли элемент по индексу
        elements[index] = element;
        return victim;
    }
    @Override
    public int indexOf(Object o) {
        if (o != null) { // когда объект не null
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        } else { // когда в листе есть объект null
            for (int i = 0; i < size; i++) {
                if (null == (elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
    @Override
    public int lastIndexOf(Object o) {
        if (o != null) { // когда объект не null
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return size-1-i;
                }
            }
        } else { // когда в листе есть объект null
            for (int i = 0; i < size; i++) {
                if (null == (elements[i])) {
                    return size-1-i;
                }
            }
        }
        return -1;
    }
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int i = 0; // с какого элемента начинается перебор
            @Override
            public boolean hasNext() {
                return i < size;
            }
            @Override
            public E next() {
                return (E) elements[i++];
            }
        };
    }
}