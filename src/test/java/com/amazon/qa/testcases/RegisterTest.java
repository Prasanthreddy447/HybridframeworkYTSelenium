package com.amazon.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utilities.basecode.Base;
import com.utilities.pagafactory.Registerpage;
import com.utilities.pagafactory.homapage;
import com.utilities.reuasble.reuasable;

     public class RegisterTest extends Base {
    	 
    	 public RegisterTest()
    	 {
    		 super();
    	 }
	
    	 public WebDriver driver;
	
	       @BeforeMethod
		  public void setup()
		    {
		    driver= LaunchingBrowserandopeningurl(prop.getProperty("browserName"));
			homapage home = new homapage(driver);
			home.clickonaccountmenu();
			//driver.findElement(By.xpath("//span[text()='My Account']")).click();
			
			home.clickonregisteroption();
			//driver.findElement(By.linkText("Register")).click();
		    }
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
	
	@Test(priority=1)
	public void verifyregisteringmandatoryfields() {
		
		
		driver.findElement(By.id("input-firstname")).sendKeys(dataprop.getProperty("firstname"));
		driver.findElement(By.id("input-lastname")).sendKeys(dataprop.getProperty("lastname"));
		driver.findElement(By.id("input-email")).sendKeys(reuasable.generatetimestamp());
		driver.findElement(By.id("input-telephone")).sendKeys(dataprop.getProperty("mobilenum"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String actualtext=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		
		Assert.assertEquals(actualtext, dataprop.getProperty("acccreated"));
	}
	
	@Test(priority=2)
	public void verifyregisteringwithallfields() {
		
		Registerpage register= new Registerpage(driver);
		register.firstnametext(dataprop.getProperty("firstname"));
		register.lastnametextfield(dataprop.getProperty("lastname"));
		register.emailtextfield(reuasable.generatetimestamp());
		register.TelephonefieldText(dataprop.getProperty("mobilenum"));
		register.emailpassword(prop.getProperty("password"));
		register.emailconfirmpassword(prop.getProperty("password"));
		register.Newsletterboxclick();
		register.agreeTextclick();
		register.ContinueButtonclick();
		String actualtext=register.AccountDisaplayText();
		
	
			
//			driver.findElement(By.id("input-firstname")).sendKeys(dataprop.getProperty("firstname"));
//			driver.findElement(By.id("input-lastname")).sendKeys(dataprop.getProperty("lastname"));
//			driver.findElement(By.id("input-email")).sendKeys(reuasable.generatetimestamp());
//			driver.findElement(By.id("input-telephone")).sendKeys(dataprop.getProperty("mobilenum"));
//			driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
//			driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("password"));
//			driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
//			driver.findElement(By.name("agree")).click();
//			driver.findElement(By.xpath("//input[@value='Continue']")).click();
//			String actualtext=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
			Assert.assertEquals(actualtext, dataprop.getProperty("acccreated"));
		}
	
	@Test(priority=3)
	public void verifyregisteringexistingemailid() {
		
		Registerpage register= new Registerpage(driver);
		register.firstnametext(dataprop.getProperty("firstname"));
		register.lastnametextfield(dataprop.getProperty("lastname"));
		register.emailtextfield(prop.getProperty("email"));
		register.TelephonefieldText(dataprop.getProperty("mobilenum"));
		register.emailpassword(prop.getProperty("password"));
		register.emailconfirmpassword(prop.getProperty("password"));
		register.Newsletterboxclick();
		register.agreeTextclick();
		register.ContinueButtonclick();
		String text=register.existingtextemail();
		
//		driver.findElement(By.id("input-firstname")).sendKeys(dataprop.getProperty("firstname"));
//		driver.findElement(By.id("input-lastname")).sendKeys(dataprop.getProperty("lastname"));
//		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email"));
//		driver.findElement(By.id("input-telephone")).sendKeys(dataprop.getProperty("mobilenum"));
//		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
//		driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("password"));
//		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//div[@id='account-register']//div
		
		//String text =driver.findElement(By.xpath("//div[@id='account-register']//div")).getText();
//		String text =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		System.out.println(text);
		Assert.assertEquals(text, dataprop.getProperty("emailexist"));
	}
	
	@Test(priority=4)
	public void verifyregesteringwithnofields()
	{	
		
		Registerpage register= new Registerpage(driver);
		register.ContinueButtonclick();
		String actualprivacyText=register.actualdisplayprivacy();
		String Firstnametext=register.Firstnamedisplayprivacy();
		String LastNamenametext=register.lastnamedisplayprivacy();
		String Emailtext=register.emaildisplayprivacy();
		String Telephonetext=register.teledisplayprivacy();
		String Passwordtext=register.passwordisplayprivacy();
		
		
		
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//String actualprivacyText= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		
		Assert.assertTrue(actualprivacyText.contains("Warning: You must agree to the Privacy Policy!"), "no messageprivacy");
		
		//String Firstnametext= driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText();
		
		Assert.assertEquals(Firstnametext, dataprop.getProperty("firstnametext"));
		
		
		//String LastNamenametext= driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).getText();
		
		Assert.assertEquals(LastNamenametext, dataprop.getProperty("lastnametext"));
		
		//String Emailtext= driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText();
		
		Assert.assertEquals(Emailtext, dataprop.getProperty("emailtext"));
		
		//String Telephonetext= driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText();
		
		Assert.assertEquals(Telephonetext, dataprop.getProperty("telephonetext"));
		
		
		//String Passwordtext= driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).getText();
		
		Assert.assertEquals(Passwordtext, "Password must be between 4 and 20 characters!");
		
	}
	
	
	
	

}
