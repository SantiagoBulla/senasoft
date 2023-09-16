Feature: Sign in
  the user wants to register to explore the products
  on the web page

  Scenario: register Sucessfull
    Given the user is in the login page
    When the user enter the credentials
    Then the user should be redirect to the main page
