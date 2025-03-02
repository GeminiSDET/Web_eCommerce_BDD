Feature: Login to Application

  Scenario: Validate Landing in HomePage
    Given User is on Login Page
    When User enters valied credentials and logs in
    Then User should be navigated to Home Page