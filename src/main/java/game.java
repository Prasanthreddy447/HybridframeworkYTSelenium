
public interface game {
	
	//variables are public static final--> when intaite we cannot change
	//methods are by default public and abstract
	//interface object cannot be created
	
  public void m6();
  public void m7();
  
  public static void m8(){
	  
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
}
