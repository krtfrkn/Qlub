Feature: As a customer, when I scan the QR code, I should be able to choose to see restaurant’s menu

  Scenario: The user should scan the QR code
    Given The user scan the QR code
    Then The user on the Home Page

  Scenario: The user should see the restaurant’s menu
    Given The user scan the QR code
    When The user clicks on the View the Menu button
    Then The user views Menu
