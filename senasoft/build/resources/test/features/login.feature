Feature: Login
  The user wants to login into the bon-bonite website
  To explore the products and the site itself

  Scenario Outline: Successful Login
    Given that the user is the login page
    When he enter the correct credentials
      | Document | <Document> |
      | Password | <Password> |
    Then he should be redirected to the main page

    Examples:
      | Document   | Password       |
      | 1111111111 | contraseña1234 |
