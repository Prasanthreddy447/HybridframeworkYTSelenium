package com.amazon.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class practice {
	
	@Test
	
public void Verifyloginwithvalidcredentials() {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		
//		PageLoadTimeout in Selenium is a feature that allows testers 
//		to set the maximum time to wait for a page to load completely before throwing an error.
//		By default, the web driver has no timeout for page loading, 
//		so setting a Page Load Timeout can help to prevent the test script 
//		from waiting indefinitely for a page to load, which can waste valuable testing time.
//		
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("prasanthreddydodda@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Prasanth@447");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
		
	}

}
