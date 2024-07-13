Feature: Forgot password functionality

  Scenario: Reset Password on forgetting it
    Given Users opens the Application
    When Users clicks on MyAccount
    And Select the login option
    And Clicks on Forgotten Password option
    And Enter valid email address
    And Clicks on continue button
    Then Proper conformation message should be displayed
