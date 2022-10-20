
public class RatioOfZeroPositiveNegative {

	public static void main(String[] args) {

		 int[] a1 = { 2, -1, 5, 6, 0, -3 };
		 plusMinuszero(a1);
	}

	private static void plusMinuszero(int[] a1) {
		
		float plus=0,minus=0,zero=0;
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==0)
				zero++;
			if(a1[i]>0)
				plus++;
			if(a1[i]<0)
				minus++;
		}
		System.out.println("Plus Ratio :   "+(plus/a1.length));
		System.out.println("Minus Ratio :   "+(minus/a1.length));
		System.out.println("Zero Ratio :   "+(zero/a1.length));
	}

}
