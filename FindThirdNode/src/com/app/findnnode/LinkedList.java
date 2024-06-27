package com.app.findnnode;

public class LinkedList {

	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
//		if(head == null) {
//			
//			return false;
//		}
		if (head == null) {
			head = newNode;
			return true;
		}
		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		return false;

	}
	
	public Node findThirdPosition() {
		
		if(head == null || head.getNext()==null || head.getNext().getNext()==null) {
			return null;
		}
		Node  findThirdPosition = head.getNext().getNext();
		return findThirdPosition;
	}
		
	
	// for duplicate data it is use

//		Node temp = head;
//		while(temp!=null) {
//			if(temp.getData()==data) {
//				return false;
//			}
//			if(temp.getNext()==null) {
//				temp.setNext(newNode);
//				return true;
//			} 
//			temp=temp.getNext();
//		}
//		return false;
//	}
//	

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData() + "");
			temp = temp.getNext();
		}
	}
}
