package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Login {

	@Given("User is on net banking landing page")
	public void user_is_on_net_banking_landing_page() {
	    System.out.println("Landing page is displayed");
	}

	@When("User login to the application with {string} and password {string}")
	public void user_login_to_the_application_with_and_password(String username, String password) {
		System.out.println("username is "+username);
		System.out.println("password is "+password);
	}

	@When("click on submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("netbanking home page is displayed")
	public void netbanking_home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("cards mapped are displayed")
	public void cards_mapped_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}