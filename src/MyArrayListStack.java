import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    private MyArrayList arr;
    MyArrayListStack(){
        arr = new MyArrayList();
    }
    public void push(T item){
        arr.add(item, 0);
    }
}
