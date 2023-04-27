import java.util.NoSuchElementException;
public class MyLinkedListQueue<T>{
    private MyLinkedList<T> arr;
    public MyLinkedListQueue() {
        arr = new MyLinkedList<T>();
    }
    public void enqueue(T item) {
        arr.add(item, arr.size() - 1);
    }
}
