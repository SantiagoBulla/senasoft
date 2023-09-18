Feature: Shoes module

  Background: Successful login
    Given that the user is the login page
    When he enter the credentials
      | document   | password       |
      | 1111111111 | contraseña1234 |
    Then he should be redirected to the main page

  Scenario: add wallet into wishlist
    Given the user is the index page
    When the user clicks on Accesories option
    And the user clicks on waller option
    And the user see the result of their search
    And the user clicks the favorite option
    And the user clicks on añadir a la lista de deseos