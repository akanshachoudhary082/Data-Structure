package com.app.stack;

import java.util.Stack;

public class isPalindrome {

	public static boolean isPalindrome(String str) {
		
		Stack<Character>stack = new Stack();
		
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) != stack.pop()) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		//Stack<Character>stack = new Stack();
		
		String input="radar";
		System.out.println("the string"+input + "ias a palindrome"+isPalindrome(input));
		
		
		String input2="hello";
		System.out.println("the string"+input + "ias a palindrome"+isPalindrome(input2));
		
	}
}
