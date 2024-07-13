@all
Feature: User Registration

  Background: 
    Given User navigate to the registor account page

@registor @mandatoryfields @smoke @regression 
  Scenario Outline: Register with mandatory field
   When Users enters below details into the fields 
    | firstname  | Gnanendar |
    | lastname   | Reddy |
    | email      | arun.motoori@gmail.com |
    | telephone    | 7382572372357 |
    |password    | 12345 |
    |passwordconfirm | 12345 |
  #  When User enter firstname "Gnanendar" into the firstname field
  #  And Enters lastname "Reddy" into the lastname field
  #  And Enters email "fjgwfbh@gmail.com" into the Email field
   # And Enters the telephone "7382572372357" into the Telephone field
  #  And Enters password "34743925" into the password field
   # And Enters password "34743925" into the password confirm field
    And Select the privacy field
    And Clicks on contiune button
    Then Account should get successfully created

@registor @allfields @smoke @regression 
  Scenario: Rigester with all fields
    When User enter firstname "Gnanendar" into the firstname field
    And Enters lastname "Reddy" into the lastname field
    And Enters email "fjgwfbh@gmail.com" into the Email field
    And Enters the telephone "7382572372357" into the Telephone field
    And Enters password "34743925" into the password field
    And Enters password "34743925" into the password confirm field
    And Select the privacy field
    And Clicks on contiune button
    Then Account should get successfully created
