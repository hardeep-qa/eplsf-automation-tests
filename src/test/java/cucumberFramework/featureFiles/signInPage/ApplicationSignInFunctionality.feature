@Regression @functional @Smoke @login
Feature: LogIn
	Verify EasyPeasyForms logo functionality
	Verify LogIn functionality with invalid and valid credentials
	Verify Forgot Password link functionality
	Verify Not Yet a Memeber Register link functionality
	Verify Remember checkbox functionality
	
Background:
	Given User access the application "https://go.easypeasyforms.com/SignIn/" signin page
	
Scenario: Verify easypeasyforms logo functionality on signin page
	When User clicks on the easypeasyforms logo on signin page
	Then User should redirect on the "https://www.easypeasyforms.com/" homepage
	
Scenario Outline: Verify login with invalid credentials
	When User enter the "<email>" Email Address
	And  User enter the "<password>" Password
	When User clicks on the Login button on signin page
	Then The user should be presented the following alert "<errorMessage>"
	
	Examples:
	| email	   	   | password		| errorMessage 																   |
	|	      	   |				| Email required															   |
	| abc@test.com | abc123			| Login failed. Please check the username or correct the password you entered. |
	| abc@test.com |				| Password required															   |
	| abcd.test    | abc123			| Login failed. Please check the username or correct the password you entered. |
	
Scenario: Verify login with valid email and valid password
	When User enter the "test4@test.com" Email Address
	And  User enter the "test" Password
	When User clicks on the Login button on signin page
	Then User should login and easypeasyforms dashboard should be displayed
	
Scenario: Verify Forgot Password link functionality on signin page
	When User clicks on Forgot Password link
	Then The user should be presented the Password Recovery pop-up

Scenario Outline: Verify Recovery Password functionality with invalid credentials
	When User clicks on Forgot Password link
	Then The user should be presented the Password Recovery pop-up
	And User enter the "<email>" Email Address in password recovery popup
	When User clicks on the Recover Password button on the pop-up
	Then The user should be presented the following alert "<errorMessage>"
	
	Examples:
	| email	   	| errorMessage 									 |
	|	      	| Please enter your email address.			     |
	| abcd.test | The email you entered does not exist as a user |
	
Scenario: Verify Recovery Password functionality with valid credentials
	When User clicks on Forgot Password link
	Then The user should be presented the Password Recovery pop-up
	And User enter the "test4@test.com" Email Address in password recovery popup
	When User clicks on the Recover Password button on the pop-up
	Then The user should be presented the following "Password reset email sent! Please check your email." success alert
		
Scenario: Verify Not yet a Member Register link functionality on signin page
	When User clicks on the Register link on signin page
	Then The user should be redirect to the normal "https://go.easypeasyforms.com/SignUpNow" signup page
	
Scenario: Verify Remember checkbox default status on signin page
	Then Verify Remember checkbox status
	
Scenario: Verify Remember checkbox functionality when checked
	When User enter the "test4@test.com" Email Address
	And  User enter the "test" Password
	And User click Remember checkbox on signin page
	When User clicks on the Login button on signin page
	Then User should login and easypeasyforms dashboard should be displayed
	When User clicks on the account icon on the dashboard
	And user clicks on the Logout link
	Then User should Logout and redirect on the "https://go.easypeasyforms.com/Logout/" signin page
	And email textbox should be "test4@test.com"
	
Scenario: Verify Remember checkbox functionality when unchecked
	When User enter the "test4@test.com" Email Address
	And  User enter the "test" Password
	When User clicks on the Login button on signin page
	Then User should login and easypeasyforms dashboard should be displayed
	When User clicks on the account icon on the dashboard
	And user clicks on the Logout link
	Then User should Logout and redirect on the "https://go.easypeasyforms.com/Logout/" signin page
	And email textbox should be ""
	

