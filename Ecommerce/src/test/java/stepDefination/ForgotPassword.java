package stepDefination;

import io.cucumber.java.en.*;

public class ForgotPassword {
  
	@Given("^Users opens the Application$")
	public void users_opens_the_Application() {
		System.out.println(">>Users opens the Application");
	}

	@When("^Users clicks on MyAccount$")
	public void users_clicks_on_MyAccount() {
	   System.out.println(">>Users clicks on MyAccoun");
	}

	@And("^Select the login option$")
	public void select_the_login_option()  {
	    System.out.println(">>Select the login option");
	}

	@And("^Clicks on Forgotten Password option$")
	public void clicks_on_Forgotten_Password_option() {
	    System.out.println(">>Clicks on Forgotten Password option");
	}

	@And("^Enter valid email address$")
	public void enter_valid_email_address() {
	    System.out.println(">>Enter valid email address");
	}

	@And("^Clicks on continue button$")
	public void clicks_on_continue_button() {
	    System.out.println(">>Clicks on continue button");
	}

	@Then("^Proper conformation message should be displayed$")
	public void proper_conformation_message_should_be_displayed() {
	    System.out.println(">>Proper conformation message should be displayed");
	}

}
