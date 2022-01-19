Feature: Login Page Feature


  Scenario: Login Page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Login - My Store"

