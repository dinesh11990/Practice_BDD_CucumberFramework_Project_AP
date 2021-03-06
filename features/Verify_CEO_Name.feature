Feature: This feature is to get the CEO name from the OrangeHRM apps
Scenario Outline: This test is to verify the CEO names
	Given the user is logged in successfully and is on Home Pages
	When the user clicks on the directory option from the Menu bars
	And the user selects the job title as "Chief Executive Officer" from the drop down "text"
	And clicks the search button
	Then the user should see the CEO name as "John Smith"
	
	
Examples:
|CEO_Names|
|John Smiths|