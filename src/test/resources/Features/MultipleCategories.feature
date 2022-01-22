Feature: Check multiple categories functionality

  Background:
    Given User is on the Home Page

  @ChoseDifferentCategories
  Scenario Outline: User will Chose multiple categories
    When The user clicks on Computing
    And Choose "<item>"
    Then Validates the Page Title Contain "<title>"
    Examples:
      | item                   | title                       |
      | 'Galaxy Book Pro 360'] | 2-in-1 PC & Tablet          |
      | 'Galaxy Book']         | Powerful Touchscreen Laptop |
      | 'Smart Monitors']      | 4K Do-It-All Monitors       |
