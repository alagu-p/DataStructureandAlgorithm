import java.util.Arrays;

public class Convert24hoursTime {
	
	public static void main(String arg[])
	{
		String str="07:05:45PM";
		print24(str);
	}

	private static void print24(String str) {

		  int h1=(int)str.charAt(1)-'0';
		  int h2= str.charAt(0)-'0';
		  int hh=(h2*10+h1%10);
		  
		  if(str.charAt(8)=='A')
		  {
			  if(hh==12)
			  {
				  System.out.println("00");
				  for(int i=2;i<=7;i++)
					  System.out.print(str.charAt(i));
			  }
			  else
			  {
				  hh=hh+12;
				  System.out.print(hh);
				  for(int i=2;i<=7;i++)
					  System.out.print(str.charAt(i));
			  }
		  }
		  
	}

}
