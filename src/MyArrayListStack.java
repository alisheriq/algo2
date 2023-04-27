import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    private MyArrayList arr;

    MyArrayListStack() {
        arr = new MyArrayList();
    }

    public void push(T item) {
        arr.add(item, 0);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T element = (T) arr.get(0);
        arr.remove(0);
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) arr.get(0);
    }
    public boolean isEmpty() {
        if (arr.size() == 0) return true;
        return false;
    }
    public int getSize() {
        return arr.size();
    }
}

