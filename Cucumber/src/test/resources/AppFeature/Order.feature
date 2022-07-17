@All
Feature: Amazon Order Page

I want to check the orders of last 6 months and validate cancelled orders
also to check Open Orders

Background:
Given a registered user exists
Given User is on Amazon Login page
When user enters Username
And User enters password
And User clicks on login button
Then user navigates to User page


Scenario: Check previous order details
When user click on Order link
Then user checks the previous order details

 
Scenario: Check Cancelled order details
When user click on Cancelled Orders link
Then user checks the cancelled order details

Scenario: Check Open order details
When user click on Open Orders link
Then user checks the open order details

