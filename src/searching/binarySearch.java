package searching;

public class binarySearch {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int left =0,right=arr.length-1,mid,x=6;
		
		while(left<=right)
		{
			mid=left+(right-left)/2;
			System.out.println(arr[mid]+" :"+x);
			if(arr[mid]==x) {
				System.out.println(mid);
				break;
			}
			if(arr[mid]<x) {
				System.out.println("left");

				left=mid+1;
			}
			if(arr[mid]<x) {
				System.out.println("right");

				right=mid-1;	
			}
	
		}
		
		
	
	}
}
