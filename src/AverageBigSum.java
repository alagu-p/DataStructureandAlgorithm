import java.util.List;

class sum{

	public static long aVeryBigSum(long[] arr) {
		long sum=0l;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		return sum;
		
	}
	
}
public class AverageBigSum {

	public static void main(String[] args) {
		
	long  arr[]= {10000000001l,10000000002l,10000000003l,10000000004l,10000000005l};

	System.out.println("Sum of Long Array : "+sum.aVeryBigSum(arr));
	}

}
