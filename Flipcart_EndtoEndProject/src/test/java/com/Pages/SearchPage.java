package com.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class SearchPage extends Library{
	SeleniumReusable se;
	public SearchPage() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@name='q']")
	WebElement Searchtext;
	
	@FindBy(xpath="//html[@lang='en-IN']")
	WebElement Homepage;
	
	@FindBy(xpath="//html[@lang='en']")
	WebElement Searchresult;
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement Popup;	
	
	@FindBy(xpath="//div[@class='col col-7-12']")
	List<WebElement> Entairresult;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[2]/div[1]")
	WebElement ThirdResult;
	
	public void Search(String Text) {
		 se=new SeleniumReusable(driver);
		 se.EnterValue(Searchtext, Text);
	}
	
	public void Clicksearch() {
		Searchtext.sendKeys(Keys.ENTER);
	}
	
	public void Homescreen() {
		System.out.println("Homepage displayed");
	}
	
	public void Result() {
		System.out.println(Searchresult.isDisplayed());
		System.out.println(driver.getTitle());
	}
	public void Handlepopup() {
		se.click(Popup);
	}
	
	public void Printentireresult() {
		se.MultipleGettext(Entairresult);
	}
	
	public void Print3rdresult() {
		se.Getvalue(ThirdResult);
	}
}
		