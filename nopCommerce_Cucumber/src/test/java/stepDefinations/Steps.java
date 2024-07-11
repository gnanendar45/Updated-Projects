package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;

public class Steps extends BaseClass {
	

	
	@Given("^user launch chrome browser$")
	public void user_launch_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	    lp=new LoginPage(driver);

	}

	@When("^use opens url \"(.*?)\"$")
	public void use_opens_url(String url) throws Throwable {
	
			driver.get(url);
	}

	@When("^User enters Email as \"(.*?)\" and Password as \"(.*?)\"$")
	public void user_enters_Email_as_and_Password_as(String email, String password) throws Throwable {
		lp.setUserName(email);
		lp.setPassword(password); 
	}

	@When("^Click on Login$")
	public void click_on_Login() throws Throwable {
		lp.clickLogin();  
	}

	@Then("^Page Title should be \"(.*?)\"$")
	public void page_Title_should_be(String title) throws Throwable {
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("^User click on Log out link$")
	public void user_click_on_Log_out_link() throws Throwable {
		lp.clickLogout();
		Thread.sleep(3000);
	}

//	@Then("^close browser$")
//	public void close_browser() throws Throwable {
//		driver.close();
//	}
	
	//next feature
		

//	@Then("^User can view Dashboard$")
//	public void user_can_view_Dashboard() throws Throwable {
//		
//		addCust=new AddcustomerPage(driver);
//		//assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
//		assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
//	    
//	}
 
	@When("^User click on customer menu$")
	public void user_click_on_customer_menu() throws Throwable {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]")).click();
		addCust.clickOnCustomersMenu();
		Thread.sleep(3000);
	}

	@When("^Click on customer menu item$")
	public void click_on_customer_menu_item() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/p[1]")).click();
	   // addCust.clickOnCustomerMenuItem();
	}

	@When("^Click on add new button$")
	public void click_on_add_new_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	   // addCust.clickOnAddnew();
	}

	@Then("^User can view add new customer page$")
	public void user_can_view_add_new_customer_page() throws Throwable {
		//assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
	}

	@When("^User enter customer info$")
	public void user_enter_customer_info() throws Throwable {
	   // String email=randomestring()+"@gmail.com";
	   // addCust.setEmail(email);
	    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gnanendar@gmail.com");
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
	public void close_browser() throws Throwable {
		driver.close(); 
	}


}
