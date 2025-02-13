package com.utilities.pagafactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homapage {
	
	//why pagefactory
	//when are moving one page to other page the link between webelements and locators link will be last 
	//and we will get stalelementreference exception to over come this.
	//pagfacory providing pagefactory.initelements methods to link automatically
	
	//Page Factory is a class in Selenium WebDriver that implements the Page Object Model (POM). 
	//It's used to create an object repository of web elements
	
	//The @FindBy annotation in Selenium is used to initialize and declare web element variables
	
	//objects-variables
	WebDriver driver;
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement MyaccountDropMenu;
	
	@FindBy(linkText="Login")
	private WebElement LoginOption;
	
	@FindBy(linkText="Register")
	private WebElement RegisterOption;
	
	public homapage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	public void clickonaccountmenu()
	{
		MyaccountDropMenu.click();
	}
	
	public void clickonliginoption()
	{
		LoginOption.click();
	}
	
	public void clickonregisteroption()
	{
		RegisterOption.click();
	}
	
	
	

}
