package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {

	WebDriver driver;
	
	@Given("^user is on login pages$")
	public void user_is_on_login_pages() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}
	

	@When("^the user enters the valid username and passwords$")
	public void the_user_enters_the_valid_username_and_passwords() throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	}

	@When("^clicks on the login buttons$")
	public void clicks_on_the_login_button() throws Throwable {

		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^the user should be navigated to home pages$")
	public void the_user_should_be_navigated_to_home_page() throws Throwable {

		boolean status = driver.findElement(By.linkText("Welcome Paul")).isDisplayed();
		Assert.assertTrue(status);

	}



}
