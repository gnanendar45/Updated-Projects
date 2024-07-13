package com.StepDefinations;

import com.BaseClass.Library;
import com.Pages.Fassion_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fassion_Stepdefination extends Library{
	Fassion_page fp;
	SeleniumReusable se;
	@Given("User to move the Fashion link")
	public void user_to_move_the_fashion_link() throws InterruptedException {
		se=new SeleniumReusable(driver);
		System.out.println("Before clicking fassionlink");
		se.getTitle();
		fp=new Fassion_page(driver);
		Thread.sleep(2000);
		fp.movefassionlink();
	}

	@When("Curser to move to the kids link")
	public void curser_to_move_to_the_kids_link() throws InterruptedException {
		fp.movetokidslink();
	    
	}

	@When("Move to girls dress and click")
	public void move_to_girls_dress_and_click() throws InterruptedException {
	   fp.clickgirlslink();
	}

	@When("click the price high to low link")
	public void click_the_price_high_to_low_link() {
	    fp.clickprice();
	}

	@Then("Its should display the relevent details and get title")
	public void its_should_display_the_relevent_details_and_get_title() {
	    	System.out.println("After clicking fassionlink :");
	    	se.getTitle();
	}



}
