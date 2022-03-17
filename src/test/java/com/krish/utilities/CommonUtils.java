 package com.krish.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.krish.constants.Constants;
import com.krish.page_objects.LoginPage;
import com.krish.webdriver_manager.DriverManagers;


public class CommonUtils {
	
	private static final Logger LOGGER=LogManager.getLogger(CommonUtils.getInstance());

	//Singleton
	
	private static CommonUtils commonUtilsInstance = null;
	
	private CommonUtils() {
		
	}
	public static CommonUtils getInstance() {
		
		if(commonUtilsInstance==null) {
			
			commonUtilsInstance = new CommonUtils();
		}
		
		return commonUtilsInstance;
	}
	
	//---------------------------------------------------------
	
	public void loadProperties() {
		
		Properties properties = new Properties();
	
	try {
		
		properties.load(getClass().getResourceAsStream("/config.properties"));
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	Constants.APP_URL=properties.getProperty("APP_URL");
	Constants.BROWSER=properties.getProperty("BROWSER");
	Constants.USERNAME=properties.getProperty("UserName");
	Constants.PASSWORD=properties.getProperty("Password");
	Constants.CHROME_DRIVER_LOCATION=properties.getProperty("CHROME_DRIVER_LOCATION");
	Constants.FIREFOX_DRIVER_LOCATION=properties.getProperty("FIREFOX_DRIVER_LOCATION");
	Constants.EDGE_DRIVER_LOCATION=properties.getProperty("EDGE_DRIVER_LOCATION");

}
	public void initWebElements() {
		
		PageFactory.initElements(DriverManagers.getDriver(), LoginPage.getInstance());
		
		
	}
	
	public void selectFromDropDown(WebElement dropDown, String howTo, String value) {
		
		Select select = new Select(dropDown);
		
		switch (howTo) {
		
		case "index":
			
			select.selectByIndex(Integer.parseInt(value));
			
			break;
			
		case "value":
			
			select.selectByValue(value);
			
			break;
			
		case "text":
			
			select.selectByVisibleText(value);
	
			break;

		default:
			
			System.out.println("Please provide valid selection");
			
			break;
		}
	}
}

