public class MyArrayList<T> implements MyList<T>{

    private Object[] arr;
    private int size, index;

    MyArrayList(){
        this.arr = (Object[]) new Object[5];
        this.size = 0;
        this.index = 0;
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
    public int size() {
        return size;
    }
    @Override
    public void add(T item, int index) {

    }

    @Override
    public void remove(T item) {

    }

    @Override
    public boolean contains(Object o) {
        for(int i= 0; i<size; i++){
            if(arr[i] == o){
                index = i;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {

    }
    @Override
    public int indexOf(Object o) {
        if(contains(o)){
            return index;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}
