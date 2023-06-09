# Assigments 2 & 3 by Alisher Kulbossynov
# Course: Algorithms and Data Structures
# Teacher: Nursultan Khaimuldin
---

## Tasks from
- [Assignment 2](https://moodle.astanait.edu.kz/mod/assign/view.php?id=80149)
- [Assignment 3](https://moodle.astanait.edu.kz/mod/assign/view.php?id=81243)

## Build
IntelliJ IDEA
- I used v2022.3.1

## Explanation of the Assignment 2
<details>
<summary>myArrayList class</summary>
The MyArrayList class is a generic class that implements the MyList interface. It represents a dynamic array that can hold objects of any type. 
Here is a description of each method in the class:
 
MyArrayList(): This is the constructor of the class. It creates a new MyArrayList object with an initial capacity of 5 elements.

add(Object item): This method adds the specified item to the end of the array. If the array is full, the method calls increaseBuffer() to double its size.

add(Object item, int index): This method adds the specified item at the specified index in the array. If the array is full, the method calls increaseBuffer() to double its size. It also shifts all the elements to the right of the specified index to make space for the new element.

get(int index): This method returns the element at the specified index in the array. It throws an IndexOutOfBoundsException if the index is out of bounds.

checkIndex(int index): This is a helper method that checks if the specified index is within bounds of the array. If the index is out of bounds, it throws an IndexOutOfBoundsException.

increaseBuffer(): This is a helper method that doubles the capacity of the array.

remove(int index): This method removes the element at the specified index from the array. It also shifts all the elements to the right of the specified index to the left to fill the gap.

remove(T item): This method removes the first occurrence of the specified item from the array by calling remove(int index).

size(): This method returns the number of elements in the array.

contains(Object o): This method checks if the array contains the specified object. It returns true if the object is found, and false otherwise.

clear(): This method clears the array by creating a new array of the same size and setting the size to 0.

indexOf(Object o): This method returns the index of the first occurrence of the specified object in the array. If the object is not found, it returns -1.

lastIndexOf(Object o): This method returns the index of the last occurrence of the specified object in the array. If the object is not found, it returns -1.

sort(): This method sorts the elements in the array in ascending order using the bubble sort algorithm. The elements must be Comparable.

</details>

<details>
<summary>myLinkedList class</summary>
MyLinkedList is a class that implements the MyList interface. The MyLinkedList class represents a singly linked list data structure that allows for fast adding and removing of elements.
 
public int size(): Returns an int representing the number of elements in the linked list.
 
public void add(T item): Adds an element to the end of the list.
 
public void add(T item, int index): Adds an element at the specified index.
 
public T get(int index): Returns the element at the specified index in the list.
 
public void remove(int index): Removes the element at the specified index from the list.
 
public void checkIndex(int index): Throws an IndexOutOfBoundsException if the given index is out of range.
 
public boolean contains(Object o): Finds the specified element in the linked list.
 
public int indexOf(Object o): Returns the index of the first occurrence of the specified element in the list, or -1 if not found.
 
public int lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in the list, or -1 if not found.

private class Node: A nested private class representing a node in the linked list. It has the following properties:

private T element: The data stored in each node of the list.
 
private Node next: A reference to the next node in the list.
 
private Node prev: A reference to the previous node in the list.
 
public Node(T element, Node next, Node prev): A constructor for the Node class that takes in an element, a reference to the next node, and a reference to the previous node.
</details>

## Explanation of the Assignment 3
<details>
<summary>MyArrayListStack class</summary>
 
The MyArrayListStack class is an implementation of a stack using an ArrayList data structure. It provides the following methods:

MyArrayListStack() - Constructs a new MyArrayListStack object.
 
push(T item) - Adds the specified element to the top of the stack.

pop() - Removes and returns the top element of the stack. Throws an EmptyStackException if the stack is empty.

peek() - Returns the top element of the stack without removing it. Throws an EmptyStackException if the stack is empty.

isEmpty() - Returns a boolean indicating whether the stack is empty or not.

getSize() - Returns the number of elements in the stack.
</details>

<details>
<summary>MyLinkedListQueue class</summary>
 
The MyLinkedListQueue class is an implementation of a queue using a linked list data structure. It provides the following methods:

MyLinkedListQueue() - Constructs a new MyLinkedListQueue object.
 
enqueue(T item) - Adds the specified element to the back of the queue.
 
dequeue() - Removes and returns the front element of the queue. Throws a NoSuchElementException if the queue is empty.
 
peek() - Returns the front element of the queue without removing it. Throws a NoSuchElementException if the queue is empty.
 
isEmpty() - Returns a boolean indicating whether the queue is empty or not.
 
size() - Returns the number of elements in the queue.
</details>

## Install
 Copy the code from Main.java file to your project.  
 **IMPORTANT:** You will need to remove the comments to run the code.

## Download
Compiled binary material can be found at [releases](https://github.com/alisheriq/algorithms/tree/master/src).

## License
Majority of the source code is written by myself.
Any use of code without my permission is prohibited.
