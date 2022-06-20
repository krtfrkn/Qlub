Feature: As a customer, when I see the bill, I should be able to see the payment option, which are
         card payment or wallet payment (ApplePay/GooglePay)
  @Qlub-004
  Scenario: The user should see the payment options
    Given The user scan the QR code
    When The user clicks on Pay the Bill button
    Then The user should see the payment options