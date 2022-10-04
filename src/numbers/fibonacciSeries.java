package numbers;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number=sc.nextInt();
		int firstNum=0,secNum=1,thirdNum;
		System.out.print(firstNum+" "+secNum);
		for(int i=2;i<number;i++)
		{
			thirdNum=firstNum+secNum;
			firstNum=secNum;
			secNum=thirdNum;
			System.out.print(" " +thirdNum);
		}
		sc.close();
	}

}
