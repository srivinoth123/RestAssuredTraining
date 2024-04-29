@OrangeHrm
Feature: validation for application login feature
Scenario: login scenario
 Given user is on the login page
 When user enter username and password
 |Admin|admin123|
 And user click on enter button
 Then user should be navicated to the home page