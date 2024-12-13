Feature: To validate Login functionality of OrangeHRM application

  Scenario: To verify Login with valid credentials
    When I enter valid username "admin"
    And I enter valid password "admin123"
    And I click on the Login button
    Then I should be redirected to the dashboard

  Scenario: To verify Login with invalid credentials
    When I enter invalid username "wrongUser"
    And I enter invalid password "12345"
    And I click on the Login button
    Then I should see an invalid credential error message "Invalid credentials"

  Scenario: To verify Login with blank credentials
    When I leave the username and password blank
    And I click on the Login button
    Then I should see an error message "Required"