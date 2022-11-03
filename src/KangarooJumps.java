import java.util.Scanner;

public class KangarooJumps {

	
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int v1=sc.nextInt();
		int x2=sc.nextInt();
		int v2=sc.nextInt();
		
		String s=kangaroo(x1,v1,x2,v2);
		
		System.out.println(s);

	}

	private static String kangaroo(int x1, int v1, int x2, int v2) {
		String s="No";
		for(int i=x1,j=x2;i<=1000;i+=v1,j+=v2)
		{
			if(i==j)
				s="yes";
			
		}
		
		return s;
		
	}

}
