Feature: Sign in
  the user wants to register on the web page
  for to explore the products


  Scenario Outline: register Sucessfull
    Given the user is in the login page
    When the user enter the credentials
      | document   | email   | password   |
      | <document> | <email> | <password> |
    Then the user should be redirect to the main page

    Examples:
      | document   | email                       | password  |
      | 1021396262 | juandsalinasnacun@gmail.com | Em@ji2018 |


  Scenario Outline: register Failed
    Given the user is in the login page
    When the user enters the failed credentials
      | document   | email   | password   |
      | <document> | <email> | <password> |
    Then the user should see an error message

    Examples:
      | document | email                  | password         |
      | qqqq     | paneconqueso@gmail.com | 1234pan5643queso |