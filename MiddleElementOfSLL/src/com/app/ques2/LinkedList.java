/*
 * 2.How do you find the middle element of a singly linked list in one pass? 
 */
package com.app.ques2;

public class LinkedList {

 	private Node head;

 	public LinkedList() {
 		head = null;
 	}

 	//insert a new node 

 	public boolean insert(int data) {

 		Node newNode = new Node(data);

 		if(head==null) {
 			head = newNode;
 			return true;
 		}

 		Node temp = head;

 		while(temp!=null) {
 			if(temp.getData()==data) {
 				return false;
 			}
 			if(temp.getNext()==null) {
 				temp.setNext(newNode);
 				return true;
 			}
 			temp=temp.getNext();
 		}
 		return false;
 	}
		//method to find middle emlement

		public int findMiddle() {
 			if(head==null) {
 				throw new IllegalStateException("List is empty");
 			}

 		Node slow = head;
		Node fast = head;

 		while(fast!=null && fast.getNext()!=null) {

 			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow.getData();

 }
 		public void display() {
 			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.getData()+"");
				temp = temp.getNext();
			}
 		}
 	}

