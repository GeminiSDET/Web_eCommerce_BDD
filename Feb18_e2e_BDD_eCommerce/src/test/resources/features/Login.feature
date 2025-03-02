Feature: Login functionality

  Scenario Outline: Login with valid and invalid credentials
    Given User is on the login page
    When User enters email "<email>" and password "<password>"
    Then User should see "<message>"

    Examples:
      | email                      | password   | message                      |
      | azarriju88@gmail.com       | Azar~!@#4 | Home Page should be visible |
      | invalid@example.com        | WrongPass | Invalid login message should be displayed |
