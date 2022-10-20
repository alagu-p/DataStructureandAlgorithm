
public class SumOfdiagonals {
	/*
	 * Given a square matrix, calculate the absolute 
	 * difference between the sums of its diagonals.
	 * 
	 * 
	 * 1 2 3
	 * 4 5 6
	 * 9 8 9
	 * 
	 * 1+5+9=15
	 * 3+5+9=17
	 * 
	 * 15-17=2
	 */

	public static void main(String[] args) {
		int arr[][]= {
								{11, 2, 4},
								{4 ,5 ,6},
								{10,8 ,-12}
				
							};
		int ans=diagonalDifference(arr);
		System.out.println("Sum of  diagonals : "+ans);
		
	}

	private static int diagonalDifference(int[][] arr) {
		
		int length=arr.length;
		int diagonal1=0,diagonal2=0;
		
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(i==j) {
					diagonal1 = diagonal1+arr[i][j];
					System.out.println(j+ " : "+i +" "+diagonal1);
				}
				if(i==length-j-1) {
					diagonal2 = diagonal2+arr[i][j];	
					System.out.println(j+ " : "+i +" "+diagonal2);
				}
			}
		}
		return Math.abs(diagonal1-diagonal2);
		
	}

}
