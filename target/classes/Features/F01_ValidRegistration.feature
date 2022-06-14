Feature: register feature |  User could register with valid data

  Scenario: user registered with valid data
    Given user navigate to registration page
    When user enter valid data "soha" and "shokry"
    And user click on register button
    Then user could registered successfully
