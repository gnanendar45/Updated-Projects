package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class Filter_page extends Library{
	
	SeleniumReusable se;
	
	public Filter_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select")
	WebElement MinimumAmount;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select")
	WebElement MaximumAmount;	
	
	@FindBy(xpath="//div[text()='SAMSUNG']/preceding-sibling::div")
	WebElement Brand;
	
	@FindBy(xpath="//div[text()='3 GB']/preceding-sibling::div")
	WebElement Ram;
	
	@FindBy(xpath="//div[text()='Battery Capacity']/..")
	WebElement Batteryarrow;
	
	@FindBy(xpath="//div[text()='4000 - 4999 mAh']//preceding-sibling::div")
	WebElement BatteryCabacity;
	
	
	public void Min() {
		se=new SeleniumReusable(driver);
		se.Dropdown(MinimumAmount, "10000");
	}
	
	public void Max() {
		se.Dropdown(MaximumAmount, "20000");
	}
	
	public void Brand() {
		se.click(Brand);
	}
	
	public void Ram() {
		se.Scrolldown(Ram);
		se.click(Ram);
	}
	
	public void Clickbattery() {
		se.Scrolldown(Batteryarrow);
		se.click(Batteryarrow);
		se.click(BatteryCabacity);
	}

}
