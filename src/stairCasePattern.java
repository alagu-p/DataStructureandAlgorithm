
public class stairCasePattern {

	public static void main(String[] args) {
		int n=5;
		//staircase printing
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
				System.out.print(" ");
			for(int k=0;k<i+1;k++)
				System.out.print("#");
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
				System.out.print(" ");
			for(int k=0;k<i+1;k++)
				System.out.print("#");
			System.out.println();
		}

	}

}
