package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Steps extends BaseClass{
	
	WebDriver driver;
	
	@Given("^user launch chrome browser$")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	    lp=new LoginPage(driver);

	}

	@When("^use opens url \"(.*?)\"$")
	public void use_opens_url(String url) {
	   driver.get(url);
	}

	@When("^User enters Email as \"(.*?)\" and Password as \"(.*?)\"$")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
	   lp.setUserName(email);
	   lp.setPassword(password);
	}

	@When("^Click on Login$")
	public void click_on_Login() {
	    lp.login();
	}

	@When("^User click on customer menu$")
	public void user_click_on_customer_menu() {
	   addCust.clicksOnCustomersMenu();
	}

	@When("^Click on customer menu item$")
	public void click_on_customer_menu_item() {
	    addCust.clicksOnCustomersMenuItem();
	}

	@When("^Click on add new button$")
	public void click_on_add_new_button() {
	    addCust.clicksOnAddnew();
	}

	@Then("^User can view add new customer page$")
	public void user_can_view_add_new_customer_page() {
	//	assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
	}

	@When("^User enter customer info$")
	public void user_enter_customer_info() {
		addCust.setEmail(email);
       addCust.setPassword("test123");
	    
	    addCust.setCustomerRoles("Guest");
	    Thread.sleep(3000);
	    
	    addCust.setManagerOfVendor("Vendor 2");
	    addCust.setGender("Male");
	    addCust.setFirstName("Gnanendar");
	    addCust.setLastName("Reddy");
	    addCust.setDOB("5/05/1996");
	    addCust.setCompanyName("busyQA");
	    addCust.setAdminContent("this is for testing....");
	    
	}

	@When("^Click on save button$")
	public void click_on_save_button() throws InterruptedException {
		addCust.clickOnSave();
	    Thread.sleep(3000);
	}

	@Then("^User can view confirmation message \"(.*?)\"$")
	public void user_can_view_confirmation_message(String msg) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("the new customer add been sucessfully"));
	}

	@Then("^Close browser$")
	public void close_browser() {
	   driver.quit();
	}



}
