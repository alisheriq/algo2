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
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Kazakhstan");
        myLinkedList.add("Georgia");
        myLinkedList.add("Canada");
        myLinkedList.add("Pakistan");
        myLinkedList.add("Japan");
        myLinkedList.add("Iran");
        myLinkedList.sortSublist(1,5);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(4));
        System.out.println(myLinkedList.get(5));


    }
}