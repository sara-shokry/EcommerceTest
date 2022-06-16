Feature:  Categories feature |  select different Categories

 Scenario: user could select different Categories
    Given hover on categories
    Then user could select sub_Category if found
    And verfiy PageTitle to sub_category
