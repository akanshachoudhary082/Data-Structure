package com.app.dupremove;

public class LinkedList {

	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public boolean insert(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			return true;
		}
		if(head == null) {
			head = newNode;
			return true;
		}
		return false;
	}
	// Method to remove duplicates from a sorted linked list
    public void removeDuplicates() {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null && temp.getNext() != null) {
            if (temp.getData() == temp.getNext().getData()) {
                temp.setNext(temp.getNext().getNext()); // Skip the duplicate node
            } else {
                temp = temp.getNext(); // Move to the next node
            }
        }
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
  