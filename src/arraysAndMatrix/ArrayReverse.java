package arraysAndMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements : ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		int[] revArr=new int[num];
		
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0,j=arr.length;i<revArr.length;i++,j--)
			revArr[j-1]=arr[i];
		System.out.println(Arrays.toString(revArr));
		sc.close();
	}

}
