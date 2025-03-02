Feature: Checkout and Payment

  Scenario: Select 'Buy Now' for 'Zara Coat 3' and proceed to payment
    Given User has products in the cart
    When User selects 'Buy Now' for 'Zara Coat 3'
    Then User should be navigated to the payment page

  Scenario: Place an order after selecting country name as India
    Given User is on the payment page
    When User selects country as 'India' and places the order
    Then The order should be placed successfully
