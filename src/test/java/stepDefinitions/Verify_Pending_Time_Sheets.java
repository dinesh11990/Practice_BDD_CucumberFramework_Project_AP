package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Verify_Pending_Time_Sheets {

	
	@Given("the user is on the homepages")
	public void the_user_is_on_the_homepages() {
		System.out.println("the user is on the homepages");
	}

	@Given("the user clicks on the time option from the menus")
	public void the_user_clicks_on_the_time_option_from_the_menus() {
		System.out.println("the user clicks on the time option from the menus");
	}

	@Given("the user enters the name as \"(.*?)\"")
	public void the_user_enters_the_name_as(String string) {
		System.out.println("the user enters the name as {string}");
	}

	@Given("clicks on the view buttons")
	public void clicks_on_the_view_buttons() {
		System.out.println("clicks on the view buttons");

	}

	@Then("the user should see the message as \"(.*?)\"")
	public void the_user_should_see_the_message_as(String string) {
		System.out.println("the user should see the message as {string}");

	}


}
