Feature: Home Page Validation

  Scenario: User lands on Home Page after successful login
    Given User navigates to Login Page
    When User logs in with valid credentials "azarriju88@gmail.com" and "Azar~!@#4"
    Then User should be on Home Page
    And Home Page should display the correct logo
