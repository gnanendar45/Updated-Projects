Feature: Registraion functionality

  Scenario: User create an account only with mandotory fields
    Given User navigates to registor account pages
    When users enters the details into below fields
      | firstName | Arun                        |
      | lastName  | Motoori                     |
      | email     | amotoori421220229@gmail.com |
      | telephone |                  1234567889 |
      | password  |                    14312576 |
    And Users select privacy policy
    And Users clicks on continue button
    Then Users account should get created successfully

  Scenario: User create an account with all fields
    Given User navigates to registor account pages
    When Users enters the details into below fields
      | firstName | Arun                        |
      | lastName  | Motoori                     |
      | email     | amotoori421220229@gmail.com |
      | telephone |                  1234567889 |
      | password  |                    14312576 |
    And Users select Yes for Newsletter
    And Users select privacy policy
    And Users clicks on continue button
    Then Users account should get created successfully

  Scenario: User create a duplicate account with all fields
    Given User navigates to registor account pages
    When Users enters the details into below fields
      | firstName | Arun                        |
      | lastName  | Motoori                     |
      | email     | amotoori421220229@gmail.com |
      | telephone |                  1234567889 |
      | password  |                    14312576 |
    And Users select Yes for Newsletter
    And Users select privacy policy
    And Users clicks on continue button
    Then Users should get a proper warning about duplicate email
    
    Scenario: User creates an account without filling any details
    Given User navigates to reggister Account page
    When User dont enter any details into fields
    And clicks on continue button 
    Then User should get proper warning messages for every mandatory fields

