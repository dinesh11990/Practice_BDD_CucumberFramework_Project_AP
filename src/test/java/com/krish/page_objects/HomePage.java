package com.krish.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.krish.utilities.CommonUtils;

public class HomePage {
	
	
	private static HomePage homePageInstance;
	
	private HomePage() {
		
	}
	public static HomePage getInstance() {
		
		if(homePageInstance==null) {
			
			homePageInstance = new HomePage();
		}
		return homePageInstance;
		
	}
	
	
	@FindBy(linkText = "Directory")
	private WebElement DIRECTORY;
	
	@FindBy(linkText = "Time")
	private WebElement TIME;

	
	/*
	public WebElement getDIRECTORY() {
		return DIRECTORY;
	}*/
	
	//Verify_CEOName
	public void clickDirectory() {
		

		
		DIRECTORY.click();
	}
	
	//Verify_Pending_Time_Sheets
	
	public void clickTime() {
	
		TIME.click();
	}
	
	
	

}
