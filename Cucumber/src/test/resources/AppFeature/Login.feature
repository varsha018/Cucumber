Feature: Login Feature
Scenario Outline: Login Fail-Possible Combination
Given User is on Application Landing Page
When User click on Sign In button
Then User is displayed Login Screen
When User enters Username in "<UserName>" Field
And User enters password in "<Password>" Field
And User clicks SignIn button
Then User gets login failed error message

Examples: 
					|UserName    | Password         |
					|Varsha      | incorrectPASSWORD|
					|InCorrectUN | 12345            |
					
					


 

 