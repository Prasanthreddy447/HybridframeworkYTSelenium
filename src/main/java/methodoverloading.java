
public class methodoverloading {
	
	
	
	public void m1()
	{
		System.out.println("method1");
		
	}
	
	public void m1(int a)
	{
		System.out.println(a);
	}
	
	public void m1(String b)
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodoverloading m = new methodoverloading();
		
		m.m1();
		m.m1(10);
		
		

	}

}
