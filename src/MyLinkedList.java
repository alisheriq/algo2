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
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void add(T item, int index) {

    }


    @Override
    public void remove(T item) {
    }

    @Override
    public void clear() {

    }
}