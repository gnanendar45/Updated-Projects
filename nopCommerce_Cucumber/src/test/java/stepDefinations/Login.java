package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;


public class Login {

	WebDriver driver;
	LoginPage loginPage = new LoginPage(driver);
	AccountPage accountPage = new AccountPage(driver);
	
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
	//	driver = DriversFactory.getDriver();
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccount();
		homePage.selectLoginOption();
		
		//driver.findElement(By.xpath("//span[text()='My Account']")).click();
		//driver.findElement(By.linkText("Login")).click();
		
	}
	
	@When("User enters valid email address {string} into email field")
	public void User_enters_valid_email_address_into_email_field(String emailText) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmailAddress(emailText);
		
		//driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(emailText);
	}
	
	@When("Enters valid password {string} into password field")
	public void enters_valid_password_into_password_field(String passwordText) {
		loginPage.enterPasswordField(passwordText);
	    //driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(string);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		loginPage.clickonButton();
	  // driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		
	   Assert.assertTrue(accountPage.displayStatusOfEditYourAccountInformationOptional());
	}

	@When("Users Enters in valid password {string} into password field")
	public void users_enters_in_valid_password_into_password_field(String invalidpassword) {
		loginPage.enterPasswordField(invalidpassword);
		
	  // driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(invalidpassword);
	}

	@Then("User should get a proper warning message about credential mismatch")
	public void user_should_get_a_proper_warning_message_about_credential_mismatch() {
		Assert.assertTrue(loginPage.getWarningMessageText().contains("Warning: No match for E-Mail Address and/or Password."));
	   // Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
	}

	@When("User enters in valid email address {string} into email field")
	public void user_enters_in_valid_email_address_into_email_field(String invalidemail) {
	//	CommonUtils commonUtils = new CommonUtils();
	//	loginPage.enterEmailAddress(commonUtils.getEmailWithTimeStamp());
		
	   //driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(invalidemail);
	}

	@When("User dont enter email address into email field")
	public void user_dont_enter_email_address_into_email_field() {
	   // driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("");
		loginPage.enterEmailAddress("");
	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {
		//driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("");
		loginPage.enterPasswordField("");
	}

	@When("User Clicks on login button")
	public void user_clicks_on_login_button() {
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
	}


	
}
