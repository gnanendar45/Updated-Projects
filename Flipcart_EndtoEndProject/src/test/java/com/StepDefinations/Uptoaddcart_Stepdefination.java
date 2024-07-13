package com.StepDefinations;

import com.BaseClass.Library;
import com.Pages.Uptoaddcart_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Uptoaddcart_Stepdefination extends Library	 {
	
	Uptoaddcart_page up;
	SeleniumReusable re;
	
	@Given("User cam move to the login link")
	public void user_cam_move_to_the_login_link() throws InterruptedException {
		up=new Uptoaddcart_page(driver);
		up.Movielink();
		 re=new SeleniumReusable(driver);
		 System.out.println("Parentwindow title");
		 re.getTitle();
	}

	@When("User can click the flipkart plus zone")
	public void user_can_click_the_flipkart_plus_zone() {
	    up.Moveflipkartplus();
	}

	@When("Mouce move to the Home&Furniture link")
	public void mouce_move_to_the_home_furniture_link() throws InterruptedException {
		Thread.sleep(2000);		
	   up.Movehomefurniture();
	}

	@When("Going to click the wall lamp")
	public void going_to_click_the_wall_lamp() throws InterruptedException {
		Thread.sleep(2000);
	    up.Clickwalllamp();
	}

	@When("Scroll down the page and click one particular result")
	public void scroll_down_the_page_and_click_one_particular_result() throws InterruptedException {
		Thread.sleep(2000);
	    up.Clickoneresult();
	}

	@When("Enter delivery pincode and click the check link")
	public void enter_delivery_pincode_and_click_the_check_link() throws InterruptedException {
		Thread.sleep(2000);
	   up.Enterpincode();
	}

	@Then("Pincode should be checked and displayed and verify the titles")
	public void pincode_should_be_checked_and_displayed_and_verify_the_titles() {
	  up.Clickchecklink();
	  System.out.println("Childwindow title");
	  re=new SeleniumReusable(driver);
	  re.getTitle();
	  re.screenshot1("src\\test\\resources\\Screenshots/uptoaddcart.png");
	}

	

}
