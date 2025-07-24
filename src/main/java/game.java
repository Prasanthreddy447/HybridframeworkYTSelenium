
public interface game {
	//Interface is collection of abstract methods
	//variables are public static final--> when intailize we cannot change
	//methods are by default public and abstract
	//interface object cannot be created
	//interface can have default and static methods
	//child class should implement interface
	//uses implmenets keyword
	//we can create objects for child classes
	
  public void m6();
  public void m7();
  
  public static void m8(){
	  
	  System.out.println("concreate");
  }	
  
  void m0();
  
  default void m1()
  {
	  
  }

}

interface game1 extends game
{
	public void m9();
	
}

class ord implements game1
{
	public void m6() {
		System.out.println("m6 method");
	}
	
	public void m7() {
		System.out.println("m7 method");
	}
	
	public void m9() {
		System.out.println("m9 method");
	}
	
	public void m0()
	{
		
	}
}
