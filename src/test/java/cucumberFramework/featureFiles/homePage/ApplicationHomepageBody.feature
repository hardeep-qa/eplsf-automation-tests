@functional
Feature: Application Homepage Body
	Verify the functionality of the features available on the Body of homepage excluding Header and Footer
	

Background:
	Given User access the application "https://www.easypeasyforms.com/" homepage
	
Scenario: Verify first (top to bottom) signup button functionality
	When User clicks on the first Sign up - it's FREE button
	Then User should redirect to the "https://go.easypeasyforms.com/SignUpNow?pid=1" signup page
	
Scenario: Verify second (top to bottom) signup button functionality
	When User clicks on the second Sign up - it's FREE button
	Then User should redirect to the "https://go.easypeasyforms.com/SignUpNow?pid=1" signup page
	
Scenario: Verify third (top to bottom) signup button functionality
	When User clicks on the third Sign up - it's FREE button
	Then User should redirect to the "https://go.easypeasyforms.com/SignUpNow?pid=1" signup page
	
Scenario: Verify fourth (top to bottom) signup button functionality
	When User clicks on the fourth Sign up - it's FREE button
	Then User should redirect to the "https://go.easypeasyforms.com/SignUpNow?pid=1" signup page