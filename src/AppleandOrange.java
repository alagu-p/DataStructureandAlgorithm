import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleandOrange {
	
	public static void countApplesAndOranges(int s,int t,int a,int b,List<Integer> apples,List<Integer> oranges) {
		int app=0,org=0;
		List<Integer> aa=new ArrayList<>();
		List<Integer> oo=new ArrayList<>();
		
		for(int i=0;i<aa.size();i++)
		{
			int temp=apples.get(i)+a;
			aa.add(temp);
			if(aa.get(i)>=s && aa.get(i)<=t)
			{
				app++;
			}
		}
		for(int i=0;i<oranges.size();i++)
		{
			int temp=oranges.get(i)+b;
			oo.add(temp);
			if(oo.get(i)<=t && oo.get(i)>=s)
			{
				org++;
			}
		}
		System.out.println(app +"\n"+org);
		

	}

	public static void main(String[] args) {
		
		List<Integer> apples=new ArrayList<>(Arrays.asList(2,3,-4));
		List<Integer> orange=new ArrayList<>(Arrays.asList(3,-2,-4));
		int a=4;
		int b=12;
		int s=7,t=10;
		int m=3,n=3;
		countApplesAndOranges(s, t, a, b, apples, orange);
		
		
	}

}
