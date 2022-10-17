import java.util.ArrayList;
import java.util.List;

class Result{

	public List<Integer> compare(int[] a, int[] b) {
		
		List<Integer> lst=new ArrayList<>();
		int bob=0,alice=0;
		for(int i=0;i<a.length;i++)
		{
		
			if(a[i]>b[i])
				alice++;
			if(a[i]<b[i])
				bob++;
		}
		lst.add(0, alice);
		lst.add(1,bob);
		
		return lst;
		
		
	}
	
	
}
public class AliceAndBob {

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int b[]= {3,2,1};
		
		Result re=new Result();
		System.out.println( "Alice and Bob Score : "+re.compare(a,b));
		

		
	}

}
