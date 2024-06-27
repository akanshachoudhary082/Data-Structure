
package com.app.ques2;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList(); 
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		list.display();
		
		System.out.println(" middle element "+list.findMiddle());
	}
}
