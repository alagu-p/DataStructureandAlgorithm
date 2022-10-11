package numbers;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromUserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+"  value.");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
