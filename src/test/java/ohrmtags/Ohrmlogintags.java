package ohrmtags;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ohrmlogintags {
	@Given("Orangehrm browser login")
	public void orangehrm_browser_login() {
	 System.out.println("Open given application Ohrm Browser");   
	}

	@And("username and password details")
	public void username_and_password_details() {
		System.out.println("Give the user name and password credentials ");
	    	}

	@Then("Account login to signup")
	public void account_login_to_signup() {
	   System.out.println("Click signin browser application"); 
	}

	@When("to select the profile picture")
	public void to_select_the_profile_picture() {
	   System.out.println("select dropdown priofile picture");
	}

	@Given("to select the logout")
	public void to_select_the_logout() {
	 System.out.println("Select logout option application");  
	}

	@And("to close browser")
	public void to_close_browser() {
	  System.out.println("close the browser application"); 
	}


}
