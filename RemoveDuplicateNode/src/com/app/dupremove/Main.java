package com.app.dupremove;



public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(3);
		System.out.println("originl list:");
		list.display();
		list.removeDuplicates();
		
		System.out.println("remove duplicates");
		list.display();
	}

	

}
