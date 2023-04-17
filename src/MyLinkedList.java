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


    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public int size() {
        return size;
    }

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


    @Override
    public void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }

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

    @Override
    public void sort() {

    }

    @Override
    public void clear() {

    }
}