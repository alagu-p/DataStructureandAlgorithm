package numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number=sc.nextInt();
		
		for(int i=1;i<number;i++)
		{
			int count=0;
			if(i>1)
			{
			for(int j=2;j<i;j++)
			{
				if(i%j ==0)
					count++;
			}
			if(count==0)
				System.out.println(i);
		
		}
		}
		sc.close();
	}

}
