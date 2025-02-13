package com.amazon.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utilities.basecode.Base;
import com.utilities.pagafactory.SearchPage;

public class SearchTest extends Base{
	
	public SearchTest()
	{
		super();
	}
	
	public WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=LaunchingBrowserandopeningurl(prop.getProperty("browserName"));
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void enterValidProduct()
	{
		
		SearchPage search = new SearchPage(driver);
		search.entersearchfiled(dataprop.getProperty("product"));
		search.entersearchclick();
		
		
		//WebElement el=driver.findElement(By.linkText("HP LP3065"));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].scrollIntoView(true);", search.productexist);
		
		String d=search.retriveproducttext();
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys(dataprop.getProperty("product"));
		//driver.findElement(By.xpath("//div[@id='search']/descendant::button")).click();
		//String d=driver.findElement(By.linkText("HP LP3065")).getText();
		System.out.println(d);
		Assert.assertTrue(search.displayproducttext());
		//Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	}
	
	@Test(priority=2)
	public void enterINValidProduct()
	{
		SearchPage search = new SearchPage(driver);
		search.entersearchfiled(dataprop.getProperty("invalidproduc"));
		search.entersearchclick();
		String text=search.retriveinproducttext();
		
		
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys(dataprop.getProperty("invalidproduct"));
		//driver.findElement(By.xpath("//div[@id='search']/descendant::button")).click();
		//String text= driver.findElement(By.xpath("//div[@id='content']//h2/following-sibling::p")).getText();
		System.out.println(text);
		Assert.assertTrue(search.displayinvalidproducttext());
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']//h2/following-sibling::p")).isDisplayed());
	}
	
	
	@Test(priority=3,dependsOnMethods= {"enterINValidProduct","enterValidProduct"})
	public void searchwithoutProduct() {
		
		SearchPage search = new SearchPage(driver);
		search.entersearchclick();
		String text=search.retriveinproducttext();
		
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("");
		//driver.findElement(By.xpath("//div[@id='search']/descendant::button")).click();
		//String text= driver.findElement(By.xpath("//div[@id='content']//h2/following-sibling::p")).getText();
		System.out.println(text);
		Assert.assertTrue(search.displayinvalidproducttext());
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']//h2/following-sibling::p")).isDisplayed());
		
	}
	

}
