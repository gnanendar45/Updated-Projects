package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.messages.internal.com.google.protobuf.Duration;

public class Login {
	
	WebDriver driver;
	
	

	@Given("^User navigates to login page$")
	public void user_navigates_to_login_page() {
		
		driver = DriverFactory.getDriver();
	    driver.findElement(By.xpath("//span[text()='My Account']")).click();
	    driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@When("^User enters valid email address amotooricap(\\d+)@gmail\\.com$")
	public void user_enters_valid_email_address_amotooricap_gmail_com(int arg1) {
	   System.out.println(">>User enters valid email address amotooricap");
	}

	@When("^Enters valid password (\\d+)$")
	public void enters_valid_password(int arg1){
	   System.out.println(">>Enters valid password");
	}

	@When("^Clicks on login button$")
	public void clicks_on_login_button()  {
	 System.out.println(">>Clicks on login button"); 
	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully()  {
	    System.out.println(">>User should login successfully");
	}

	@When("^User enter invalid email address \"(.*?)\"$")
	public void user_enter_invalid_email_address(String arg1)  {
	    System.out.println(">>User enter invalid email address");
	}

	@When("^Enters invalid password \"(.*?)\"$")
	public void enters_invalid_password(String arg1) {
	    System.out.println(">>Enters invalid password");
	}

	@Then("^User should get a proper warning message$")
	public void user_should_get_a_proper_warning_message() {
	   System.out.println(">>User should get a proper warning message");
	}

	@When("^User enters valid email address \"(.*?)\"$")
	public void user_enters_valid_email_address(String arg1) {
	    System.out.println(">>User enters valid email address");
	}



}
