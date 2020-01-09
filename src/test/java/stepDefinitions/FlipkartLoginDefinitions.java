package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FlipkartLoginDefinitions {

	@Given("Flipcart is up and running and is launched")
	public void flipcart_is_up_and_running_and_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("The site is running fine");
	}

	@Then("User clicks on Login link")
	public void user_clicks_on_Login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User has clicked on the login button");
	}

	@Then("User provides valid credentials")
	public void user_provides_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User has provided credentials");
	}

	@Then("user clicks on OK button")
	public void user_clicks_on_OK_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("OK button is clicked");
	}
}
