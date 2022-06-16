@regression
Feature:  search feature |  User could search by product name or sku

 Scenario Outline: user could search using product name
    Given Select searchBox
    When search for any product like "<keyWord>"
    And click search
    Then verfiy url contains nopCommerce demo store. Search
    And verfiy search shows relevant results

Examples:
  | keyWord |
  | Apple |
  | Lenovo |

  Scenario Outline: user could search for product using sku
    Given Select searchBox
    When search for any product sku "<sku>"
    And click search
    Then verfiy sku shown in each product list


    Examples:
      | sku |
      | SF_PRO_11 |
