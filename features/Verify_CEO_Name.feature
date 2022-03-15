@GetCEOName
Feature: This feature is to get the CEO name from the OrangeHRM apps
Scenario Outline: This test is to verify the CEO names
	Given the user is logged in successfully and is on Home Pages
	When the user clicks on the directory option from the Menu bars
	And the user selects the job title as "Cheif Executive Officer" from the drop downs
	And clicks the search buttons
	Then the user should see the CEO name as "John Smith"
	
Examples:
|CEO_Names|
|John Smiths|