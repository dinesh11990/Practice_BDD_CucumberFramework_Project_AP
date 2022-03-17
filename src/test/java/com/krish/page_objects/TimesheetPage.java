package com.krish.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimesheetPage {

	private static TimesheetPage timesheetPageObjects=null;

	public static TimesheetPage getInstance() {

		if(timesheetPageObjects==null) {

			timesheetPageObjects = new TimesheetPage();

		}
		return timesheetPageObjects;
	}

	private TimesheetPage() {

	}

	@FindBy(id="employee")
	private WebElement EMPLOYEE_NAME;
	@FindBy(id="btnView")
	private WebElement VIEW;
	@FindBy(xpath="//div[@class='message warning']")
	private WebElement MESSAGE;
	
	
	public WebElement getCEONAME() {
		return EMPLOYEE_NAME;
	}


	public void enterEmployeeName(String name) {

		EMPLOYEE_NAME.sendKeys(name);}
	

	public void clickView() {

		VIEW.click();
	}

	public String getMessage() {

		return MESSAGE.getText();
	}



}
