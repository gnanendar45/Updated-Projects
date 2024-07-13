package com.StepDefinations;

import com.BaseClass.Library;
import com.Pages.TwoWheelers_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TwoWheelers_Stepdefination extends Library {
	
	TwoWheelers_page tp;
	SeleniumReusable se;
	
	@Given("User to move to the Two wheelers link")
	public void user_to_move_to_the_two_wheelers_link() throws InterruptedException {
		
		tp=new TwoWheelers_page(driver);
		se=new SeleniumReusable(driver);
		tp.movetotwowheelerslink();
	}
	@When("Curser move to the Electric Vehicals link click")
	public void curser_move_to_the_electric_vehicals_link_click() {
	    tp.moveelectricvehicleslink();
	}
	@When("It should display the search result and get the title and prices")
	public void it_should_display_the_search_result_and_get_the_title_and_prices() {
	    tp.entairvehicles();
	    se.getTitle();
	}
	@When("User move to the TV&Appliances link")
	public void user_move_to_the_tv_appliances_link() throws InterruptedException {
	    tp.movetoTvApplianceslink();
	}
	@When("move to the Nokia Click")
	public void move_to_the_nokia_click() {
	  tp.movetonokialink();
	}
	@When("clicks on the price high to low link")
	public void clicks_on_the_price_high_to_low_link() {
		se.getTitle();
	   tp.movetopricelowtohigh();
	}

	

}
