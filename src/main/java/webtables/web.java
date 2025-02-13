package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class web {
	
	
	@Test
	public void webtables()
	{
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		
		List<WebElement> rowsNumber = driver1.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th"));		
		int rowCount = rowsNumber.size();
		System.out.println(rowCount);
		
		
		
		
	}

}
