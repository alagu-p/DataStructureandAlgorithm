import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {
	public static int birthdayCakeCandles(List<Integer> candles) {
	    // Write your code here
	    int n=0,max=candles.get(0);
	    for(int i=0;i<candles.size();i++)
	    {
	        if(candles.get(i)>max)
	            {
	                max=candles.get(i);
	            }
	        
	    }
	    for(int i=0;i<candles.size();i++)
	    {
	        if(candles.get(i)==max)
	            n++;
	    }
	return n;
	    }

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>(Arrays.asList(5,4,3,2,1,5));
		System.out.println("Birthday Cake Candles : "+birthdayCakeCandles(list));
		

	}

}
