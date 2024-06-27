package com.app.rev;

public class LinkedList {

	private Node head;

	public Node getHead() {
		return head;
	}

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
		

	

	public void reverse() {
		if (head == null || head.getNext() == null) {
			return;
		}

		Node n1 = head;
		Node n2 = head.getNext();

		while (n2 != null) {
			Node n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;

		}
		head.setNext(null);
		head = n1;
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
