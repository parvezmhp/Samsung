Feature: Search multiple products

  Background:
    Given User is on the Home Page

  Scenario Outline:User will search multiple products

    Then User clicks on search button
    And Types the products name "<products>"
    Then Clicks on Search icon
    Examples:
      | products    |
      | Galaxy S21+ |
      | Galaxy A    |
      | QLED 4K     |
