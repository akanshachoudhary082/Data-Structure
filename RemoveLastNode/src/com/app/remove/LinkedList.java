package com.app.remove;

public class LinkedList {

	private Node head;

	LinkedList() {
		head = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return true;
		}
		Node temp = head;
		while (temp.getNext() != null) {
			if (temp.getData() == data) {
				return false;
			}
			temp = temp.getNext();
		}
		if (temp.getData() == data) {
			return false;
		}
		temp.setNext(newNode);
		return true;

	}

	public boolean delByVal(int data) {
		if(head == null) {
			return false;
		}
		
		if(head.getData()== data) {
			head = head.getNext();
			return true;
		}
	
		Node prev = head;
		Node del = head;
		
		while (del != null) {
            if (del.getData() == data) {
                prev.setNext(del.getNext()); // Remove the node
                return true;
            }
            prev = del;
            del = del.getNext();
        }
        return false; // Node not found
    
//		while(del.getData()!= data) {
//			prev = del;
//			del= del.getNext();
//			if(del == null) {
//				return false;
//			}
//			
//			prev.setNext(del.getNext());
//			return true;
//		}
		

	}
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData() + "");
			temp = temp.getNext();
		}
		System.out.println();
	}
}
