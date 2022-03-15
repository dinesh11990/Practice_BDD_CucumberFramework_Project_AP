package com.krish.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.krish.utilities.CommonUtils;

public class LoginPageObjects {

	private static LoginPageObjects loginInstance;

	private LoginPageObjects() {


	}

	public static LoginPageObjects getInstance()
	{

		if(loginInstance==null) {

			loginInstance=new LoginPageObjects();
		}
		return loginInstance;
	}

	//---------------------------------------------------------------
	@FindBy(id="txtUsername")
	private WebElement USERNAME;
	@FindBy(id="txtPassword")
	private WebElement PASSWORD;
	@FindBy(id="btnLogin")
	private WebElement LOGIN_BUTTON;



	public void enterUserName(String userName) {

		try {

			USERNAME.sendKeys(userName);
		}catch (Exception e) {

		}}

	public void enterPassword(String password) {

		try {
			PASSWORD.sendKeys(password);
		}catch (Exception e) {
		}}

	public void clickLoginButton() {
		try {
			LOGIN_BUTTON.click();
		}catch (Exception e) {

		}}

}




