@ApplicationFooter
Feature: Application Footer
	Verify the functionality of links available on the Footer of the application
	
Background:
	Given User access the application "https://www.easypeasyforms.com/" homepage
		
Scenario: Verify Home link functionality
	When User clicks on the Home link 
	Then User should redirect on the "https://www.easypeasyforms.com/" homepage
	
Scenario: Verify Features link functionality
	When User clicks on the Features link
	Then User should redirect to the "https://www.easypeasyforms.com/features/" features page 
	
Scenario: Verify Pricing link functionality
	When User clicks on the Pricing link
	Then User should redirect to the "https://www.easypeasyforms.com/pricing/" pricing page
	
Scenario: Verify Support link functionality
	When User clicks on the Support link
	Then User should redirect to the "https://www.easypeasyforms.com/support/" support page
	
Scenario: Verify Blog link functionality
	When User clicks on the Blog link
	Then User should redirect to the "https://www.easypeasyforms.com/blog/" blog page
	
Scenario: Verify Login link functionality
	When User clicks on the Login link 
	Then User should redirect to the "https://go.easypeasyforms.com/SignIn/" login/signin page
	
Scenario: Verify Register link functionality
	When User clicks on the Register link
	Then User should redirect to the "https://go.easypeasyforms.com/SignUpNow?pid=1" signup page
	
Scenario: Verify About link functionality
	When User clicks on the About link
	Then User should redirect to the "https://www.easypeasyforms.com/about/" about page
	
Scenario: Verify Terms of use link functionality
	When User clicks on the Terms of use link
	Then User should redirect to the "https://www.easypeasyforms.com/terms/" terms page
	
Scenario: Verify Privacy link functionality
	When User clicks on the Privacy link
	Then User should redirect to the "https://www.easypeasyforms.com/privacy/" privacy page
	
Scenario: Verify Copyright © 2018 Easy Peasy Lemon Squeezy Forms. text is displayed
	Then User should see "Copyright © 2018 Easy Peasy Lemon Squeezy Forms." text
