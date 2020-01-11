Feature: Testing API request

Scenario: Checking for Sanity Testing
	Given User sends a GET request to the list endpoint,they must get back a valid status code
	
	
	
Scenario Outline: Create a new student and verify if it added
Given I created a new student firstname <firstName> lastname <lastName> email <email> programm <programm>
Then I verify that the student with <email> is created

Examples:
|firstName|lastName|email|programm|
|Mark|john|markJohn@yahoo.com|JavaAcripts|
	