package arraysAndMatrix;

import java.util.Scanner;

public class ArrayMinandMax {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements : ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
	
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
			
		}
		System.out.println("Maximum value : "+max);
		System.out.println("Minimum value : "+min);

		sc.close();
	}

}
