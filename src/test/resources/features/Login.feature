Feature: Login
    In order to buy
    As as customer
    I want to login in the Web Page

  Scenario: Fail Login
    Given the user is on the Etsy home page
    When the user wants to login on the page
    And the user enters the user as "test" and the password as "test"
    Then the system shows the message "Password was incorrect."

  Scenario Outline: Successful Login
    Given the user is on the Etsy home page
    When the user wants to login on the page
    And the user enters the user as "<user>" and the password as "<password>"
    Then the system displays the success message "Welcome back"

    Examples:
      | user | password |
      | mileani.mile@gmail.com | mile123 |
      | leidyd07@gmail.com | leidy123 |
      | camiarturd@gmail.com | cami123 |