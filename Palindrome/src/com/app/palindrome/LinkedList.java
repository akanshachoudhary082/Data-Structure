package com.app.palindrome;

public class LinkedList {

	private Node head;

	public LinkedList() {
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

	public boolean isPalindrome() {
		if (head == null || head.getNext() == null) {
			return true;

		}
		// Step 1: Find the middle of the linked list
		Node n1 = head;
		Node n2 = head;

		if (n2.getNext() != null || n2.getNext().getNext() != null) {
			n1 = n1.getNext();
			n2 = n2.getNext().getNext();

		}
		// Step 2: Reverse the second half of the linked list

		Node secondHalf = reverse(n1.getNext());
		// Step 3: Compare the first half and the reversed second half
		Node firstHalf = head;
		while(secondHalf!=null) {
			if(firstHalf.getData() != secondHalf.getData()) {
				return false;
			}
			firstHalf = firstHalf.getNext();
			secondHalf = secondHalf.getNext();
			
		}
		return false;
	}

	public Node reverse(Node head) {
		
		
		Node n1 = head ;
		Node n2 = head.getNext();
		
		while(n2!=null) {
			Node n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 =n3;
		}
		head.setNext(null);
		return head = n1;
		
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
