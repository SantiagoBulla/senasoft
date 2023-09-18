Feature: Shoes module

  Background: Successful login
    Given that the user is the login page
    When he enter the credentials
      | document   | password       |
      | 1111111111 | contraseña1234 |
    Then he should be redirected to the main page

  Scenario: add shoes into wishlist
    Given that the user is on the shoes section
    When the user clicks on heart button into a product card
    Then he should see the product added on the wish list