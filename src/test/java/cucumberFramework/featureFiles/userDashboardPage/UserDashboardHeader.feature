@Regression @functional
Feature: User Dashboard Header
	Verify logo functionality
		As a user I want to navigate back to my dashboard
		So that I can use dashboard features
	Verify search box functionality
		As a user I want to search my forms
		So that I can see my forms filtered on the basis of keyword provided
	Verify notification icon functionality
		As a user I want to click on notification Icon
		So that I can see notifications 
	Verify user Icon functionality
		As o user I want to click on user Icon
		So that I can see the droplist options
	Verify My Account link functionality
		As a user I want to click on My Account link 
		So that I can reach the user settings page
	Verify logout functionality
		As a user I want to click on Logout link
		So that I can logout from the application
		
Background: User is loggedIn to the application
	Given User access the application "https://go.easypeasyforms.com/SignIn/" signin page
	And User enter the "test4@test.com" Email Address
	And User enter the "test" Password
	And User clicks on the Login button on signin page
	And User should login and easypeasyforms dashboard should be displayed
	
Scenario: Verify logo functionality
	When User clicks on EASY PEASY LEAMON SQUEEZY FORMS logo
	Then User should navigate to the "https://go.easypeasyforms.com/Forms/" dashboard
	
Scenario: Search form(s)
	When User fill keywords "form2" text in search textbox
	Then User should be able to see requested "form2" form filtered on the basis of keyword provided
	
Scenario: Check notifications
	When User clicks the notification Icon
	Then User should see the list of notifications (if available)
	
Scenario: Verify options available under user droplist
	When User clicks the user Icon
	Then User should be able to see Users "Hardeep" name
	
Scenario: Verify My Account link functionality
	When User clicks the user Icon
	And User clicks on My Account link
	Then User should reach the user settings "https://go.easypeasyforms.com/Forms?settings=account" page
		
Scenario: Verify Logout functionality
	When User clicks the user Icon
	And User clicks on Logout link
	Then User should Logged out from the account and reached to URL: "https://go.easypeasyforms.com/Logout/"
	When User press the back button of the browser
	Then User should get the following alert "Access denied. You have either not signed in or your session has timed out. Please sign in."

	 
	
	

