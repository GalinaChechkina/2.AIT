package practice.ilist;

public interface IList<E> extends Iterable<E> {
    int size(); // (1) узнать размер списка

    default boolean isEmpty() // (2) если он пустой, то вернет true
    {
        return size() == 0;
    }

    void clean(); // (3) удалить все из списка

    boolean add(E element); // (4) добавить элемент списка

    default boolean contains(Object o) // (5) есть ли элемент в списке
    {
        return indexOf(o) >= 0;
    }

    default boolean remove(Object o) // (6) удалить элемент, если он есть
    {
        int index = indexOf(o);
        if(index < 0){ // когда объекта нет в нашем списке
            return false;
        }
        remove(index);
        return true;
    }

    boolean add(int index, E element); // (7) добавить (вставить) элемент по индексу

    E remove(int index); // (8) удалить элемент из списка по индексу

    E get(int index); // (9) получить элемент по его индексу

    E set(int index, E element); // (10) обновить элемент в списке по его индексу

    int indexOf(Object o); // (11) зная элемент, найти его индекс

    int lastIndexOf(Object o);// (12) ищем индекс элемента с конца списка
}