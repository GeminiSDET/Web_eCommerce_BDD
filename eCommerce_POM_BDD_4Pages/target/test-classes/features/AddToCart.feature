Feature: Add Product to Cart

  Scenario: Add 'Zara Coat 3' and 'Adidas Original' to cart
    Given User is on Home Page
    When User adds 'Zara Coat 3' and 'Adidas Original' to the cart
    Then The products should be added to the cart successfully