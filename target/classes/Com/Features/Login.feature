Feature: User should be able to Login with Valid Username and Password 
	User should also not be able to login with Invalid data
   
	#	   Background:
	#	    Given I Navigate to the homepage on browser     
	#	  
#@ignore
@Login 
Scenario: Clicking On Login Buttton to see if Loging Pop-up box displayed 
<<<<<<< HEAD
	Given I Navigate to the homepage on "browser" 
=======
	Given I Navigate to the homepage on "browser"
>>>>>>> d219a815b3476f006fd5cfeba5123e9c66426e03
	When I click on Login Button 
	Then I should see Login Pop-up box displayed 
	And I should see Supercasino Logo displayed 
	And I should see Username Input Box 
	And I should see Password Input box 
	And I should see Forgotten details link 
	And I should see SignIn Button 
	And I should see New User link 
	And I should see Join Now Button 
	And I should see Close Incon 
	
	
	
	
<<<<<<< HEAD
=======
		
>>>>>>> d219a815b3476f006fd5cfeba5123e9c66426e03
	
#@ignore
@Login 
Scenario Outline: Logging in with Invalid data 
<<<<<<< HEAD
	Given I Navigate to the homepage on "browser" 
	When  I click on Login Button 
	When  I enter Username as "<username>" 
	And  I enter Password as "<password>" 
	And  I click on SignIn button 
	Then I should see Login errorMesssage Pop-up box 
	Examples: 
=======
Given I Navigate to the homepage on "browser"
When I click on Login Button 
When  I enter Username as "<username>" 
And  I enter Password as "<password>" 
And  I click on SignIn button 
Then I should see Login errorMesssage Pop-up box 
Examples: 
>>>>>>> d219a815b3476f006fd5cfeba5123e9c66426e03
		|username         | password   |
		|mmm12	          |MNNH$1      |
		|Noblebugq11	  |Bola123       |
		
<<<<<<< HEAD
=======

#@ignore
@Login 	
Scenario: Close the Login Pop-up box
Given I Navigate to the homepage on "browser"
When I click on Login Button 
 And I click on the Login Pop-up close icon
 Then Login Pop-up box should be closed
>>>>>>> d219a815b3476f006fd5cfeba5123e9c66426e03
		
		
#@ignore
@Login 
Scenario: Close the Login Pop-up box 
Given I Navigate to the homepage on "browser" 
When I click on Login Button 
 And I click on the Login Pop-up close icon 
Then Login Pop-up box should be closed 
				
			
#@ignore
@Login 
Scenario Outline: Login 
Given I Navigate to the homepage on "browser" 
When I click on Login Button 
And  I enter Username as "<username>" 
And  I enter Password as "<password>" 
And  I click on SignIn button 
Then  I should see username as "<username>" present 
And  I should see AccountBlance present 
And  I should see Depositbutton present 
			
Examples: 
	|	username	| password     |
	| NOBLEBUG228	|Bola123$%^    |
