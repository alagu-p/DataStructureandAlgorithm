package strings;

import java.util.Scanner;

public class FindIftheStringhasGoldInIt {

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String text=sc.nextLine(),s="gold";
		
		text=text.toLowerCase();
		boolean found=false;
		for(int i=0;i<text.length();i++)
		{
			//k is PlaceHolder
			int k=i,j;
			for( j=0;j<s.length();j++)
			{
				if(text.charAt(k) !=s.charAt(j))
				{ 
					break;
				}
				//increment inside text index value
				k++;	
			}
			if(j==s.length()) {
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("Yapp... Gold Found.");
		else
			System.out.println("Nopp... Gold not found.");
		
		
		sc.close();

	}

}
