@functional @current
Feature: Create new form
	
Background:
	Given User access the application "https://go.easypeasyforms.com/SignIn/" signin page
	And User enter the "test5@test.com" Email Address
	And User enter the "test" Password
	And User clicks on the Login button on signin page
	And User clicks on New Form button
	
Scenario: Create new blank form
	When User clicks on blank form link
	And User enters the form name "DummyForm" in textbox
	And clicks on the create form button
	And User drag the name button and drop it in the form
	And User drag the option list button and drop it in the form
	And User drag the (image uploaded) button and drop it in the form
	And the "DummyForm" form should be available in the forms list
	And User check the "DummyForm" from the list
	And click on delete icon
	
	
	