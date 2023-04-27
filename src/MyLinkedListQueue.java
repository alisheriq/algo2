import java.util.NoSuchElementException;
public class MyLinkedListQueue<T>{
    private MyLinkedList<T> arr;
    public MyLinkedListQueue() {
        arr = new MyLinkedList<T>();
    }
    public void enqueue(T item) {
        arr.add(item, arr.size() - 1);
    }
    public T dequeue() {
        T element = (T) arr.get(0);
        arr.remove(0);
        return element;
    }
}
