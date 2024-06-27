package com.app.findnnode;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(6);
		list.insert(4);
		list.insert(5);
		
		System.out.println("original linled list ");
		list.display();
		
		Node findThirdPosition = list.findThirdPosition();
		if(findThirdPosition !=null) {
			System.out.println("third node from the begining "+findThirdPosition.getData()+"");
		}
		else {
			System.out.println("less than the third node");
		}
	}

}
