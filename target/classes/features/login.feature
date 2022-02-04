Feature: Amazon login feature with credentials

Scenario: Amazon login scenario

Given user is already on login Page
When title of login page is amazon signIn
Then user enters emailId
Then user clicks on continue button
Then user enters password
Then user clicks on login button
Then user close the browser