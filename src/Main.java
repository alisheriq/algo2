public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("France");
        myArrayList.add("Alaska");
        myArrayList.add("Britain");
        myArrayList.add("India");
        myArrayList.add("Austria");
        myArrayList.sort();
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.get(4));
        //checkComp - function to check if number is Composite or prime
        // count - counter of total division % == 0
        //n - number to check for Composite of Prime
        //check - number to check division n times inside the function checkComp, it will decrease every iteration

    }
}