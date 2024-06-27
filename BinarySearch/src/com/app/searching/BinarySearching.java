package com.app.searching;

public class BinarySearching {

	public static int binarySearch(int[] array,int key) {
		
		int low = 0;// low means left high means right
		int high = array.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			//int mid = low + (high - low)/2;
			
			/*
			 * The midpoint mid is calculated using int mid = left + (right - left) / 2;. This avoids potential overflow that could occur with (left + right) / 2.
			 */
			if(array[mid] == key) {
				return mid;
			}
			if(key <= array[mid]) {
				high= mid -1; //to ignore the left part
			}
			else {
				low = mid +1; // to ignore the right part
			}
		}
		return -1;
		
	}
}
