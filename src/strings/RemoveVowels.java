package strings;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String text=sc.nextLine();
		//method -1
		System.out.println("Remove vowels using inbuild Function : "+text.replaceAll("[aeiou]", ""));
		//method-2
		//remove lower case also
		String s1=text.toLowerCase();
		StringBuffer output=new StringBuffer();
		for(int i=0;i<s1.length();i++)
		{
			char c=(s1.charAt(i));
			if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' )
			{
				continue;
			}
			else {
				output.append(text.charAt(i));
				
			}
			
		}
		System.out.println("Remove Vowels : "+output);
		sc.close();
	}

}
