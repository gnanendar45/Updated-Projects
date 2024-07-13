package stepDefination;



import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.util.Assert;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RegistrationField {
	
	WebDriver driver;
	
	@Given("^User navigate to the registor account page$")
	public void user_navigate_to_the_registor_account_page() {
	   driver = DriverFactory.getDriver();
	   driver.findElement(By.xpath("//span[text()='My Account']")).click();
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

//	@When("^User enter firstname \"(.*?)\" into the firstname field$")
//	public void user_enter_firstname_into_the_firstname_field(String arg1) {
//	   System.out.println(">>User enter firstname");
//	}
	
	@When("Users enters below details into the fields")
	public void Users_enters_below_details_into_the_fields(DataTable dataTable) {

		 List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
//	        for (Map<String, String> data : dataList) {
//	            String fieldName = data.get("Field");
//	            String value = data.get("Value");
//	            WebElement field = driver.findElement(By.id(fieldName));
//	            field.sendKeys(value);
//	        }
		
		 WebElement inputField = driver.findElement(By.id("input-firstname"));
		 inputField.sendKeys("firstname");
		 WebElement inputField1 = driver.findElement(By.id("input-lastname"));
		 inputField1.sendKeys("lastname");
		 WebElement inputField2 = driver.findElement(By.id("input-email"));
		 inputField2.sendKeys("email");
		WebElement inputField3 = driver.findElement(By.id("input-telephone"));
		inputField3.sendKeys("telephone");
		WebElement inputField4 = driver.findElement(By.id("input-password"));
		inputField4.sendKeys("password");
		WebElement inputField5 = driver.findElement(By.id("input-confirm"));
		inputField5.sendKeys("passwordconfirm");
	}

	@When("^Enters lastname \"(.*?)\" into the lastname field$")
	public void enters_lastname_into_the_lastname_field(String arg1) {
	   System.out.println(">>Enters lastname");
	}

	@When("^Enters email \"(.*?)\" into the Email field$")
	public void enters_email_into_the_Email_field(String arg1) {
	    System.out.println(">>Enters email ");
	}

	@When("^Enters the telephone \"(.*?)\" into the Telephone field$")
	public void enters_the_telephone_into_the_Telephone_field(String arg1) {
	   System.out.println(">>Enters the telephone");
	}

	@When("^Enters password \"(.*?)\" into the password field$")
	public void enters_password_into_the_password_field(String arg1) {
       System.out.println(">>Enters password");
	}

	@When("^Enters password \"(.*?)\" into the password confirm field$")
	public void enters_password_into_the_password_confirm_field(String arg1) {
	  System.out.println(">>Enters password");
	}

	@When("^Select the privacy field$")
	public void select_the_privacy_field() {
	System.out.println(">>Select the privacy field");
	driver.findElement(By.name("agree")).click();
	}

	@When("^Clicks on contiune button$")
	public void clicks_on_contiune_button() {
	   System.out.println(">>Clicks on contiune button");
	   driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("^Account should get successfully created$")
	public void account_should_get_successfully_created() {
	System.out.println(">>Account should get successfully created");
	
          Assert.assertEquals("Your Account Has Been Created!", driver.findElement(By.xpath("//div[@id='content']/h1")).getText());	
	}


}
