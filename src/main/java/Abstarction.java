abstract class sam
{
	public abstract void m3();
	public void m4()
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


	
	

