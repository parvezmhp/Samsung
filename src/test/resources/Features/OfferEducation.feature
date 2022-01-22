Feature: User can see Education Offers by Samsung

  Background:
    Given User is on the Home Page

  Scenario: User will be able to see Samsung Education Offers

    When User clicks on Cookies tab for OfferEducations
    And User hovers mouse to Offers and Offer Program tabs
    And User clicks on Education Offers Program
    And User clicks on All Student Offers tab and selects desired product and clicks on Buy Now
    Then User will land on the Samsung Account Login page to complete the purchase



