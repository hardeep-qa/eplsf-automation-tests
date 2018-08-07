@ApplicationFeaturesPage
Feature: Application Features Page
	Verify the functionality of the features available on the features page
	
Background:
	Given User access the application "https://www.easypeasyforms.com/features/" features page
	
Scenario: Verify signup button functionality on features page
	When User clicks on Sign up - it's FREE button on the features page
	Then User should redirect to the "https://go.easypeasyforms.com/SignUpNow?pid=1" signup page