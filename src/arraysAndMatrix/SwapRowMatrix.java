  package arraysAndMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class SwapRowMatrix {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows  : ");
		int row=sc.nextInt();
		System.out.println("Enter the Number of rows  : ");
		int column=sc.nextInt();
		int arr[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
				arr[i][j]=sc.nextInt();
		}
		System.out.println("Enter row to swap : ");
		int row1=sc.nextInt();
		int row2=sc.nextInt();
		
		// Row Swap
		for(int i=0;i<row;i++)
		{
			int temp=arr[row1-1][i];
			arr[row1-1][i]=arr[row2-1][i];
			arr[row2-1][i]=temp;
		}
		
	
		
		System.out.println(""+Arrays.deepToString(arr));
		sc.close();
	}

}
