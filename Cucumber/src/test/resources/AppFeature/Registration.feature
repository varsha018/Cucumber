Feature: Registration Page

Scenario: User Registration with different set of data

Given User is on Registration Page
When User Enters the below data
	| Varsha | Gupta | Automation | var@gmail.com | 987654321 |
	| Ayushi | Gupta | Citrix | ayu@gmail.com | 9876654321 |
	| Shivam | Gupta | Chartered Accountant | shiv@gmail.com | 98709871 |
Then User registration should be successful

Scenario: User Registration with different set of data with Column
Given User is on Registration Page
When User Enters the below data with Column
	| FirstName | LastName | Field | Email | Phone |
	| Varsha | Gupta | Automation | var@gmail.com | 987654321 |
	| Ayushi | Gupta | Citrix | ayu@gmail.com | 9876654321 |
	| Shivam | Gupta | Chartered Accountant | shiv@gmail.com | 98709871 |
Then User registration should be successful