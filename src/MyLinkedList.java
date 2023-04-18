public class MyLinkedList<T> implements MyList<T> {
    private class Node {
        private T element;
        private Node next;
        private Node prev;

        public Node(T element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    // Node - a nested private class representing a node in the linked list
    // element - the data stored in each node of the list
    // next - a reference to the next node in the list
    // prev - a reference to the previous node in the list

    private Node head;
    private Node tail;
    private int size;
    // head - a reference to the first node in the list
    // tail - a reference to the last node in the list
    // size - the number of elements in the list
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    //size() method returns an int representing the number of elements in the linked list.
    @Override
    public int size() {
        return size;
    }

    // add - a method that adds an element to the end of the list or at a specified index
    @Override
    public void add(T item) {
        Node newNode = new Node(item, null, tail);
        if (tail == null) {
            head = newNode;
        } else
        {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }


    @Override
    public void add(T item, int index) {
        checkIndex(index);
        Node newNode = new Node(item, null, null);
        if (index == size) { // adding at the end
            if (tail == null) { // empty list
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        } else if (index == 0) { // adding at the beginning
            if (head == null) { // empty list
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        } else { // adding in the middle
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
        }
        size++;

    }
    // get - a method that returns the element at the specified index in the list
    // returns the element at the specified index in the linked list.
    @Override
    public T get(int index) {
        checkIndex(index);
        Node current;
        if (index <= size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        }
        else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.element;
    }
    // remove - a method that removes the element at the specified index from the list
    @Override
    public void remove(int index) {
        checkIndex(index);
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        if (currentNode.prev == null) { // node is the head
            head = currentNode.next;
        } else {
            currentNode.prev.next = currentNode.next;
        }
        if (currentNode.next == null) { // node is the tail
            tail = currentNode.prev;
        } else {
            currentNode.next.prev = currentNode.prev;
        }
        size--;
    }

    // checkIndex - a method that throws an IndexOutOfBoundsException if the given index is out of range
    @Override
    public void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }

    // contains - a method that finds object in linked list
    // returns a boolean indicating whether the specified element is present in the linked list.
    @Override
    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    // indexOf - a method that returns the index of the first occurrence of the specified element in the list, or -1 if not found

    @Override
    public int indexOf(Object o) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.element.equals(o)) {
                return count;
            }
            count++;
            current = current.next;
        }
        return -1;
    }
    // lastIndexOf - a method that returns the index of the last occurrence of the specified element in the list, or -1 if not found
    @Override
    public int lastIndexOf(Object o) {

        Node current = head;
        int last = -1;
        int count = 0;
        while (current != null) {
            if (current.element.equals(o)) {
                last = count;
            }
            count++;
            current = current.next;
        }
        return last;
    }


    @Override
    public void remove(T item) {
        remove(indexOf(item));
    }
    // sort - a method that sorts the elements of the list in ascending order
    @Override
    public void sort() {
        boolean swapped;
        Node current;
        Node last = null;
        T temp;

        // Edge case: empty or one-element list
        if (size <= 1) {
            return;
        }

        do {
            swapped = false;
            current = head;
            while (current.next != last) {
                if (((Comparable<T>)current.element).compareTo(current.next.element) > 0) {
                    // Swap adjacent elements
                    temp = current.element;
                    current.element = current.next.element;
                    current.next.element = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }
    // clear - a method that removes all elements from the list
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}