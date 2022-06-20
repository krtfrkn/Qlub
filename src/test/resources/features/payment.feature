Feature: As a customer, when I click on “Pay my Bill”, I should be able to choose to see the bill that I ordered on my table

  Scenario: The user should view the Bill
    Given The user scan the QR code
    When The user sees "Pay my Bill" button
    And The user clicks on Pay the Bill button
    Then The user should see the bill that he ordered