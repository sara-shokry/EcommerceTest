@regression
Feature:  Homepage Slider feature |  user select one of slider and navigate to its page

 Scenario: user could select first slider
    Given Select first slide
    Then verfiy first link "https://demo.nopcommerce.com/nokia-lumia-1020"

  Scenario: user could select second  slider
    Given Select second slide
    Then verfiy second link "https://demo.nopcommerce.com/iphone-XR-32"


