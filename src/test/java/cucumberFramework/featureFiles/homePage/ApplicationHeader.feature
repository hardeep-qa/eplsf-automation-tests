@ApplicationHeader
Feature: Application Header
	Verify the functionality of links available on the Header of the application
	

Background:
	Given User access the application "https://www.easypeasyforms.com/" homepage
@Demo		
Scenario: Verify easypeasyforms logo functionality
	When User clicks on the easypeasyforms logo
	Then User should redirect on the "https://www.easypeasyforms.com/" homepage
	
Scenario: Verify FEATURES link functionality
	When User clicks on the FEATURES link
	Then User should redirect to the "https://www.easypeasyforms.com/features/" features page
	
Scenario: Verify PRICING link functionality
	When User clicks on the PRICING link
	Then User should redirect to the "https://www.easypeasyforms.com/pricing/" pricing page
	
Scenario: Verify SUPPORT link functionality
	When User clicks on the SUPPORT link
	Then User should redirect to the "https://www.easypeasyforms.com/support/" support page
	
Scenario: Verify Login button functionality
	When User clicks on the Login button
	Then User should redirect to the "https://go.easypeasyforms.com/SignIn/" login/signin page
	
Scenario: Verify Register button functionality
	When User clicks on the Register button
	Then User should redirect to the "https://go.easypeasyforms.com/SignUpNow?pid=1" signup page
	
Scenario: Verify Read our Blog link functionality
	When User clicks on the Read our Blog link
	Then User should redirect to the "https://www.easypeasyforms.com/blog/" blog page
	
Scenario: Verify Call Us text is displayed
	Then User should see text "Call Us" Call Us
	
Scenario: Verify number contact number 0800 111 106 is displayed
	Then User should see the contact number "0800 111 106"
	
	
	