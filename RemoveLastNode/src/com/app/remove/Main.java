package com.app.remove;

public class Main{
public static void main(String[] args) {
    // Create an instance of CustomLinkedList
    LinkedList list = new LinkedList();
    
    // Insert elements into the list
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);
    list.display();
    
//    System.out.println("original list:");
//    list.display();
    
    boolean removed = list.delByVal(50);
    System.out.println("Removed 50 :" + removed);
    System.out.println("remove node");
    list.display();
}
}