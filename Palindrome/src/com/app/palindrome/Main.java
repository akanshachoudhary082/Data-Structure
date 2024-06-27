package com.app.palindrome;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

		list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);
		list.display();
		
		boolean palindrome = list.isPalindrome();
		System.out.println("is it is palindrome :"+palindrome);
	}

}
