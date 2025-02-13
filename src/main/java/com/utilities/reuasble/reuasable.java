package com.utilities.reuasble;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class reuasable {
	
	public static final int IMPLICIT_WAIT_TIME=10;
	public static final int PAGE_WAIT_TIME=10;

	
	
	public static String generatetimestamp()
	{
		Date d = new Date();
		String stamp= d.toString().replace(" ", "_").replace(":", "_");
		return "prasanthreddydodda"+stamp+"@gmail.com";
	}
	
	public static Object[][] testdatafromexcel(String sheetname)
	{
		
		XSSFWorkbook workbook=null;
		File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\utilities\\testdata\\testdataexcel.xlsx");
		try {
		FileInputStream fisexcel = new FileInputStream(f);
		workbook = new XSSFWorkbook(fisexcel);
	        }
	  catch(Exception e)
	    {
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet(sheetname);
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rows][cols];
		
		
		for (int i=0;i<rows;i++)
		{
			XSSFRow row=sheet.getRow(i+1);
			
			for (int j=0;j<cols;j++)
			{
				XSSFCell cell =row.getCell(j);
				CellType celltype=cell.getCellType();
				//celltype (which type of primitive cells or not)
				switch(celltype)
				{
				case STRING:
					
					data[i][j]=cell.getStringCellValue();
					break;
					
				case NUMERIC:
					//first converting to int from float later changing to string
					data[i][j]=Integer.toString((int)(cell.getNumericCellValue()));
					break;
					
					case BOOLEAN:
						data[i][j]=cell.getBooleanCellValue();
						break;
						
				}
				
			}
			
		}
		
		return data;
		       
		
	}




public static String capturescrenshot(WebDriver driver, String Testname)
{
	File srcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String desscreenshotpath=System.getProperty("user.dir")+"\\screenshot\\"+Testname+".png";
	try {
		FileHandler.copy(srcScreenshot, new File(desscreenshotpath));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return desscreenshotpath;
}
}
