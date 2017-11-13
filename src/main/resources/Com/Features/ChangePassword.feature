Feature: User Should be able to Change their Password After They have logged-in
         They cant not Use Old Password as a New Password
         


#@ignore       
@ChangePassword  
Scenario: Verifying Elements on Change Password page on Casino 
Given I Navigate to the homepage on "browser" 
When  I have logged in username as "superch1" and password "Bola123$%^"
When  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Change Password link within My Account DropDown SubMenu 
Then  I should see old password text box
  And I should see new password text box
  And I should confrim password text box
  And I should see Change password as Title Page



@ignore       
 @ChangePassword  
Scenario Outline:Changing password with Invalid data criterias 
Given I Navigate to the homepage on "browser" 
When  I have logged in username as "superch1" and password "Bola123$%^"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Change Password link within My Account DropDown SubMenu 
 And  I Enter Old Password as "<oldpassword>"
 And  I Enter New Password as "<newpassword>"
 And  I Enter Confirmed Password  as "<confirmPassword>"
 And  I click Submit button
Then  I should see Error Message displayed

Examples:
		| oldpassword         | newpassword     		| confirmPassword 			|
		|  	bola123			  |	bola123		  			|	bola123					|
		|  Bola1234$%^   	  |	ADSERTYG	   			|	ADSERTYG				|
		|  Bola1234$%^		  |	£$%^$$$$$				|	£$%^$$$$$				|
		|  Bola1234$%^  	  |	GGGGGGGGGGGGGGGGGGGG1122|GGGGGGGGGGGGGGGGGGGG1122	|
		|  Bola12$%^ 		  |	Bola1234$%^				|	Bola1234$%^				|
		|  Bola1234$%^		  |	12345678				|	12345678				|
		|  Bola1234$%^		  |	Manjuyat			 	|	Manjuyat				|
		|  Bola1234$%^		  |	$$$$$%%1a				|  $$$$$%%1a				|
		|  Bola1234$%^		  |	Bola1217				|	Bola1217				|
		|  Bola1234$%^		  |	Looking/>1				|Looking/>1					|
		|  Bola1234$%^ 		  |	Bola1$(				    |	Bola1$(    				|
    
     
@ignore
 @ChangePassword  
Scenario Outline:Changing password with valid data criterias 
Given I Navigate to the homepage on "browser" 
When  I have logged in username as "superch1" and password "Bola123$%^"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Change Password link within My Account DropDown SubMenu 
 And  I Enter Old Password as "<oldpassword>"
 And  I Enter New Password as "<newpassword>"
 And  I Enter Confirmed Password  as "<confirmPassword>"
 And  I click Submit button
Then  My Password Should be Successfuly Change
Examples:
		| oldpassword	     | newpassword   			| confirmPassword 			 |
		|  Bola12345$%^ 	 |Bola1234$%^				| 	Bola1234$%^				 |
			     
     
   
#@ignore       
 @ChangePassword  
Scenario: Verifying Elements on Change Password page on Vegas
Given I Navigate to the homepage on "browser" 
When  I have logged in username as "superCH2" and password "Bola123$%^"
 And  I click on Vegas Vertical Tab 
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Change Password link within My Account DropDown SubMenu   
Then  I should see old password text box
  And I should see new password text box
  And I should confrim password text box
  And I should see Change password as Title Page
   
   
     
     
@ignore       
@ChangePassword  
Scenario Outline:Changing password with Invalid data criterias on Vegas Vetical
Given I Navigate to the homepage on "browser" 
When  I have logged in username as "superch2" and password "Bola123$%^"
 And  I click on Vegas Vertical Tab 
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Change Password link within My Account DropDown SubMenu 
 And  I Enter Old Password as "<oldpassword>"
 And  I Enter New Password as "<newpassword>"
 And  I Enter Confirmed Password  as "<confirmPassword>"
 And  I click Submit button
Then  I should see Error Message displayed
Examples:
		| oldpassword         | newpassword     		| confirmPassword  			|
		|  	bola123			  |	bola123		  			|	bola123					|
		|  Bola123$%^   	  |	ADSERTYG	   			|	ADSERTYG				|
		|  Bola123$%^		  |	£$%^$$$$$				|	£$%^$$$$$				|
		|  Bola123$%^  		  |	GGGGGGGGGGGGGGGGGGGG1122|GGGGGGGGGGGGGGGGGGGG1122	|
		|  Bola12$%^ 		  |	Bola1234$%^				|	Bola1234$%^				|
		|  Bola123$%^		  |	12345678				|	12345678				|
		|  Bola123$%^		  |	Manjuyat			 	|	Manjuyat				|
		|  Bola123$%^		  |	$$$$$%%1a				|  $$$$$%%1a				|
		|  Bola123$%^		  |	Bola1217				|	Bola1217				|
		|  Bola123$%^		  |	Looking/>1				|Looking/>1					|
		|  Bola123$%^		  |	Bola1$(		   			|	Bola1$(					|
     
     
@ignore
 @ChangePassword  
Scenario Outline:Changing password with valid data criterias on Vegas Vertical
Given I Navigate to the homepage on "browser" 
When  I have logged in username as "superch2" and password "Bola123$%^"
 And  I click on Vegas Vertical Tab 
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Change Password link within My Account DropDown SubMenu 
 And  I Enter Old Password as "<oldpassword>"
 And  I Enter New Password as "<newpassword>"
 And  I Enter Confirmed Password  as "<confirmPassword>"
 And  I click Submit button
Then  My Password Should be Successfuly Change
Examples:
		| oldpassword	     | newpassword   			| confirmPassword 			 |
		|  Bola123$%^    	 |k1N4HX"9SG9%y7TxRx4f		| 	k1N4HX"9SG9%y7TxRx4f	 |
			     
     
   
   
   
   
@ignore       
 @ChangePassword  
Scenario: Changing password with Invalid data criterias on Live Vetical
Given I Navigate to the homepage on "browser" 
When  I have logged in username as "superch3" and password "Bola123$%^"
 When I click on Live Vertical Tab 
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Change Password link within My Account DropDown SubMenu 
Then  I should see old password text box
  And I should see new password text box
  And I should confrim password text box
  And I should see Change password as Title Page
   
 
 
 @ignore       
 @ChangePassword  
Scenario Outline:Changing password with Invalid data criterias on Live Vetical
Given I Navigate to the homepage on "browser" 
When  I have logged in username as "superch3" and password "Bola123$%^"
When I click on Live Vertical Tab  
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Change Password link within My Account DropDown SubMenu 
 And  I Enter Old Password as "<oldpassword>"
 And  I Enter New Password as "<newpassword>"
 And  I Enter Confirmed Password as "<confirmPassword>"
 And  I click Submit button
Then  I should see Error Message displayed
Examples:
		| oldpassword         | newpassword     		| confirmPassword  			|
		|  	bola123			  |	bola123		  			|	bola123					|
		|  Bola123$%^   	  |	ADSERTYG	   			|	ADSERTYG				|
		|  Bola123$%^		  |	£$%^$$$$$				|	£$%^$$$$$				|
		|  Bola123$%^  		  |	GGGGGGGGGGGGGGGGGGGG1122|GGGGGGGGGGGGGGGGGGGG1122	|
		|  Bola12$%^ 		  |	Bola1234$%^				|	Bola1234$%^				|
		|  Bola123$%^		  |	12345678				|	12345678				|
		|  Bola123$%^		  |	Manjuyat			 	|	Manjuyat				|
		|  Bola123$%^		  |	$$$$$%%1a				|  $$$$$%%1a				|
		|  Bola123$%^		  |	Bola1217				|	Bola1217				|
		|  Bola123$%^		  |	Looking/>1				|Looking/>1					|
		|  Bola123$%^		  |	Bola1$()				|	Bola1$()				|
     
 
@ignore
 @ChangePassword  
Scenario Outline:Changing password with valid data criterias on Live Vertical
Given I Navigate to the homepage on "browser" 
When  I have logged in username as "superch3" and password "Bola123$%^"
When I click on Live Vertical Tab 
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Change Password link within My Account DropDown SubMenu 
 And  I Enter Old Password as "<oldpassword>"
 And  I Enter New Password as "<newpassword>"
 And  I Enter Confirmed Password as "<confirmPassword>"
 And  I click Submit button
Then  My Password Should be Successfuly Change

Examples:
		| oldpassword	     | newpassword   			| confirmPassword 			 |
		|  Bola123$%^    	 |k1N4HX"9SG9%y7TxRx4f		| 	k1N4HX"9SG9%y7TxRx4f	 |
			     
     
 
          
     