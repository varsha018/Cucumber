Feature: Calculate billing amount

Scenario Outline: Billing Amount
Given User is on billing page
When user enters BILLING AMOUNT <BillingAmt>
And user enters TAX AMOUNT <TaxAmt>
And user clicks on Calculate button
Then the final output which he receives is <FinalAmt>

Examples:
						| BillingAmt | TaxAmt | FinalAmt |
						| 1000       | 5      | 1005     |
						| 100		     | 5      | 105      |
						| 1000.5     | 5      | 1005.5   |
