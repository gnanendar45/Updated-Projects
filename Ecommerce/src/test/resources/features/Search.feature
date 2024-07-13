Feature: Search Functanality

  Background: 
    Given Users open the application

  Scenario: Search for a valid product
    When Users enter a valid products
    And Users click a seacrch button
    Then Valid product should get displayed in search results

  Scenario: Search for a non-existing products
    When Users enter the non-existing product into search field
    And Users click a seacrch button
    Then Proper text informing the user about No product maching should be displayed

  Scenario: Search for without providing any products
    When Users dont enter any product into search field
    And Users click a seacrch button
    Then Proper text informing the user about No product maching should be displayed
