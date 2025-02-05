package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class Electronic_page_tc008 extends Library {
	
	WebDriver driver;
	SeleniumReusable se;
	
	public Electronic_page_tc008(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()=' Electronics ']")
	WebElement electronicsCategory;	
	@FindBy(xpath="//div[@id='s-refinements']/div/ul/li[9]")
	WebElement mobileAccessories;
	@FindBy(xpath="//div[@id='nav-progressive-subnav']/div/a[3]")
	WebElement laptopsAndAccessories;
	@FindBy(xpath="//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img18/Electronics/Megamenu/megamenumar18f.json:subnav-sl-megamenu-2:0\"]/div[2]/div/div[2]/ul[1]/li[3]/a")
	WebElement samsungCategory;
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	WebElement priceLowtoHigh;
	@FindBy(xpath="//div[@class='left_nav browseBox']/ul[4]/li[1]")
	WebElement topBrandsApple;
	
	public void clickOnElectronicsCategory() throws InterruptedException {
		Thread.sleep(5000);
		electronicsCategory.click();
		
	}
	
	public void selectmobileAccessories() {
		mobileAccessories.click();
		
		}
	
	public void moucehourLaptopAccessories() throws InterruptedException{
	 se=new SeleniumReusable(driver);
	 se.moucehover(laptopsAndAccessories);
	}
	
	public void clickOnSamsungCategory() {
		samsungCategory.click();
	}
	
	public void clickOnPriceHighToLow() {
		priceLowtoHigh.click();
	}
	
	public void clickOnTopBrandsApple() {
		topBrandsApple.click();
	}

	
}
