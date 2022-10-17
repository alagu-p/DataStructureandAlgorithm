package sorting;

import java.util.Arrays;

public class SelectionSort {
	/*
	 * Selection Sort
	 * 
	 */

	public static void main(String[] args) {

		int arr[]= {25,35,15,10,5,3};
		System.out.println("Unsorted Array : "+Arrays.toString(arr));
		
		SelectionSort selectionSort=new SelectionSort();
		selectionSort.sort(arr);
		System.out.println("Selection Sort : "+Arrays.toString(arr));
	}

	private void sort(int[] arr) {
		int min, temp, size=arr.length;
		
		for(int i=0;i<size;i++)
		{
			min=i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[j]<arr[min])
					min=j;	
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
	
		
		
		
		
	}

}
