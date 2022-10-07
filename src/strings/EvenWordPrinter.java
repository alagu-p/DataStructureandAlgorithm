package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenWordPrinter {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String text=sc.nextLine();
		//Manual find lenth:
		evenwordPrinter(text);
		//Using Split method
		spiltword(text);
		//Using Tokenizer 
		StringTokenizer tokenizer=new StringTokenizer(text);
		
		System.out.print("\n Even Words : ");
		while(tokenizer.hasMoreElements())
		{
			String eachToken=tokenizer.nextToken();
			if(eachToken.length() %2==0)
			{
				System.out.print(eachToken+" ");
			}
			
			
		}
		sc.close();
	}

	private static void spiltword(String text) {
		System.out.print("\nSplit words : ");
		String[] text2 =text.split(" ");
		for(int i=0;i<text2.length;i++)
		{
			if(text2[i].length()%2==0)
			{
				System.out.print(text2[i]+" ");
				
			}
		}
		
		
	}

	private static void evenwordPrinter(String text) {
		text +=" ";
		String temp="";
		System.out.print("Manully split even Word : ");
		for(int i=0; i<text.length();i++)
		{
			
			if(text.charAt(i) !=' ')
			{
				temp +=text.charAt(i);
				continue;
			}
			if(temp.length()%2==0)
				System.out.print(temp+" ");
			temp="";
		}
		
	}

}
