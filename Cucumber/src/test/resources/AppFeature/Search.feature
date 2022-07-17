
Feature: Amazon Search

Scenario: Search a Book

Given I have a search field on Amazon Page
When I search for a product with product name "Sidney Seldon Books" and price 200
Then Product with name "Sidney Seldon Books" should be displayed


Scenario: Search a Mobile

Given I have a search field on Amazon Page
When I search for a product with product name "One Plus Mobile" and price 2000
Then Product with name "One Plus Mobile" should be displayed