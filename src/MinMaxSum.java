import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxSum {
	 public static void miniMaxSum(List<Integer> arr) {
		    // Write your code here
		    
		    int sum=0,lenth=arr.size(),min=arr.get(0),max=arr.get(0);
		    for(int i=0;i<lenth;i++)
		    {
		        if(arr.get(i)<min)
		            min=arr.get(i);
		        if(arr.get(i)>max)
		            max=arr.get(i);
		            
		        sum+=arr.get(i);
		            
		    }
		    System.out.println((sum-max)+" "+(sum-min));

		    }
	public static void main(String[] args) {
		
		List<Integer>arr= new ArrayList<>(Arrays.asList(5,4,3,2,1));
		miniMaxSum(arr);
	}

}
