package com.app.bubblesort;
import static com.app.bubblesort.BubbleSort.bubbleSort;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 34, 56, 23, 10 };

		System.out.println("unsorted array: ");
		for (int i : arr) {
			System.out.println(i + "");
		}
		System.out.println();
		
		bubbleSort(arr);
		
		System.out.println("sorted array :");
		for(int i : arr) {
			System.out.println(i + "");
		}
	}
	 
}
