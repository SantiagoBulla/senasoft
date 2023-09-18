Feature: Accessories module

  Background: login
    Given that the user is the login page
    When he enter the credentials
      | document   | password             |
      | 1021234623 | panconsalchines1233@ |
    Then he should be redirected to the main page

  Scenario: add wallet into wishlist
    Given the user is the Accessories page
    When the user Clicks on wallet option and Sees the result of their search
    And Clicks the favorite option and clicks on "añadir a la lista de deseos"


    Then the product is added to the wishlist