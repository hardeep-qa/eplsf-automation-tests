@functional
Feature: Application Pricing Page
	Verify the functionality of the features available on the Pricing page
	
Background:
	Given User access the application "https://www.easypeasyforms.com/pricing/" pricing page
	
Scenario: Verify Get Started button functionality in the Starter package on pricing page
	When User clicks on Get Started button in Starter package
	Then User should redirect on the "https://go.easypeasyforms.com/SignUpNow?pid=6401" Starter signup page
	
Scenario: Verify Get Started button functionality in the Professional package on pricing page
	When User clicks on Get Started button in Professional package
	Then User should redirect on the "https://go.easypeasyforms.com/SignUpNow?pid=6402" Professional signup page
	
Scenario: Verify Get Started button functionality in the Business package on pricing page
	When User clicks on Get Started button in Business package
	Then User should redirect on the "https://go.easypeasyforms.com/SignUpNow?pid=6403" Business signup page
	
Scenario: Verify Get Started button functionality in the Enterprise package on pricing page
	When User clicks on Get Started button in Enterprise package
	Then User should redirect on the "https://go.easypeasyforms.com/SignUpNow?pid=6404" Enterprise signup page