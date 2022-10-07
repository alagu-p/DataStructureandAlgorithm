package strings;

import java.util.Scanner;

public class FindMaxOccurences {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String text=sc.nextLine();
		int arr[] =new int[256];		
		for(int i=0;i<text.length();i++)
		{
			arr[(int)text.charAt(i)]++;
	
		}
		int max=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>arr[max])
			{
				max=j;
				
			}
		}
		System.out.println("Max occuring character is : "+(char)max+" : "+arr[max]);
		
		
		sc.close();
		
	}

}
