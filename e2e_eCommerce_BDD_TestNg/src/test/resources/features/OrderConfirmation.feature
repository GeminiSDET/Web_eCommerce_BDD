Feature: Order Confirmation

  Scenario: Validate that the order is successfully placed
    Given User has placed an order
    Then User should see the order confirmation message
