public class Main {
    public static void main(String[] args) {
        /*
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(8,2);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(4));*/
        MyArrayListStack myArrayListStack = new MyArrayListStack();
        System.out.println(myArrayListStack.isEmpty());
        myArrayListStack.push("1");
        myArrayListStack.push("2");
        System.out.println(myArrayListStack.getSize());
        System.out.println(myArrayListStack.peek());
        System.out.println(myArrayListStack.pop());
        System.out.println(myArrayListStack.pop());
        System.out.println(myArrayListStack.getSize());
    }
}