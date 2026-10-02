public interface CollectionInterface<T>{

    boolean add(T item);
    T get(T item);
    boolean contains(T item);
    boolean remove(T item);
    boolean isFull();
    boolean isEmpty();
    int size();
}
