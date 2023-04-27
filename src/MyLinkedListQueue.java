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
        T element = arr.get(0);
        arr.remove(0);
        return element;
    }
    public T peek(){
        return arr.get(0);
    }
    public boolean isEmpty() {
        if (arr.size() == 0) return true;
        return false;
    }
    public int size() {
        return arr.size();
    }
}
