package sorting;

import java.util.Arrays;

public class BubbleSort {
	
	/*
	 *bubble sort making multiple path over given an array
	 *next to each other .bubble up the end of the array
	 *
	 *three important step
	 *1.loop==> loop through the array
	 *2.Compare  ==>edge's element
	 *3.swap ==> if the first element grader than second element, swap shoud happen
	 *
	 *bubbleSort(arr)
	 *		length=length(arr)
	 *		for(i=0 until length )
	 *		for(j=0 until length -1)
	 *			if(arr[j] >arr[j+1]
	 *				swap(arr,j,j+1)
	 *
	 *the worst case scario  ==> 0(n2)
	 *
	 *
	 *
	 *
	 *
	 */

	public static void main(String[] args) {
	
		int arr[] = {25,35,15,10,5,3};
		System.out.println("Unsorted Array : "+Arrays.toString(arr));
		
		for(int j=1;j<arr.length;j++)
		{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
				
		}
		}
		System.out.println("Bubble After  Sort : "+Arrays.toString(arr));

		
		
	}

}
