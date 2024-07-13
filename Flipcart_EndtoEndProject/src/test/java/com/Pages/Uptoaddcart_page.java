package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class Uptoaddcart_page extends Library	{

	SeleniumReusable se;
	public Uptoaddcart_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Login")
	WebElement Loginlink;
	
	@FindBy(xpath="//*[text()='Flipkart Plus Zone']")
	WebElement Flipkartpluszone;
	
	@FindBy(xpath="//span[text()='Home & Furniture']")
	WebElement Homefurniturelink;
	
	@FindBy(linkText="Wall Lamp")
	WebElement Walllamp;
	
	@FindBy(xpath="//a[text()='LUMINX Wallchiere Wall Lamp With Bulb']")
	WebElement clickonelamp;
	
	@FindBy(id="pincodeInputId")
	WebElement Pincode;
	
	@FindBy(xpath="//span[text()='Check']")
	WebElement checklink;
	
	public void Movielink() throws InterruptedException {
		se=new SeleniumReusable(driver);
		se.moucehover(Loginlink);
	}
	
	public void Moveflipkartplus() {
		se.movelement(Flipkartpluszone);
	}
	
	public void Movehomefurniture() throws InterruptedException {
		se.moucehover(Homefurniturelink);
	}
	
	public void Clickwalllamp() {
		se.movelement(Walllamp);
	}
	
	public void Clickoneresult() {
		se.Scrolldown(clickonelamp);
	}
	
	public void Enterpincode() throws InterruptedException {
		Thread.sleep(2000);
		se.windowhandlink(clickonelamp);
		Pincode.sendKeys("123456");
	}
	
	public void Clickchecklink() {
		se.click(checklink);
	}
}
