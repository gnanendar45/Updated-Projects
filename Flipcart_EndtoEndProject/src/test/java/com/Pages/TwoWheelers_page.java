package com.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class TwoWheelers_page extends Library {
	SeleniumReusable se;
	public TwoWheelers_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Two Wheelers']")
	WebElement twowheelerslink;
	
	@FindBy(xpath="//*[text()='Electric Vehicles']")
	WebElement electricvehicleslink;
	
	@FindBy(xpath="//div[@class='ybB1XH']/.")
	List<WebElement> entairvehicles;
	
	@FindBy(xpath="//span[text()='TVs & Appliances']")
	WebElement TvApplianceslink;
	
	@FindBy(xpath="//a[text()='Nokia']")
	WebElement nokialink;
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	WebElement pricelowtohigh;
	
	public void movetotwowheelerslink() throws InterruptedException {
		se=new SeleniumReusable(driver);
		se.moucehover(twowheelerslink);
	}
	public void moveelectricvehicleslink() {
		se.click(electricvehicleslink);
	}
	public void entairvehicles() {
		se.MultipleGettext(entairvehicles);
	}
	public void movetoTvApplianceslink() throws InterruptedException {
		se.moucehover(TvApplianceslink);
	}
	public void movetonokialink() {
		se.click(nokialink);
	}
	public void movetopricelowtohigh() {
		se.click(pricelowtohigh);
	}

}
