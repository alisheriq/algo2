public class MyArrayList<T> implements MyList<T>{

    private Object[] arr;
    private int size, index;

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
    public void add(Object item, int index){
        checkIndex(index);
        if(size == arr.length){
            increaseBuffer();
        }
        size++;
        for(int i= size-1; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = item;
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
    public void remove(T item) {
        remove(indexOf(item));
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean contains(Object o) {
        for(int i= 0; i<size; i++){
            if(arr[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        this.arr = (Object[]) new Object[arr.length];
        this.size = 0;
        this.index = 0;
    }
    @Override
    public int indexOf(Object o) {
        for(int i= 0; i<size; i++){
            if(arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        index = -1;
        for(int i= 0; i<size; i++){
            if(arr[i].equals(o)){
                index = i;
            }
        }
        return index;
    }
    @Override
    public void sort() {
        boolean swapped = true;
        int n = size;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (((Comparable) arr[i-1]).compareTo(arr[i]) > 0) {
                    Object temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        }
    }
}
