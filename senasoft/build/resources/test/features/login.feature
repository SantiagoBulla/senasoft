Feature: Login
  The user wants to login into the bon-bonite website
  To explore the products and the site itself

  Scenario Outline: Successful Login
    Given that the user is the login page
    When he enter the credentials
      | document   | password   |
      | <document> | <password> |
    Then he should be redirected to the main page

    Examples:
      | document   | password       |
      | 1111111111 | contraseña1234 |


  Scenario Outline: User attempts to login with invalid credentials
    Given that the user is the login page
    When he enter the credentials
      | document   | password   |
      | <document> | <password> |
    Then he should see an error alert

    Examples:
      | document | password      |
      | 12345    | wrongpassword |