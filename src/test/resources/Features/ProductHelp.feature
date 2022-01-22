Feature: User navigates under Support tab to register phone

  Background:
    Given User is on the Home Page

  Scenario: User will be able to register phone

    When User hovers mouse on Support and clicks on Product and selects specific product to get support
    Then User lands on the Log In after clicking on Register Your Product
