package strings;

import java.util.Scanner;

public class StringEncoder {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String text=sc.nextLine();
		String s="";
		//method -1
		System.out.print("Encode String : ");
		for(int i=0;i<text.length();i++)
		{
			char temp=(char) (text.charAt(i)+1);
			s=s+(char)(text.charAt(i)+1);
			System.out.print(temp);
		}
		//method -2
		System.out.println("\nEncode String : "+s);

		sc.close();
	}

}
