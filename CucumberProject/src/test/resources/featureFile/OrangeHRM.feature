@Before
Feature: validation application login feature
Scenario Outline: application login scenario
Given user is on the application home page
When user enter the "<UserName>" and "<Password>"
And user click on the login button
Then user should success to navigated the next page
Examples: 
|UserName|Password|
|Admin|admin123|
|Admin|admin12|



