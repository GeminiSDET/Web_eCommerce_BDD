Feature: Cart functionality

  Scenario: Add selected products to cart
    Given User is logged in
    When User adds "Zara Coat 3" and "Adidas Original" to the cart
    Then The products should be in the cart
