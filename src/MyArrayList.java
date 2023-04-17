public class MyArrayList<T> implements MyList<T>{

    private Object[] arr;
    private int size;

    MyArrayList(){
        this.arr = (Object[]) new Object[5];
        this.size = 0;
    }

    @Override
    public void add(Object item) {
        if(size == arr.length){
            increaseBuffer();
        }
        arr[size++] = item;
    }
    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) arr[index];
    }
    @Override
    public void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }

    private void increaseBuffer(){
        Object[] newArr = (Object[]) new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for(int i= index + 1; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
    }

    @Override
    public void add(T item, int index) {

    }

    @Override
    public void remove(T item) {

    }
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }
    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}
