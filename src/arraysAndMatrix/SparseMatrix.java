package arraysAndMatrix;

import java.util.Scanner;

public class SparseMatrix {

	/*Sparse matrix
	 * 
	 * majority of elements is zero ,it is called Sparse Matrix
	 * or else not sparse matrix 
	 * Example
	 * 	 1 4
	 *   2 3
	 *   not a sparse Matrix
	 *   1 0
	 *   0 1 ==>not a Sparse Matrix
	 *  0 0
	 *  0 3  ==> Sparse Matrix
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
		int totalElement=(row*column)/2;
		int count=0;
		
		// 
		System.out.println("Matrix Diagonal : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++) {
				if(arr[i][j]==0)
					count++;
				
				}
			}
		if(count>totalElement)
			System.out.println("Sparse Matrix .");
		else
			System.out.println("Not a Sparse Matrix .");
	sc.close();
		
	}

}
