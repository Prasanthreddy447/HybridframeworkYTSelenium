package com.utilities.pagafactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//objects
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailtextfield;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passworddtextfield;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginclick;
	
	@FindBy(xpath="//div[text()='Warning: No match for E-Mail Address and/or Password.']")
	private WebElement emailpasswrong;
	
	
	//Actions
	public void Enteremailtextfield(String emailText)
	{
		emailtextfield.sendKeys(emailText);
	}
	
	public void Enterpasswordtextfield(String password1Text)
	{
		passworddtextfield.sendKeys(password1Text);
	}
	
	public void clickonlogin()
	{
		loginclick.click();
	}
	
	public String retrieveText()
	{
		String retreiveText=emailpasswrong.getText();
		return retreiveText;
	}

}
