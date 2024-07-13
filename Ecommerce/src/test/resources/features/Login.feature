@all
Feature: User Login
  
  Register user should be able to login to access account details

  Background: 
    Given User navigates to login page

  @login @validcredantials @smoke @regression
  Scenario Outline: Login with valid credantials
    When User enters valid email address <email>
    And Enters valid password <password>
    And Clicks on login button
    Then User should login successfully

    Examples: 
      | email                  | password |
      | amotooricap9@gmail.com |    12345 |
      | amotooricap3@gmail.com |    12345 |
      | amotooricap1@gmail.com |    12345 |

  @login @invalidcredantials @smoke @regression
  Scenario: Login with in-valid credantials
    When User enter invalid email address "amotooricap42987@gmail.com"
    And Enters invalid password "12345545"
    And Clicks on login button
    Then User should get a proper warning message

  @login @invalidcredantials @regression
  Scenario: Login with valid email address and invalid password
    When User enters valid email address "amotooricap9@gmail.com"
    And Enters invalid password "12345545"
    And Clicks on login button
    Then User should get a proper warning message

  @login @invalidcredantials @regression
  Scenario: Login with invalid email address and valid password
    #When User enters invalid email address "amotooricap92579@gmail.com"
    And Enters invalid password "12345"
    And Clicks on login button
    Then User should get a proper warning message

  @login @invalidcredantials @regression
  Scenario: Login without providing any credantials
    #When User dont entery any credantials
    And Clicks on login button
    Then User should get a proper warning message
