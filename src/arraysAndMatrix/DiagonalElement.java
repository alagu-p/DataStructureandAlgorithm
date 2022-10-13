package arraysAndMatrix;

import java.util.Scanner;

public class DiagonalElement {

	/*
	 * 1 2 3
	 * 4 5 6
	 * 7 8 9 
	 * the DiagonalElement =1,5 9
	 * i==j
	 */
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
		// 
		System.out.println("Matrix Diagonal : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++) {
				if(i==j)
					System.out.print(arr[i][j]+" ");
				}
			}
	sc.close();
		
	}

}
