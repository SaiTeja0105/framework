Feature: Test login functioanlity

  Scenario: Check login with valid credentials
    Given Browser is open
    And user is on login page
    When user enters username and password
    Then user is navigated to HomePage 
    #Also enter logout code
