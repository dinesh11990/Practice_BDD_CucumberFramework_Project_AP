package stepDefinitions;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;

import com.krish.constants.Constants;
import com.krish.page_objects.LoginPage;
import com.krish.utilities.CommonUtils;

import cucumber.api.java.Before;

import com.krish.webdriver_manager.DriverManagers;

public class CommonStepDefinition {


	@Before
	public void beforeScenario() {

		try {

			CommonUtils.getInstance().loadProperties();

			if(DriverManagers.getDriver()==null) {

				DriverManagers.launchBrowser();

				CommonUtils.getInstance().initWebElements();
				login();

			}

		}catch(Exception e) {

			e.printStackTrace();
		}

	}

	private void login() {

		DriverManagers.getDriver().get(Constants.APP_URL);
		LoginPage.getInstance().enterUserName(Constants.USERNAME);
		LoginPage.getInstance().enterPassword(Constants.PASSWORD);
		LoginPage.getInstance().clickLoginButton();
	}



}
