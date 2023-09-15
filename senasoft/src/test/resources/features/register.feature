Feature: Sign in
  the user wants to register to explore the products
  on the web page

  Scenario Outline: register Sucessfull
    Given the user is in the login page
    When the user enter the credentials
      | name         | <name>         |
      | email addres | <email addres> |
      | password     | <password>     |
    Then the user should be redirect to the main page

    Examples:
      | name | email addres           | password |
      | Juan | juandsalinas@gmail.com | Juan1234 |
