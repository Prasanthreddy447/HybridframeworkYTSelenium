import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class google {
	
	WebDriver driver;
	
	public void setup()
	{
		driver = new ChromeDriver();	
	}
	
	public void geturl(String url)
	{
		driver.get(url);
	}
	
	public void teardown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}

}

class gt extends google
{
	
	public void lauch()
	{
		geturl("www.google.com");
	}
	
	public static void main(String args[])
	{
		
		gt g = new gt();
		g.setup();
		g.lauch();
		g.teardown();
	
		
		
	}


}
