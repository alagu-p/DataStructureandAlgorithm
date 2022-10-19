package searching;

public class recursiveBinarySearch {

	public static void main(String[] args) {

int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		int index=recursivebinarySearch(a,7,0,a.length-1);
		if(index==-1)
			System.out.println("Element Not found");
		else
			System.out.println("Index : "+7 +"   is : "+index);
		
	}

	private static int recursivebinarySearch(int[] a, int num, int low, int high) {
		if(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==num) {
				return mid;
				}
			if(a[mid]>num) {
				return recursivebinarySearch(a,num,low,mid-1);
			}
			
			return recursivebinarySearch(a, num, mid+1, high);
		}
		return -1;
	}

}
