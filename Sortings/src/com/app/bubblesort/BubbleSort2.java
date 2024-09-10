package com.app.bubblesort;

import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elemenys in the array:");
		
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//print original array
		
		System.out.println("Original array :");
		for(int num : arr)
		{
			System.out.println(num + " ");
		}
		
		bubbleSort(arr);
		
		System.out.println("Sorted array");
		for(int num : arr)
		{
			System.out.println(num + " ");
		}
	}
	
	public static void bubbleSort(int arr[])
	{
		int n = arr.length;
		
		
		for(int i=0;i<n-1;i++)
		{
			boolean swapped = false;
			
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]> arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			//if no swapped were made ,the array is sorted
			if(!swapped)
			{
			break;
			}
		}
	
	}
}
