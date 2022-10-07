package strings;

import java.util.Scanner;

public class DuplicateCharGenerator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String text=sc.nextLine();
		//way -1
		usingSBDuplicate(text);
		//way-2
		System.out.print("Duplicate Word : ");
		for(int i=0;i<text.length();i++)
		{
			System.out.print(text.charAt(i)+""+text.charAt(i));
		}
		
		sc.close();

		
	}

	private static void usingSBDuplicate(String text) {
		StringBuffer s=new StringBuffer()	;
		for(int i=0;i<text.length();i++)
		{
			s.append(text.charAt(i));
			s.append(text.charAt(i));
			
		}
		System.out.println("Duplicate String : "+s);
		
	}
	

}
