#Feature: Will test the Sign In functionality
#
#@PositiveTest
#  Scenario Outline: User will Sign In successfully with valid credentials
#    Given User is on Home Page
#    And User hovers mouse on Sign In button and clicks on Sign In from dropdown menu
#    When User enters Email "<email>" and password "<password>" and clicks on Sign In
#    Then User will click on Not Now tab and will be signed in
#  Examples:
#  | email                | password |
#  | njesy2015@gmail.com  | Zoom#786 |
#
#@NegativeTest
#  Scenario: User Can Not Sign In Successfully With Invalid Credential
#    Given User Is In Home Page
#    Then From The Home Page User Will Click On Sign In Button
#    And Click On Sign In From The DropDown Menu
#    When User Is In Sign In Page User Enter username "raju.qatek@gmail.com" and password "Qatek2021"
#    And Click Login
#    Then User See  Error Msg