package com.StepDefinations;

import java.io.IOException;

import com.BaseClass.Library;
import com.Pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMobile_Testcase extends Library {
	SearchPage sp;
	@Given("Launch the Flipkart Application")
	public void launch_the_flipkart_application() throws IOException {
	    launchApplication();
	}

	@When("Close the popup")
	public void close_the_popup() {
	//	sp.Handlepopup();
	   System.out.println(driver.getTitle());
	}

	@Then("It should Navigate to the Home page")
	public void it_should_navigate_to_the_home_page() {
		sp=new SearchPage();
		sp.Homescreen();
	}

	@Given("User enter the text in the search field")
	public void user_enter_the_text_in_the_search_field() {
	    sp.Search("Mobile");
	}

	@When("Click the serah button")
	public void click_the_serah_button() {
	   sp.Clicksearch();
	}

	@Then("It should navigate to the search result page and display the relavent details")
	public void it_should_navigate_to_the_search_result_page_and_display_the_relavent_details() {
	   sp.Result();
	}
	
	@Then("Extract the Result and print in console")
	public void extract_the_result_and_print_in_console() {
	  sp.Printentireresult();
	  System.out.println("************************************************");
	}

	@Then("Print the third result and keep it in the console")
	public void print_the_third_result_and_keep_it_in_the_console() {
	  sp.Print3rdresult();
	}





}
