package stepDefination;

import cucumber.api.java.en.*;

public class Search {
	
	@Given("^Users open the application$")
	public void users_open_the_application() {
	   System.out.println(">>Users open the application");
	}

	@When("^Users enter a valid products$")
	public void users_enter_a_valid_products() {
	  System.out.println(">>Users enter a valid products");
	}

	@When("^Users click a seacrch button$")
	public void users_click_a_seacrch_button() {
	   System.out.println(">>Users click a seacrch button");
	}

	@Then("^Valid product should get displayed in search results$")
	public void valid_product_should_get_displayed_in_search_results() {
	 System.out.println(">>Valid product should get displayed in search results");   
	}

	@Given("^User open the application$")
	public void user_open_the_application() {
	    System.out.println(">>User open the application");
	}

	@When("^Users enter the non-existing product into search field$")
	public void users_enter_the_non_existing_product_into_search_field() {
	 System.out.println(">>Users enter the non-existing product into search field");  
	}

	@When("^Users click on search button$")
	public void users_click_on_search_button() {
	 
		System.out.println(">>Users click on search button");
	}

	@Then("^Proper text informing the user about No product maching should be displayed$")
	public void proper_text_informing_the_user_about_No_product_maching_should_be_displayed() {
	    
		System.out.println(">>Proper text informing the user about No product maching should be displayed");
	}

	@When("^Users dont enter any product into search field$")
	public void users_dont_enter_any_product_into_search_field() {
	   
		System.out.println(">>Users dont enter any product into search field");
	}



}
