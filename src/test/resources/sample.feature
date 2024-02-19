Feature: To validate the login functionality of facebook application

Scenario: TO validate login with username and invalid password
Scenario: To validate login with empty username and password
Given  To launch the chrome browser and maximise application 
When  To launch the url of the facebook application 
And  TO pass valid username in email field
And  To pass invalid password in password Field
And To click the login button
And To check Whether navigate to the home page or not
Then To close the browser