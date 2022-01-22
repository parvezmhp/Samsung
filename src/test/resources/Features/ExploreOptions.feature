Feature: User navigates the Explore button to know different innovative ideas

  Background:
    Given User is on the Home Page

  Scenario: User will be able to see different ideas in Explore button

    When User hovers mouse on Explore button
    And User hovers mouse on Wellbeing tab and clicks on Wellbeing Article tab
    Then User will land on the Wellbeing page and be able to read Kids' First Phones article under Kids' First Phones article link
