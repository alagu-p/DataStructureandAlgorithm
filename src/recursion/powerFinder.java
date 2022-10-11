package recursion;

import java.util.Scanner;

public class powerFinder {
	public static long power(int base, int exponent) {
		if(exponent ==1)
			return base;
		else
			return base *power(base,exponent-1);
	}

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in) ;
		int num=sc.nextInt();
		System.out.println("Enter the Base Value : ");
		int base=sc.nextInt();
		System.out.println("Power : "+power(num,base));
		sc.close();
		
	}

}
