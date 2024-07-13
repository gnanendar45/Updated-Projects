package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class Electronic_page extends Library{

	SeleniumReusable se;
	public Electronic_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Electronics']")
	WebElement electronicslink;
	
	@FindBy(xpath="//a[text()='Gaming']")
	WebElement Gamininglink;
	
	@FindBy(xpath="//a[text()='Games']")
	WebElement Gamesclick;
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	WebElement Pricelowtohigh;
	
	public void moveelectronicslink() throws InterruptedException {
		se=new SeleniumReusable(driver);
		se.moucehover(electronicslink);
	}
	
	public void movetogaminglink() throws InterruptedException {
		Thread.sleep(2000);
		se.moucehover(Gamininglink);
	}
	
	public void clickgamelink() {
		se.click(Gamesclick);
	}
	
	public void clickpricelowtohigh() {
		se.click(Pricelowtohigh);
	}
	
}
