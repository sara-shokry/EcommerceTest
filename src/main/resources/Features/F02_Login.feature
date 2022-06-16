@regression
Feature:  Login feature |  User could login with valid data

  Scenario: user logged in  with valid data
    Given user navigate to login page
    When user enter "test1@gmail.com" and "123456789"
    And user click on login button
    Then user could loggedIn successfully and go to home page
    And account tab is displayed