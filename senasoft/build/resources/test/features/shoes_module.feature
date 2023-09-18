Feature: Shoes module test

  Background: Successful Login
    Given that the user is the login page
    When he enter the credentials
      | document   | password       |
      | 1111111111 | contraseña1234 |
    Then he should be redirected to the main page
