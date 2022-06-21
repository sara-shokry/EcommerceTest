@regression
Feature:  Follow up  feature |  select different social network

 Scenario: user could select facebook icon
    Given user click on facebook
     And switch to the next tab
   Then verfiy the facebook url "https://www.facebook.com/nopCommerce"

  Scenario: user could select twitter icon
    Given user click on twitter
    And switch to the next tab
    Then verfiy the twitter url "https://twitter.com/nopCommerce"

  Scenario: user could select rss icon
    Given user click on rss
    And switch to the next tab
    Then verfiy the rss url "https://demo.nopcommerce.com/news/rss/1"

  Scenario: user could select youtube icon
    Given user click on youtube
    And switch to the next tab
    Then verfiy the rss url "https://www.youtube.com/user/nopCommerce"
