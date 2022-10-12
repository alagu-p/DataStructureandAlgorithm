package arraysAndMatrix;

import java.util.Scanner;

public class SumOfMatrices {

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
		// sum of Each row  , column and whole array
		
		int rowsum=0,colsum=0,total=0;;
		for(int i=0;i<row;i++)
		{
			rowsum=0;
			colsum=0;
			for(int j=0;j<column;j++) {
				rowsum +=arr[i][j];
				colsum +=arr[j][i];
				total +=arr[i][j];
				if(j==column-1) {
					System.out.println("sum of row "+(i+1)+": "+rowsum);
					System.out.println("sum of column "+(i+1)+": "+colsum);
				}
			}
			
		}
		System.out.println("Total Array : "+total);
	}

}
