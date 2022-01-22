Feature: User will search and buy a specific product

  Background:
    Given User is on the Home Page

  Scenario: User is searching to buy latest a Samsung Frame TV

    When User searches for Smart TV after sorting for the Newest option
    And User selects the desired TV and clicks on Add To Cart
    Then User lands on the Check Out page to complete purchase



