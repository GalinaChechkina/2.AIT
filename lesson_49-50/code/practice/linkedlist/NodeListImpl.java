package practice.linkedlist;

import java.util.Iterator;

public class NodeListImpl<E> implements NodeList<E>{

    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public int size() {
        return size;
    } //O(1)
    @Override
    public boolean add(E element) {  //O(1)
        Node<E> newNode = new Node<>(last, element, null);
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode;
        }
        last = newNode;
        size++;
        return true;
    }
    @Override
    public void clear() { //O(1)
        first=last=null;
        size=0;
    }
    @Override
    public boolean add(int index, E element) {  //O(n)
        if (index == size) {
            return add(element);
        }
        Node<E> node = getNodeByIndex(index);
        Node<E> newNode = new Node<>(node.prev, element, node);//создаем новый узел
        node.prev = newNode;
        if (index != 0) {
            newNode.prev.next = newNode;
        } else {
            first = newNode;
        }
        size++;
        return true;
    }
    private Node<E> getNodeByIndex(int index) {  //O(n)
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }
    private void checkIndex(int index) {  //O(1)
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }
    @Override
    public E get(int index) {  //такая же, как у метода getNodeByIndex(index);
        Node<E> node = getNodeByIndex(index);
        return node.date;
    }
    @Override
    public int indexOf(Object o) {  //O(n)
        int index = 0;
        if (o != null) {
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o.equals(node.date)) {
                    return index;
                }
            }
        } else {
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o == node.date) {
                    return index;
                }
            }
        }
        return -1;
    }
    @Override
    public int lastIndexOf(Object o) {  //O(n)
        //TODO
        int index = 0;
        if (o != null) {
            for (Node<E> node = last; node != null; node = node.prev, index++) {
                if (o.equals(node.date)) {
                    return index;
                }
            }
        } else {
            for (Node<E> node = last; node != null; node = node.prev, index++) {
                if (o == node.date) {
                    return index;
                }
            }
        }
        return -1;
    }
    @Override
    public E remove(int index) {  //O(n)
        Node<E>node=getNodeByIndex(index);
        return unlink(node);
    }

    private E unlink(Node<E> node) {  //O(1)
        E victim = node.date;
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        if (prev != null) {
            prev.next = next;
            node.prev = null;
        } else {
            first = next;
        }
        if (next != null) {
            next.prev = prev;
            node.next = null;
        } else {
            last = prev;
        }
        node.date = null;
        size--;
        return victim;
    }
    @Override
    public E set(int index, E element) {  //такая же, как у метода getNodeByIndex(index);
        Node<E> node = getNodeByIndex(index);
        E victim = node.date;
        node.date = element;
        return victim;
    }
    @Override
    public Iterator<E> iterator() {  //O(1)

        return new Iterator<E>() {
            private Node<E>node=first;
            @Override
            public boolean hasNext() {//(1)
                return node!=null;
            }
            @Override
            public E next() {//(1)
                E data=node.date;
                node=node.next;//перешли на следующий узел
                return data;
            }
        };
    }
}
