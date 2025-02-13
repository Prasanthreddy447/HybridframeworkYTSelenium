package com.utilities.pagafactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	
	
	WebDriver driver;
	@FindBy(id="input-firstname")
	private WebElement firstnameTextfield;
	
	@FindBy(id="input-lastname")
	private WebElement LastnameTextfield;
	
	@FindBy(id="input-email")
	private WebElement emailTextfield;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneTextfield;
	
	@FindBy(id="input-password")
	private WebElement passwordTextfield;
	
	@FindBy(id="input-confirm")
	private WebElement confirmpassTextfield;
	
	@FindBy(name="agree")
	private WebElement agreeTextfield;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//div[@id='content']/h1")
	private WebElement accountcreatedtext;
	
	@FindBy(xpath="//input[@name='newsletter'][@value='1']")
	private WebElement newslatterbox;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement existingemailtext;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement ActualprivacyTextdsiplay;
	
	
	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	private WebElement FirstnameTextdsiplay;
	
	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	private WebElement LastnameTextdsiplay;
	
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	private WebElement EmailTextdsiplay;
	
	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	private WebElement TelephoneTextdsiplay;
	
	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	private WebElement PasswordTextdsiplay;
	
	
	
	public Registerpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	//Actions
	
	public void firstnametext(String firstsnametextfield)
	{
		firstnameTextfield.sendKeys(firstsnametextfield);
	}
	
	public void lastnametextfield(String Lastsnametextfield)
	{
		LastnameTextfield.sendKeys(Lastsnametextfield);
	}
	
	public void emailtextfield(String emailtext)
	{
		emailTextfield.sendKeys(emailtext);
	}
	
	public void TelephonefieldText(String tele)
	{
		telephoneTextfield.sendKeys(tele);
	}
	
	public void emailpassword(String pas)
	{
		passwordTextfield.sendKeys(pas);
	}
	
	public void emailconfirmpassword(String passconfirm)
	{
		confirmpassTextfield.sendKeys(passconfirm);
	}
	
	public void agreeTextclick()
	{
		agreeTextfield.click();;
	}
	
	public void ContinueButtonclick()
	{
		continueButton.click();;
	}
	
	public String AccountDisaplayText()
	{
		String acccreatedText=accountcreatedtext.getText();
		return acccreatedText;
	}
	
	public void Newsletterboxclick()
	{
		newslatterbox.click();;
	}
	
	public String existingtextemail()
	{
		String existingemailText=existingemailtext.getText();
		return existingemailText;
	}
	
	public String actualdisplayprivacy()
	{
		String ActualprivacyTextdsiplaye=ActualprivacyTextdsiplay.getText();
		return ActualprivacyTextdsiplaye;
	}
	
	public String Firstnamedisplayprivacy()
	{
		String TextdsiplayFirstname=FirstnameTextdsiplay.getText();
		return TextdsiplayFirstname;
	}
	
	public String lastnamedisplayprivacy()
	{
		String TextdsiplayLastname=LastnameTextdsiplay.getText();
		return TextdsiplayLastname;
	}
	
	public String emaildisplayprivacy()
	{
		String EmailTextdsiplayText=EmailTextdsiplay.getText();
		return EmailTextdsiplayText;
	}
	
	public String teledisplayprivacy()
	{
		String mobTextdsiplayText=TelephoneTextdsiplay.getText();
		return mobTextdsiplayText;
	}
	
	
	public String passwordisplayprivacy()
	{
		String PasswordTextdsiplayText=PasswordTextdsiplay.getText();
		return PasswordTextdsiplayText;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
