abstract class sam
{
	public abstract void m3();  // Abstract method no implementation
	public void m4()            //Concrete method implementation present
	{
		System.out.println("a");
	}	
}

abstract class bat extends sam
{
	public void m5()
	{
		System.out.println("implenting");
	}

}

class bee extends bat
{
	public void m3()
	{
		System.out.println("implenting abstract");
	}
}


//process of hiding certain details showing only essential details
//can have both concrete methods and abstract methods
//cannot create object for abstract class but we can create for child class
//child class should implement abstract methods
//not 100 percent abstraction possible


	
	

