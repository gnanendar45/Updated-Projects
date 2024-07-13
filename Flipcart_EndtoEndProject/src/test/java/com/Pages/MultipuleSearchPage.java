package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class MultipuleSearchPage extends Library{
	
	SeleniumReusable se;
	
	public MultipuleSearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement Searchfield;
	

	public void Entersearch(String searchText) {
		se=new SeleniumReusable(driver);
		se.EnterValue(Searchfield, searchText);
	}
	
	public void clicksearch() {
		Searchfield.sendKeys(Keys.ENTER);
	}
}
