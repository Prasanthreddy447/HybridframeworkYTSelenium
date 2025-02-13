package com.utilities.pagafactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	@FindBy(xpath="//input[@name='search']")
	private WebElement serchButtontextfiled;
	
	@FindBy(xpath="//div[@id='search']/descendant::button")
	private WebElement serchButtonclickbutton;
	
	@FindBy(linkText="HP LP3065")
	public WebElement productexist;
	
	@FindBy(linkText="HP LP3065")
	private WebElement productdisplayed;
	
	@FindBy(xpath="//div[@id='content']//h2/following-sibling::p")
	private WebElement Invalidproducttext;
	
	@FindBy(xpath="//div[@id='content']//h2/following-sibling::p")
	private WebElement Invalidproductdisplayed;
	
	public SearchPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	//Actions
	public void entersearchfiled(String prod)
	{
		serchButtontextfiled.sendKeys(prod);
	}
	
	public void entersearchclick()
	{
		serchButtonclickbutton.click();
	}
	
	public String retriveproducttext()
	{
		String prodctTextt=productexist.getText();
		return prodctTextt;
	}
	
	public boolean displayproducttext()
	{
		boolean prodctTexttdis=productdisplayed.isDisplayed();
		return prodctTexttdis;
	}
	
	public String retriveinproducttext()
	{
		String inprodctTextt=Invalidproducttext.getText();
		return inprodctTextt;
	}
	
	public boolean displayinvalidproducttext()
	{
		boolean invalidprodctTexttdis=Invalidproductdisplayed.isDisplayed();
		return invalidprodctTexttdis;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
