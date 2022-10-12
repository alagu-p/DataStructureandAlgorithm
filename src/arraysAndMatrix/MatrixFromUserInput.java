package arraysAndMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixFromUserInput {

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
		/*
		 * note 
		 * inbuild Function
		 * 1D array print use :==> Arrays.toString(arr);
		 * 2D array print use ==> Arrays.deepToString(arr);
		 */
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(arr).replace("],","\n").replace(",","\t| ")
                .replaceAll("[\\[\\]]", " "));
		sc.close();
		
	}

}
