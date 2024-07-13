package com.StepDefinations;

import org.openqa.selenium.By;

import com.BaseClass.Library;
import com.Pages.Filter_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;

public class Filter_Stepdefination extends Library{
	
	 Filter_page fp;
	 SeleniumReusable se;
	 
	@Then("Select Minimum and Maximume Amount")
	public void select_minimum_and_maximume_amount() throws InterruptedException {
	   	fp=new Filter_page(driver);	
	   	String BeforeFilter=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).getText();
	   	System.out.println("BEFORE FILTER :"+BeforeFilter);
	   	fp.Min();
	   	se=new SeleniumReusable(driver);
	   	se.waits();
	   	fp.Max();
	}

	@Then("Select the Brand")
	public void select_the_brand() throws InterruptedException {
	   fp.Brand();
	   se.waits();
	}

	@Then("Select the ram")
	public void select_the_ram() throws InterruptedException {
	    fp.Ram();
	    se.waits();
	}

	@Then("Select theBattery capacity")
	public void select_the_battery_capacity() throws InterruptedException {
	    fp.Clickbattery();
	    se.waits();
	}

	@Then("It should disply the Relevant result")
	public void it_should_disply_the_relevant_result() {
		System.out.println("*****************************************");
		String AfterFilter=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).getText();
	   	System.out.println("AFTER FILTER :"+AfterFilter);
	}

	

}
