package com.utilities.basecode;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilities.reuasble.reuasable;

public class Base {
	
	WebDriver driver;
	public Properties prop;
	public Properties dataprop;
	
	public Base()
	{
		prop = new Properties();
		//File f= new File(System.getProperty("user.dir") +"/src/main/java/com/utilities/config/config.properties");
		File f= new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\utilities\\config\\config.properties");
		try {
	    FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		dataprop= new Properties();
		File datafis = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\utilities\\testdata\\testdat.properties");
		try {
		FileInputStream fis2 = new FileInputStream(datafis);
		dataprop.load(fis2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public WebDriver LaunchingBrowserandopeningurl(String browserName)
		{
			
			if (browserName.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("edge"))
			{
				driver = new EdgeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(reuasable.IMPLICIT_WAIT_TIME));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(reuasable.PAGE_WAIT_TIME));
			
			driver.get(prop.getProperty("url"));
			
			return driver;
		
		}

}
