package searching;

public class BinarySearchanother {
	
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		int index=binarySearch(a,7,0,a.length);
		if(index==-1)
			System.out.println("Element Not found");
		else
			System.out.println("Index : "+7 +"   is : "+index);
		
	}

	private static int binarySearch(int[] a, int num, int low, int high) {
		while(low<high)
		{
			int mid=(high+low)/2;
			if(a[mid]==num)
				return mid;
			if(a[mid]<num)
				low=mid+1;
			else {
				high=mid-1;
			}
		}
		return -1;
	}
}
