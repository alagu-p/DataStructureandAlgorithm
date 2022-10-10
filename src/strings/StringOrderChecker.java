package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringOrderChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String text=sc.nextLine();
		char[] charArray=text.toCharArray();
		Arrays.sort(charArray);
		System.out.println("String is Ordered : "+new String(charArray).equals(text));;
		
		sc.close();

	}

}
