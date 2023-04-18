public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(2);
        myLinkedList.add(1);
        myLinkedList.add(6);
        myLinkedList.add(8);
        myLinkedList.sort();
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(4));
        //checkComp - function to check if number is Composite or prime
        // count - counter of total division % == 0
        //n - number to check for Composite of Prime
        //check - number to check division n times inside the function checkComp, it will decrease every iteration

    }
}