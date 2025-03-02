Feature: Login Functionality

  Scenario: Validate successful login and landing on home page
    Given User is on the Login Page
    When User enters valid credentials
    Then User should be navigated to the Home Page
