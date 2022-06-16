@regression
Feature:  Follow up  feature |  select different social network

 Background: user logged in  with valid data
   Given user navigate to login page
   When user enter "test1@gmail.com" and "123456789"
   And user click on login button

  Scenario: Logged user could add different products to Wishlist
    Given user add 3rd product to wishlist
     Then verfiy success message displayed
    And green background

