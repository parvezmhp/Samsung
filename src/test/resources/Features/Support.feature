Feature: User contacts Samsung Support to get a cracked phone screen fixed.

  Background:
    Given User is on the Home Page

  Scenario: User will be able to see different support options

    When User hovers mouse on Support tab, clicks on Contact Us tab
    And User selects appropriate product and related issue
    Then User lands on the Recommended Solutions page
