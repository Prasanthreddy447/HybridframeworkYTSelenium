
public class demo {
	int b;
	public  void sample()
	{
		int a= 10;
		
		System.out.println(a);
		
		
	}
}

class dem1 extends demo
{
	public void sample2()
	{
		int c=4;
		super.b=19;
		System.out.println(b);
	}
	
	public static void main(String args[])
	{
		dem1 d = new dem1();//creating objects for non static methods to call in static
		d.sample();
		d.sample2();
	}
}

//Static is keyword which is non access modifier 
//primarily used for memory management
// static can be for variables,methods
//static refers to class level
//when we go static variables when all objects share same variable then we go for static variable
//static members are loaded into memory when class loaded memory allocation happens only once
//static block executed before main method because static is loaded into memory when class loaded by jvm
//static methods are called directly in non static methods and static methods
//non static methods are called in static by creating object.

