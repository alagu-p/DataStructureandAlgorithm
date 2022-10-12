package arraysAndMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class LastMElement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements : ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Last M Element : ");
		int m=sc.nextInt();
		
		
		if(m<num) {
			System.out.println("The "+m+"  elements : ");
			m=num-m;
		for(int i=m;i<arr.length;i++)
		{
			System.out.print(arr[i] +",");
		}
	}
	else {
		System.out.println("invalid input");
	}
		
		sc.close();
	}

}
