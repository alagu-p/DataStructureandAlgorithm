package numbers;

import java.util.Scanner;

public class Integer2Binary {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int number=scanner.nextInt();
		// Way -1
		i2bArray(number);
		// way-2 inbuild conversion
		System.out.println("Binary "+Integer.toBinaryString(number));
		//way-3
		String binary="";
		while(number!=0)
		{
			int digit=number%2;
			binary=digit+binary;
			number /=2;
		}
		System.out.println("The Binary is : "+binary);
		scanner.close();
		
		
		

	}

	private static void i2bArray(int number) {
		
		int[] binary=new int[10];
		int i=0;
		while(number !=0)
		{
			binary[i]=number%2;
			number/=2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
			System.out.print(binary[j]+" ");
		
	}

}
