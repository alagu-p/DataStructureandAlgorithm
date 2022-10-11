package arraysAndMatrix;

import java.util.Scanner;

public class SumOfPositiveAndNegative {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements : ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		int positive=0, negative=0;
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>0 && arr[i]!=0)
				positive+=arr[i];
			else if(arr[i]<0 && arr[i] !=0)
				negative +=arr[i];
		}
		System.out.println("Positive : "+positive);
		System.out.println("Negative : "+negative);
		sc.close();
	}

}
