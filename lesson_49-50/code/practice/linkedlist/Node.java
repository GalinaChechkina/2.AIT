package practice.linkedlist;

public class Node <E>{
    Node<E> prev;
    E date;
    Node<E> next;

    public Node(Node<E> prev, E date, Node<E> next) {
        this.prev = prev;
        this.date = date;
        this.next = next;
    }
}
