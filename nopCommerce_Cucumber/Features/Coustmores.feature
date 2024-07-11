Feature: Customers

  Scenario: Add a new Customer
    Given user launch chrome browser
    When use opens url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    #Then User can view Dashboard
    When User click on customer menu
    And Click on customer menu item
    And Click on add new button
    Then User can view add new customer page
    When User enter customer info
    And Click on save button
    Then User can view confirmation message "the new customer has been added successfully."
    And Close browser
