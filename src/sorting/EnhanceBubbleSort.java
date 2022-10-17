package sorting;

import java.util.Arrays;

public class EnhanceBubbleSort {

	public static void main(String[] args) {

		int arr[]= {25,35,15,10,5,3};
		System.out.println("Unsorted Array : "+Arrays.toString(arr));
	
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
					
			}
		}
		System.out.println("Enhanced Bubble Sort : "+Arrays.toString(arr));
	}

}
