package com.utilities.pagafactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	WebDriver driver;
	
	@FindBy(linkText="Edit your account information")
	private WebElement Accountsuccessfullogin;
	
	public AccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	public boolean displayloginsuccesspage()
	{
		boolean displaye=Accountsuccessfullogin.isDisplayed();
		return displaye;
	}

}
