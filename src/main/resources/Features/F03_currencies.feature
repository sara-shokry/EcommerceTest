Feature:  currency feature |  User could change currency to Euro

  Scenario: Select Euro currency from the dropdown list and make sure all products changed
    Given Select Euro currency from the dropdown list
    Then validate currency changed for each product
