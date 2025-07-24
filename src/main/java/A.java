

class A {
	int a;
	public void sa()
	{
		

	}

}

 class B extends A
{
	public void sd()
	{
		super.a=10;
		super.sa();
		System.out.println(a);
	}
	
	 public static void main(String[] args)
	 {
		 B b = new B();
		 b.sd();
		 b.sa();
	 }
 }
