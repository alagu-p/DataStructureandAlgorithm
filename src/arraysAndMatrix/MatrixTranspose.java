  package arraysAndMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows  : ");
		int row=sc.nextInt();
		System.out.println("Enter the Number of rows  : ");
		int column=sc.nextInt();
		int arr[][]=new int[row][column];
		int arr1[][]=new int[column][row];
	
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
				arr[i][j]=sc.nextInt();
		}
		
		
		// Transpose
		for(int i=0;i<column;i++)
		{
		for(int j=0;j<row;j++)
		{
			arr1[i][j]=arr[j][i];
	
		}
		}
		
		
		
	
		
		System.out.println(""+Arrays.deepToString(arr1));
		System.out.println(""+Arrays.deepToString(arr));
		sc.close();
	}

}
