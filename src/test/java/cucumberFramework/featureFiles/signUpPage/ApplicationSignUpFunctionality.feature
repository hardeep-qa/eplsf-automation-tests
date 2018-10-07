@Regression @functional @Smoke
Feature: SignUp
	Verify EasyPeasyForms logo functionality
	Verify SignUp functionality with invalid credentials
	Verify Login link functionality
	
	Please Note the following functionalities are NOT automated for now:
		I'm not a robot checkbox functionality
		SignUp functionality with valid credentials
	
Background: Navigate to signup page
	Given User access the application "https://go.easypeasyforms.com/SignUpNow?pid=1" signup page
@test
Scenario: Verify easypeasyforms logo functionality on signin page
	When User clicks on the easypeasyforms logo on signin page
	Then User should redirect on the "https://www.easypeasyforms.com/" homepage
	
Scenario Outline: SignUp with invalid credentials
	When User enter the "<name>" Name on signup page
	And User enter the "<email>" Email Address on signup page
	And User enter the "<password>" Password on signup page
	And User enter the "<confirmPassword>" Confirm Password on signup page
	And User select the "<location>" location from the dropdown on signup page
	When User clicks the Sign Up button on signup page
	Then User should be presented the following alert "<errorMessage>"
	
	Examples:
	| name    | email          | password | confirmPassword | location 			  | errorMessage  						|
	|	      |	               |	      |	                | New Zealand (en-NZ) | Name required  					    |
	|	      | test2@test.com | test	  | test	        | China (ii-CN)		  | Name required  		                |
	| hardeep | 			   | test	  | test	        | Finland (sv-FI)	  | Email required		                |
	| hardeep | abcde          | test	  | test     	    | Germany (de-DE)	  | Please enter a valid email address. |
	| hardeep | abcd@abc       | test	  | test     	    | India (as-IN)		  | Please enter a valid email address. |
	| hardeep | abc.com        | test	  | test     	    | Libya (ar-LY)		  | Please enter a valid email address. |
	| hardeep | test2@test.com | test	  |       	        | Morocco (ar-MA)	  | Passwords do not match 			    |
	| hardeep | test2@test.com | test	  | tset    	    | Russia (ba-RU)	  | Passwords do not match 			    |
	
Scenario: Verify login link functionality on signup page
	When User clicks on the login link on signup page
	Then User should redirect to the "https://go.easypeasyforms.com/SignIn/" login/signin page
	
Scenario: Verify SignUp with already registered account and error message link functionality
	When User enter the "hardeep" Name on signup page
	And User enter the "test2@test.com" Email Address on signup page
	And User enter the "test" Password on signup page
	And User enter the "test" Confirm Password on signup page
	And User select the "New Zealand (en-NZ)" location from the dropdown on signup page
	When User clicks the Sign Up button on signup page
	Then User should be presented the following warning "If this is you, click here to log in. There is also a reset password link you can click in case you have forgotten your password"
	When User clicks on the link on the error message on signup page
	Then User should redirect to the "https://go.easypeasyforms.com/SignIn/" login/signin page	