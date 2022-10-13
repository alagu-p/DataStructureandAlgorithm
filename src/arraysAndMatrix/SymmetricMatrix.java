package arraysAndMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class SymmetricMatrix {
	/*
	 *  A symmetric matrix is a square matrix in which the 
	 *  transpose of the squate matrix is the same as the original square matrix.
	 *  
	 */

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of row  : ");
		int row=sc.nextInt();
		System.out.println("Enter the Number of column  : ");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		int transposeArr[][]=new int[row][col];
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				arr[i][j]=sc.nextInt();
		}
		//transpose
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				transposeArr[i][j]=arr[j][i];
		}
		// symmetric or not 
		//using count
		int count =0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				{
					if(arr[i][j]==transposeArr[i][j])
					{
						count++;
					}
				}
		}
		if(row*col==count)
			System.out.println("Symmetric Matrix ");
		else
			System.out.println("Not symmetric Matrix .");
		// alternative
		boolean flag =true;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				{
					if(arr[i][j] != transposeArr[i][j])
					{
						flag=false;
					}
				}
		}
		if(flag)
			System.out.println("Symmetric Matrix ");
		else
			System.out.println("Not symmetric Matrix .");
		

		System.out.println("Original Array : "+Arrays.deepToString(arr));
		System.out.println(" Transpose Array : "+Arrays.deepToString(transposeArr));
		
	}

}
