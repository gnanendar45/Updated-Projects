package com.StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.Library;
import com.Pages.Titleprice_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Titleprice_Stepdefination extends Library{

	 Titleprice_page tp;
	 SeleniumReusable se;
	 
	@Given("Enter the search text in the search field")
	public void enter_the_search_text_in_the_search_field() {
	   tp=new Titleprice_page(driver);
	   tp.entersearch("Shirts");
	}

	@When("Click the search ickon")
	public void click_the_search_ickon() {
	    tp.Clicksearchicon();
	}

	//@Then("It should display the search result and get the title and price")
	//public void it_should_display_the_search_result_and_get_the_title_and_price() {
	  //  se=new SeleniumReusable(driver);
	    //se.MultipleGettext((List<WebElement>) driver.findElement(By.xpath("//*[@class='hCKiGj']/..")));
	//}
	@Then("It should display the search result and get the title and price")
	public void it_should_display_the_search_result_and_get_the_title_and_price() {
	    se = new SeleniumReusable(driver);
	    List<WebElement> elements = driver.findElements(By.xpath("//*[@class='hCKiGj']/.."));
	    se.MultipleGettext(elements);
	}


	
}
