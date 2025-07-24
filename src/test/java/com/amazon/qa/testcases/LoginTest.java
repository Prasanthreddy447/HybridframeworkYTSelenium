package com.amazon.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utilities.basecode.Base;
import com.utilities.pagafactory.AccountPage;
import com.utilities.pagafactory.Loginpage;
import com.utilities.pagafactory.homapage;
import com.utilities.reuasble.reuasable;

public class LoginTest extends Base {
	
	public LoginTest()
	{
		super();
	}
	
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		//invoke();
		
		driver= LaunchingBrowserandopeningurl(prop.getProperty("browserName"));
		//driver= LaunchingBrowserandopeningurl(prop.);
		homapage home = new homapage(driver);
		home.clickonaccountmenu();
		home.clickonliginoption();
	
		//driver.findElement(By.xpath("//span[text()='My Account']")).click();
		//driver.findElement(By.linkText("Login")).click();	
	    }
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	//No main method because we use testNg
	//@Test(priority=1,dataProvider="supplyTestdata")
	
	@Test(priority=1,dataProvider="sup")
	public void Verifyloginwithvalidcredentials(String email,String password1) {
		
		
		Loginpage login = new Loginpage(driver);
		login.Enteremailtextfield(email);
		login.Enterpasswordtextfield(password1);
		login.clickonlogin();
		
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password1);
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		AccountPage account= new AccountPage(driver);
		
		Assert.assertTrue(account.displayloginsuccesspage());
//		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());

		
	}
// we have used hardcoding here but we can by using excel
	
	
//	@DataProvider
//	@DataProvider(name="sup")
//	public Object[][] supplyTestdata()
//	{
//		Object[][] data = {{"prasanthreddydodda@gmail.com","Prasanth@447"},
//				{"chandukesa9121@gmail.com","Prasanth@123"}
//		                  };
//		return data;
//	}
	
	@DataProvider(name="sup")
	public Object[][] supplyTestdata()
	{
		Object[][] data = reuasable.testdatafromexcel("Login");
		return data;
	}
	
	
	
	
	@Test(priority=2)
	public void VerifyloginwithInvalidcredentials()
	{
		
		
		Loginpage login = new Loginpage(driver);
		login.Enteremailtextfield(reuasable.generatetimestamp());
		login.Enterpasswordtextfield(dataprop.getProperty("Invalidpassword"));
		login.clickonlogin();
		
		
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(reuasable.generatetimestamp());
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(dataprop.getProperty("Invalidpassword"));
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String actual= login.retrieveText();
		//String actual=driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")).getText();
		Boolean e =actual.contains("Warning: No match for E-Mail Address and/or Password.");
		System.out.println(e);
		Assert.assertTrue(e,"Expected warning not displayed");
		
		
	}
	
	@Test(priority=3)
	public void VerifyloginwithInvalidemailandvalidpass()
	{
		Loginpage login = new Loginpage(driver);
		login.Enteremailtextfield(reuasable.generatetimestamp());
		//Thread.sleep(2000);
		login.Enterpasswordtextfield(prop.getProperty("password"));
		login.clickonlogin();

//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(reuasable.generatetimestamp());
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(dataprop.getProperty("password"));
//		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String actual= login.retrieveText();	
		//String actual=driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")).getText();
		Boolean e =actual.contains("Warning: No match for E-Mail Address and/or Password.");
		System.out.println(e);
		Assert.assertTrue(e,"Expected warning not displayed");
		
	
		
		
	}
	
	
	@Test(priority=4)
	public void VerifyloginwithvalidemailandInvalidpass()
	{
		Loginpage login = new Loginpage(driver);
		login.Enteremailtextfield(prop.getProperty("email"));
		login.Enterpasswordtextfield(dataprop.getProperty("Invalidpassword"));
		login.clickonlogin();

//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(prop.getProperty("email"));
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(dataprop.getProperty("Invalidpassword"));
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		String actual= login.retrieveText();
		//String actual=driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")).getText();
		Boolean e =actual.contains("Warning: No match for E-Mail Address and/or Password.");
		System.out.println(e);
		Assert.assertTrue(e,"Expected warning not displayed");
		
//		
//		String actual=driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")).getText();
//		Boolean e =actual.contains("Warning");
//		System.out.println(e);
//		Assert.assertTrue(actual.contains("Warning: No match for E-Mail Address and/or Password."),"Expected warning not displayed");
	}
	
	@Test(priority=5)
	public void Verifyloginwithnocrdentials()
	{
		Loginpage login = new Loginpage(driver);
		login.clickonlogin();
		String actual= login.retrieveText();
		//String actual=driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")).getText();
		Boolean e =actual.contains("Warning: No match for E-Mail Address and/or Password.");
		System.out.println(e);
		Assert.assertTrue(e,"Expected warning not displayed");
		
		
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(" ");
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(" ");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		String actual=driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']")).getText();
//		Boolean e =actual.contains("Warning");
//		System.out.println(e);
//		Assert.assertTrue(actual.contains("Warning: No match for E-Mail Address and/or Password."),"Expected warning not displayed");
	}
	
}

