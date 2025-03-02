Feature: Add Products to Cart

  Scenario: Add 'Zara Coat 3' and 'Adidas Original' to the cart
    Given User is logged in
    When User adds 'Zara Coat 3' and 'Adidas Original' to the cart
    Then The products should be added to the cart successfully
