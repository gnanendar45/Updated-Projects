Feature: Login Functanality

  Scenario: Login with valid credantials
    Given User navigates to login page
    When User enters valid email address "gnanendar81@gmail.com" into email field
    And Enters valid password "gnanendar81@gmail.com" into password field
    And Clicks on login button
    Then User should login successfully

  Scenario: Login with in-valid credantials
    Given User navigates to login page
    When User enters valid email address "amotooricap7659@gmail.com" into email field
    And Users Enters in valid password "12345ytwf" into password field
    And Clicks on login button
    Then User should get a proper warning message about credential mismatch

  Scenario: Login with valid email and in valid password credantials
    Given User navigates to login page
    When User enters valid email address "amotooricap9@gmail.com" into email field
    And Users Enters in valid password "12345rthf" into password field
    And Clicks on login button
    Then User should get a proper warning message about credential mismatch

  Scenario: Login with in valid email and valid password credantials
    Given User navigates to login page
    When User enters in valid email address "amotooricap9@gmail.com" into email field
    And Users Enters in valid password "12345ytwf" into password field
    And Clicks on login button
    Then User should get a proper warning message about credential mismatch

  Scenario: Login without providing any credantials
    Given User navigates to login page
    When User dont enter email address into email field
    And User dont enter password into password field
    And User Clicks on login button
    Then User should get a proper warning message about credential mismatch
