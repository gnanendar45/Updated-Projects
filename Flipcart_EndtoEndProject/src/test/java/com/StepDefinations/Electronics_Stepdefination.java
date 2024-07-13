package com.StepDefinations;

import com.BaseClass.Library;
import com.Pages.Electronic_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Electronics_Stepdefination extends Library{

	SeleniumReusable se;
	Electronic_page ep;
	
	@Given("User to move to Electronic link")
	public void user_to_move_to_electronic_link() throws InterruptedException {
		ep=new Electronic_page(driver);
		se=new SeleniumReusable(driver);
		ep.moveelectronicslink();
	}
	@When("Curser to move to the Gaming link")
	public void curser_to_move_to_the_gaming_link() throws InterruptedException {
	    ep.movetogaminglink();
	}
	@When("Move to the Game click")
	public void move_to_the_game_click() {
	    ep.clickgamelink();
	}
	@When("clicks on the price high to low links")
	public void clicks_on_the_price_high_to_low_links() {
	   // fp.clickprice();
		ep.clickpricelowtohigh();
	}
	@Then("Its should display the relevent details and get titles")
	public void its_should_display_the_relevent_details_and_get_titles() {
	    	System.out.println("After clicking electroniclink :");
	    	se.getTitle();
	}

	
}
