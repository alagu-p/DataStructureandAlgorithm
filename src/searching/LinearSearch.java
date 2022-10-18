package searching;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {25,35,15,10,5,3};
		System.out.println(Arrays.toString(arr));
		int x=10;
		search(arr,x);

	}
	public static void search(int[] arr, int x) {
		boolean check =false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x) {
				check=true;
				break;
			}
			
		}
		if(check)
			System.out.println("Values is Location  : "+x );
		else
			System.out.println("Values is not there .");

}
}
