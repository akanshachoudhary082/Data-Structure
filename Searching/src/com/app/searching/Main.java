package com.app.searching;
import java.util.Scanner;
import static com.app.searching.BinarySearching.binarySearch;
public class Main {

	public static void main(String[] args) {
		
		int[] array = {2,3,4,5,10,40};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the target value");
		int key = sc.nextInt();
		
		int result = binarySearch(array,key);
		
		if(result == -1) {
			System.out.println("element not prsent in the array");
			
		}else {
			System.out.println("element found at index "+result);
		}
	}

	
}
