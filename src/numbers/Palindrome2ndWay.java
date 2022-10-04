package numbers;

import java.util.Scanner;

public class Palindrome2ndWay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		String number=sc.nextLine();
		StringBuffer sb=new StringBuffer(number);
		String reversedNumber=sb.reverse().toString();
		System.out.println(number.equals(reversedNumber)?"Palindrome" :"Not a Palindrome");
		sc.close();

	}

}
