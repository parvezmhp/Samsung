Feature: Search multiple products

  Background:
    Given User is on the Home Page

  Scenario Outline:User will search multiple products

    Then User clicks on search button
    And Types the products name "<products>"
    Then Clicks on Search icon and see the title "<title>"
    Examples:
      | products    | title                   |
      | Galaxy S21+ | Samsung Search - Home |
      | Galaxy A    | Samsung Search - Home |
      | QLED 4K     | Shop our Best 4K TVs  |
