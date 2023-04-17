public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("England");
        myLinkedList.add("France");
        myLinkedList.add("Norway");
        myLinkedList.add("Norway");
        myLinkedList.add("Norway");
        System.out.println(myLinkedList.get(0));
        myLinkedList.remove(0);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.contains("France"));
        System.out.println(myLinkedList.contains("England"));
        System.out.println(myLinkedList.indexOf("France"));
        System.out.println(myLinkedList.indexOf("Norway"));
        System.out.println(myLinkedList.lastIndexOf("Norway"));

    }
}