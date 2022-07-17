@All
Feature: Uber booking feature

@Smoke
  Scenario: Booking Cab Lamborgini
    Given User wants to travel in a luxurious car "Lamborgini"
    When User searches for the car from "Bangalore" to "Mumbai"
    Then User gets charged 10000
    And User searches for the Car from "Bangalore" to "Delhi"
    Then User gets charged 30000

@Sanity @Smoke
    Scenario: Booking Cab Jaguor
    Given User wants to travel in a luxurious car "Jaguor"
    When User searches for the car from "Delhi" to "Mumbai"
    Then User gets charged 10000
    And User searches for the Car from "Delhi" to "Delhi"
    Then User gets charged 30000
    
@Regression   
    Scenario: Booking Cab Audi
    Given User wants to travel in a luxurious car "Audi"
    When User searches for the car from "Pune" to "Mumbai"
    Then User gets charged 10000
    And User searches for the Car from "Pune" to "Delhi"
    Then User gets charged 30000