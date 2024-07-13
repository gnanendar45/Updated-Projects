Feature: To validate the flipkart Application

  Background: 
    Given Launch the Flipkart Application
    When Close the popup
    Then It should Navigate to the Home page
    
    @tc001 @Regression
  Scenario: To validate the search functionality
    Given User enter the text in the search field
    When Click the serah button
    Then It should navigate to the search result page and display the relavent details
    # Then Extract the Result and print in console
    #Then Print the third result and keep it in the console
    And Select Minimum and Maximume Amount
    And Select the Brand
    And Select the ram
    And Select theBattery capacity
    Then It should disply the Relevant result

  #@tc002 @Regression
  Scenario: To validate the Fashion functionality
    Given User to move the Fashion link
    When Curser to move to the kids link
    And Move to girls dress and click
    And click the price high to low link
    Then Its should display the relevent details and get title

  @tc003 @Regression
  Scenario Outline: To validate the search functionality with different values
    Given Enter the "<searchtext>" in the search field
    When click the search button
    Then It should navigate to the next page and display the cottesponding page

    Examples: 
      | searchtext |
      | Mobile     |
      | Tv         |
      | Speaker    |
      | Shirt      |

  #@tc004 @Regression
  Scenario: To validate upto addcart functionality
    Given User cam move to the login link
    When User can click the flipkart plus zone
    And Mouce move to the Home&Furniture link
    And Going to click the wall lamp
    And Scroll down the page and click one particular result

    And Enter delivery pincode and click the check link
   Then Pincode should be checked and displayed and verify the titles
 # @tc005 @Regression
  Scenario: To get the title and price from search results
    Given Enter the search text in the search field
    When Click the search ickon
    Then It should display the search result and get the title and price

 #@tc006
  Scenario: To validate the Electronics functionality
    Given User to move to Electronic link
    When Curser to move to the Gaming link
    And Move to the Game click
    And clicks on the price high to low links
    Then Its should display the relevent details and get titles

  @tc007
  Scenario: To validate the Two wheelers
    Given User to move to the Two wheelers link
    When Curser move to the Electric Vehicals link click
    And It should display the search result and get the title and prices
    And User move to the TV&Appliances link
    And move to the Nokia Click
    And clicks on the price high to low link
    Then Its should display the relevent details and get title


 