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

//pagefactory is class provided by selenium and used in POM model
//by using init elements we intilize web elements
// helps to create object repositories for webelements
//helps to reduce duplications
//helps to improve code readibility
//by @findby to locate elemnets by locators


//@FindBys()---> When the required WebElement objects need to match all of the given criteria use @FindBys annotation

//@FindAll : When required WebElement objects need to match at least one of the given criteria use @FindAll annotation

/*

@FindBys( {
   @FindBy(className = "class1")
   @FindBy(className = "class2")
} )
private List<WebElement> elementsWithBoth_class1ANDclass2;


@FindAll( {
   @FindBy(className = "class1")
   @FindBy(className = "class2")
} )
private List<WebElement> elementsWithBoth_class1ANDclass2;

*/