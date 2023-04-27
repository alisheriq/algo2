public class MyArrayList<T> implements MyList<T>{

    // arr - array used to store elements
    // size - number of elements in the array
    // index - index of last searched element in the array
    private Object[] arr;
    private int size, index;

    MyArrayList(){
        this.arr = (Object[]) new Object[5];
        this.size = 0;
    }

    // add(item) - adds an item to the end of the array, increase the buffer if the array is full
    @Override
    public void add(Object item) {
        if(size == arr.length){
            increaseBuffer();
        }
        arr[size++] = item;
    }

    // add(item, index) - adds an item to the specified index, shift the elements to the right to make room for the new item, increase the buffer if the array is full
    @Override
    public void add(Object item, int index){
        if (index != 0) checkIndex(index);
        if(size == arr.length){
            increaseBuffer();
        }
        size++;
        for(int i= size-1; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = item;
    }

    public void addArray(Object[] array){
        if(size == arr.length){
            increaseBuffer();
        }
        for(int i= 0; i<array.length; i++){
            arr[size++] = array[i];
        }
    }
    // get(index) - returns the item at the specified index
    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) arr[index];
    }
    // checkIndex(index) - checks if the specified index is valid, throws an IndexOutOfBoundsException if it's not
    @Override
    public void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }
    // increaseBuffer() - doubles the size of the array when it's full, copies the existing elements to the new array
    private void increaseBuffer(){
        Object[] newArr = (Object[]) new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    // remove(index) - removes the item at the specified index, shifts the elements to the left to fill the gap
    @Override
    public void remove(int index) {
        checkIndex(index);
        for(int i= index + 1; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
    }
    // remove(item) - removes the first occurrence of the specified item from the array
    @Override
    public void remove(T item) {
        remove(indexOf(item));
    }
    // size() - returns the number of elements in the array
    @Override
    public int size() {
        return size;
    }

    // contains(o) - returns true if the array contains the specified object, false otherwise
    @Override
    public boolean contains(Object o) {
        for(int i= 0; i<size; i++){
            if(arr[i].equals(o)){
                return true;
            }
        }
        return false;
    }
    // clear() - clears the array and resets the size and index to 0
    @Override
    public void clear() {
        this.arr = (Object[]) new Object[arr.length];
        this.size = 0;
        this.index = 0;
    }
    // indexOf(o) - returns the index of the first occurrence of the specified object, returns -1 if the object is not found
    @Override
    public int indexOf(Object o) {
        for(int i= 0; i<size; i++){
            if(arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    // lastIndexOf(o) - returns the index of the last occurrence of the specified object, returns -1 if the object is not found
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
    // sort() - sorts the elements in the array in ascending order using the compareTo method of Comparable interface.
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
    public void sortSublist(int index1, int index2){
        checkIndex(index1);
        checkIndex(index2);
        boolean swapped = true;
        while(swapped){
            swapped= false;
            for(int i = index1; i<index2+1;i++){
                if(((Comparable)arr[i-1]).compareTo(arr[i])>0){
                    Object temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            index2--;
        }
    }
}
