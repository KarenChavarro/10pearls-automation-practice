Feature: Create Account
  In order to buy
  As as customer
  I want to create accounts

  Scenario: Create Account
    Given the user is on the Etsy home page
    When the user selects the Register option
    And the user completes the form
    Then the system displays the success message "Welcome back"

  Scenario: Field Mandatory
    Given the user is on the Etsy home page
    When the user selects the Register option
    And the user clicks on the Register button
    Then the result should be "Can't be blank."

  Scenario: Create Account with Gmail
    Given the user is on the Etsy home page
    When the user selects the Register option
    And the user clicks on the 'Continue with Google' button
    And the user enters the user as "karentest201911" and the password as "Medellin201911"
    Then the system displays the success message "Welcome back"