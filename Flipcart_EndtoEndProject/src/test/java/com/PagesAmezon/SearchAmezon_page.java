package com.PagesAmezon;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class SearchAmezon_page extends Library{

	SeleniumReusable se;
	public void searchAmezon_page() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement serchfield;	
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchickon;
	
	@FindBy(xpath="//div[@id='a-page']")
	WebElement entairresult;
	
	@FindBy(xpath="//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div")
	WebElement mobilerelated;
	
	@FindBy(xpath="//div[@class='puisg-col-inner']")
	
	public void Search(String Text) {
		se=new SeleniumReusable(driver);
		se.EnterValue(serchfield, Text);
	}
	
	public void Clicksearch() {
		serchfield.sendKeys(Keys.ENTER);
	}
	
	public void Homescreen() {
		System.out.println("Homepage displayed");
	}
	
	public void Result() {
		System.out.println((entairresult).isDisplayed());
		System.out.println(driver.getTitle());
	}
	public void Printentireresult() {
		se.MultipleGettext(mobilerelated);
	}
	
	
	
}
