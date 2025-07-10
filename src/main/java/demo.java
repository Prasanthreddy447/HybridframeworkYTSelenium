
public class demo {
	
	public static void sample()
	{
		int a= 10;
		
		System.out.println(a);
		
		
	}
}

class dem1 extends demo
{
	public static void sample2()
	{
		int b=4;
		
		System.out.println(b);
	}
	
	public static void main(String args[])
	{
		dem1 d = new dem1();
		d.sample();
		sample2();
	}
}
