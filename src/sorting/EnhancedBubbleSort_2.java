package sorting;

import java.util.Arrays;

public class EnhancedBubbleSort_2 {

	public static void main(String[] args) {
		int arr[]= {25,35,15,10,5,3};
		System.out.println("Unsorted Array : "+Arrays.toString(arr));
		boolean swapped=true;
		int i=0;
		
		//already sorted find
		while(swapped) {
			swapped=false;
			i++;
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
					
			}	
		}
		System.out.println("Enhanced Bubble Sort : "+Arrays.toString(arr));
	}


}
