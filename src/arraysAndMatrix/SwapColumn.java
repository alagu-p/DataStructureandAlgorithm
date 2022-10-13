package arraysAndMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class SwapColumn {

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
		System.out.println("Enter the Column : ");
		int col1=sc.nextInt();
		int col2=sc.nextInt();
		for(int i=0;i<col;i++)
		{
			int temp=arr[i][col1-1];
			arr[i][col1-1]=arr[i][col2-1];
			arr[i][col2-1]=temp;
			
	
			
		}
		System.out.println(Arrays.deepToString(arr));
		
		//column swap
		sc.close();
	}
	

}
