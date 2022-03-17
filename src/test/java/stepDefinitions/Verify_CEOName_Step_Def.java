package stepDefinitions;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import com.krish.page_objects.DirectoryPage;
import com.krish.page_objects.HomePage;
import com.krish.utilities.CommonUtils;

import com.krish.webdriver_manager.DriverManagers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verify_CEOName_Step_Def {


	private static final Logger LOGGER = LogManager.getLogger(Verify_CEOName_Step_Def.class);

	@Given("the user is logged in successfully and is on Home Pages")
	public void the_user_is_logged_in_successfully_and_is_on_home_pages() {

		try {
			

			String url=DriverManagers.getDriver().getCurrentUrl();

			if(url.contains("dashboard")) {

				LOGGER.info("the user is logged in successfully and is on Home Pages");
			}}
		catch (Exception e) {

			LOGGER.error(e);
		}

	}

	@When("the user clicks on the directory option from the Menu bars")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bars() {


		try {

			HomePage.getInstance().clickDirectory();
			LOGGER.info("the user clicks on the directory option from the Menu bars");
		}catch(Exception e) {

			LOGGER.error(e);
		}

	}
	
	@When("^the user selects the job title as \"([^\"]*)\" from the drop down \"([^\"]*)\"$")
	public void the_user_selects_the_job_title_as_from_the_drop_down(String jobTitle,String howTo) throws Throwable {

		
		try {
			
			CommonUtils.getInstance().selectFromDropDown(DirectoryPage.getInstance().getJOB_TITLE(), howTo, jobTitle);
			LOGGER.info("the user selects the job title as {string} from the drop downs");

		}catch(Exception e) {

			LOGGER.error(e);
		
		}}

	

	@When("clicks the search button")
	public void clicks_the_search_button() {


		try {

			DirectoryPage.getInstance().clickSearch();
			LOGGER.info("clicks the search button");
		}catch(Exception e) {

			LOGGER.error(e);
			
		}}


	@Then("^the user should see the CEO name as \"(.*?)\"$")
	public void the_user_should_see_the_ceo_name_as(String expectedName) {


	

		try {

			String actualName=DirectoryPage.getInstance().getPersonName();

			if(actualName.equalsIgnoreCase(expectedName)) {

				LOGGER.info("the user should see the CEO name as John Smith");
			}}catch (Exception e) {

				LOGGER.error(e);
				
			}





	}

}
