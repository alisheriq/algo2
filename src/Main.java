public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("England");
        myLinkedList.add("France");
        myLinkedList.add("Norway");
        myLinkedList.add("Japan");
        myLinkedList.add("Russia");
        myLinkedList.add("Kazakhstan",2);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(4));
        System.out.println(myLinkedList.get(5));

    }
}