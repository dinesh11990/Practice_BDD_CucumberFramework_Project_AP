Feature: This feature is to get pending timesheets
Scenario Outline: This test is to verify the pending timesheets
Given the user is on the homepages
And the user clicks on the time option from the menus
And the user enters the name as "John Smiths"
And clicks on the view buttons
Then the user should see the message as "messages"

Examples:
|messages|
|No Timesheets Founds|