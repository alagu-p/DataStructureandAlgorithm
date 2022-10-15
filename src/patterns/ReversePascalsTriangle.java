package patterns;

import java.util.Scanner;

public class ReversePascalsTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number  : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();	
	}
		for(int i=num;i>=1;i--)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<i;k++)
				System.out.print("*");
			System.out.println();	
	}
		
		
	
		sc.close();
	}

}
