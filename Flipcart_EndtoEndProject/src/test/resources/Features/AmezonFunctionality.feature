Feature: To validate the Amezon Application

  Background: 
    Given Launch the Amezon Application
   # When Close the popup
    Then It should Navigate to the Home pages

  @tc001 @Regression
  Scenario: To validate the search functionalitye
    Given User enter the text in the search fields
    When Click the search button
    Then It should navigate to the search result page and display the relavent detailss
    And Select the Brands
    And select the Cellular Technology
    And select the Display type
