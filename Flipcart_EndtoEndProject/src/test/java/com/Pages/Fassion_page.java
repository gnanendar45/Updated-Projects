package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class Fassion_page extends Library {
	SeleniumReusable se;
	public Fassion_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Fashion']")
	WebElement fashionlink;
	
	@FindBy(xpath="//a[text()='Kids']")
	WebElement kidslink;	
	
	@FindBy(xpath="//a[text()='Girls Dresses']")
	WebElement Girlsdresslink;
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	WebElement Pricelowtohigh;
	
	public void movefassionlink() throws InterruptedException {
		se=new SeleniumReusable(driver);
		se.moucehover(fashionlink);
	}
	
	public void movetokidslink() throws InterruptedException {
		se.moucehover(kidslink);
	}
	
	public void clickgirlslink() throws InterruptedException {
		se.moucehover(Girlsdresslink);
	}
	
	public void clickprice() {
		se.click(Girlsdresslink);
	}
	

 
}
