Feature: User Should be able to navigate to the HomePage 
	in other to launch Roulette Game, Slots Games and Table Game.
         

#@ignore
@Homepage 
Scenario: Navigating to the Home Page 
	Given I Navigate to the homepage on "browser" 
	Then I should see Login Button 
	And I should see Supercasino Logo 
	And I should see SideBar Menu Icon 
	And I should see Casino Vertical Tab 
	And I should see Vegas Vertical Tab 
	And I should see Live Vertical Tab 
	And I should see Promos Vertical Tab 
	And I should see Hero Banner 
	And I should see Games Category Tab 
	
#@ignore
@LaunchGame 
Scenario Outline:Clicking on a Game to check if Game Pop-up box is displayed
	Given  I have loggedin on the BasePage 
	When I click on "<GameType>" 
	Then I should see a Game Pop-upbox 
	And I should see Game Image in pop-up box 
	And I should see the Name of the Game 
	And I should see Play button within the Pop-up box 
	And I should see Demo button within the Pop-up box 
	And I should see MoreInfo link on the Game Pop-up box
	And I should see Close icon on the Game Pop-up box
	
	Examples: 
		|GameType				 |
		|Roulette Express Premium| 

	
#@ignore		
@LaunchGame 
Scenario Outline: Launching Netplaytv Roulette Game 
	Given I have loggedin on the BasePage 
	When I click on "<GameType>" 
	And I click on Play button
	Then I should see a Play for Cash game Launching 
	
	Examples: 
		|GameType				 |
		|Roulette Express Premium| 
		
#@ignore			
@LaunchGame 
Scenario Outline: Launching Netplaytv Roulette Demo Game 
	Given  I have loggedin on the BasePage 
	When I click on "<GameType>" 
	And I click on Demo button
	Then I should see a Demo Game Launching 
	
	Examples: 
		|GameType				 |
		|Roulette Express Premium| 
		
#@ignore			
@LaunchGame 		
Scenario: Launching Casino Slots Game
	Given I have loggedin on the BasePage 
	When  I click Games Category Slots tab
	 And  I click on a Slots Game
	 #And  I click on Play button
    #Then I should see a Slots game launching
     
@ignore	
@LaunchGame 
Scenario Outline:Checking if Game Pop-up box will close by clickin on close icon on it.
 Given I have loggedin on the BasePage 
	When I click on "<GameType>" 
	And I click on Close icon on the game Pop-up box
	Then I should see Game Pop-up box closed
	
	Examples: 
		|GameType				 |
		|Roulette Express Premium| 	
	
	

#@ignore		
@LaunchGame 		
Scenario: Launching Casino Table Game
	Given I have loggedin on the BasePage 
	When  I click Games Category Table Games tab
	 And  I click on a Table Game
	# And  I click on Play button
     #Then I should see a Table Game launching
     
#@ignore	    
@LaunchGame 		
Scenario: Launching Vegas Slots Game
	Given I have loggedin on the BasePage 
	When I click on Vegas Vertical Tab
	And  I click on a Slots Game
    And  I click on Play button
    Then I should see a Vegas Slots Game launching
    
#@ignore	  
@LaunchGame 		
Scenario: Launching Live Game on Live Vertical
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab
	And  I click on a Live Game
	And  I click on Play button
	Then I should see a Play for Cash game Launching 
