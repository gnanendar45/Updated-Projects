package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {
	
	public WebDriver ldriver;

	public AddcustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	By lnkCustomers_menu=By.xpath("//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]");
	//By lnkCustomers_menu=By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p");
	//@FindBy(xpath="//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]")
	//private By Customers;
	//By lnkCustomers_menu=By.xpath("//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]");
	By lnkCustomers_menuitem=By.xpath("//a[@class='nav-link active']/parent::li/ul/li/a/p");
	By btnAddnew=By.xpath("//a[@class='btn btn-primary']"); //addnew
	
	By txtEmail=By.xpath("//input[@id='Email']");
	By txtPassword=By.xpath("//input[@id='Password']");
	
	By txtcustomerRoles=By.xpath("//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div");
	By lstitmadministrators=By.xpath("//li[contains(text(), 'Administrators')]");
	By lstitemRegistered=By.xpath("//li[contains(text(), 'Registered')]");
	By lstitemGuests=By.xpath("//li[contains(text(), 'Guests')]");
	By lstitemVendours=By.xpath("//li[contains(text(), 'Vendors')]");
	
	By drpmgOfVendor=By.xpath("//*[@id='VendorId']");
	By rdMaleGender=By.id("Gender_Male");
    By rdFeMaleGender=By.id("Gender_Female");
    
    By textFirstName=By.xpath("//input[@id='FirstName']");
    By textLarstName=By.xpath("//input[@id='LastName']");
    
    By txtDOB=By.xpath("//input[@id='DateOfBirth']");
    
    By txtCompanyName=By.xpath("//input[@id='Company']");
    
    By txtAdminComment=By.xpath("//textarea[@id='AdminComment']");
    
    By btnSave=By.xpath("//button[@name='save']");
    
    public String getPageTitle() {
    	return ldriver.getTitle();
    }
    
    
    public void clickOnCustomersMenu() {
    	ldriver.findElement(lnkCustomers_menu).click();
    }
    
//    public void clickOnCustomers() {
//    	ldriver.findElement(Customers).click();
//    }
	
    public void clickOnCustomerMenuItem() {
    	ldriver.findElement(lnkCustomers_menuitem).click();
    }
    
    public void clickOnAddnew() {
    	ldriver.findElement(btnAddnew).click();
    }
    
    public void setEmail(String email) {
    	ldriver.findElement(txtEmail).sendKeys(email);
    }
    
    public void setPassword(String password) {
    	ldriver.findElement(txtPassword).sendKeys(password);
    }
    
    public void setCustomerRoles(String role) throws InterruptedException {
    	
    	if(!role.equals("Vendors"))  //if role is vonder should not delete Resgister as per
    	{
    		ldriver.findElement(By.xpath("//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div"));
    	}
    	ldriver.findElement(txtcustomerRoles).click();
    	WebElement listitem;
    	Thread.sleep(3000);
    	if(role.equals("Administrators")) {
    		listitem=ldriver.findElement(lstitmadministrators);
    	}
    	else if(role.equals("Guest")) {
    		listitem=ldriver.findElement(lstitemGuests);
    		
    	}
    	else if(role.equals("Registered")) {
    		listitem=ldriver.findElement(lstitemRegistered);
    	}
    	else if(role.equals("Vendors")) {
    		listitem=ldriver.findElement(lstitemVendours);
    	}
    	else {
    		listitem=ldriver.findElement(lstitemGuests);
    	}
    	//listitem.click();
    	
    	JavascriptExecutor js=(JavascriptExecutor)ldriver;
    	js.executeScript("argument[0].click();", listitem);
    }
    
    public void setManagerOfVendor(String value) {
    	Select drp=new Select(ldriver.findElement(drpmgOfVendor));
		drp.selectByVisibleText(value);
    }
    
    public void setGender(String gender) {
    	if(gender.equals("Male")){
    		ldriver.findElement(rdMaleGender).click();
    	}else if(gender.equals("Female")) {
    		ldriver.findElement(rdFeMaleGender).click();
    	}
    	
    	
    }
    
    public void setFirstName(String FirstName) {
    	ldriver.findElement(textFirstName).sendKeys(FirstName);
	}
    
    public void setLastName(String LastName) {
    	ldriver.findElement(textLarstName).sendKeys(LastName);
	}
    
    public void setDOB(String dateofbirth) {
    	ldriver.findElement(txtDOB).sendKeys(dateofbirth);
    }
    
    public void setCompanyName(String CompanyName) {
    	ldriver.findElement(txtCompanyName).sendKeys(CompanyName);
    }
    
    public void setAdminContent(String AdminComment) {
    	ldriver.findElement(txtAdminComment).sendKeys(AdminComment);
    }
    
    public void clickOnSave() {
    	ldriver.findElement(btnSave);
    }
}
