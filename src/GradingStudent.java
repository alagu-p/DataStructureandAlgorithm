import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudent {

	public static void main(String[] args) {

		ArrayList<Integer> list= new ArrayList<>(Arrays.asList(73,67,38,33));
		ArrayList<Integer>lms=new ArrayList<>();
		int num=list.size();
		System.out.println(num);
		
		for(int i=0;i<num;i++)
		{ 
			int ans=list.get(i);
			if(ans>=38)
			{
				if(ans%5>=3)
					ans +=5-(ans%5);
				System.out.println(ans);
			}
			lms.add(ans);
			
		}
		System.out.println(lms);
		
	}

}
