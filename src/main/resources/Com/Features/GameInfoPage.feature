Feature: User should be able to Navigate to Game info page of any game on the site
#@ignore
@gameInfo
Scenario: Unauthenticated user Navigating to Roulette Game  game Info page 
 Given I Navigate to the homepage on "browser" 
When I click on Roulette Express Premium Game 
 And I click on More info link
Then I should see the Name of the game as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should Game Air Status
 And I should see Play for Real Button on Game Info page
 And I should see Roulette Express Banner display Game Info Page
 And I should see Jackpot slider on the Game Info Page
 #And I should see Winners Slider Game Info Page
 And I should see AppStore logo on Game Info
 And I should see Android Logo on Game Info Page
 
#@ignore
@gameInfo
Scenario: Unauthenticated user Navigating to Roulette Game  game Info page and Click onPlay For Real
 Given I Navigate to the homepage on "browser" 
When I click on Roulette Express Premium Game
And I click on More info link
And I click on Play For Real on Game Info Page
Then I should see a Login Pop-up box displayed on Game Info Page

#@ignore
@gameInfo
Scenario: Authenticated user Navigating to Roulette Game  game Info page 
Given I have loggedin on the BasePage
When I click on Roulette Express Premium Game
 And I click on More info link
Then I should see the Name of the game as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should Game Air Status
 #And I should see Play For Fun Button on Roulette Express Premium Game Info page
 And I should see Play for Real Button on Game Info page
 And I should see Roulette Express Banner display Game Info Page
 And I should see Jackpot slider on the Game Info Page
 #And I should see Winners Slider Game Info Page
 And I should see AppStore logo on Game Info
 And I should see Android Logo on Game Info Page
 

#@ignore
@gameInfo
Scenario: Authenticated user launching  Roulette Game from  game Info page 
Given I have loggedin on the BasePage
When I click on Roulette Express Premium Game
 And I click on More info link
And I click on Play For Real on Game Info Page
Then I should see a Play for Cash game Launching

#@ignore
#@gameInfo
#Scenario: Authenticated user launching  Roulette Game from  game Info page 
#Given I have loggedin on the BasePage
#When I click on Roulette Express Premium Game
#And I click on More info link
#And I click on Play For Fun on Game Info Page
#Then I should see a Demo Game Launching 

#@ignore
@gameInfo
Scenario: Unauthenticated user Navigating to Platech Game  game Info page 
 Given I Navigate to the homepage on "browser" 
When I click on Playtech casino slot Game 
 And I click on More info link
Then I should see the Name of the game as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should see Play for Real Button on Game Info page
 And I should see Roulette Express Banner display Game Info Page
 And I should see Jackpot slider on the Game Info Page
 #And I should see Winners Slider Game Info Page
 And I should see AppStore logo on Game Info
 And I should see Android Logo on Game Info Page
 
 
#@ignore
@gameInfo
 Scenario: Unauthenticated user Navigating to Playtech Casino Slot game Info page and Click on Play For Real
 Given I Navigate to the homepage on "browser" 
When I click on Playtech casino slot Game
 And I click on More info link
And I click on Play For Real on Game Info Page
Then I should see a Login Pop-up box displayed on this Playtech game GameInfo page
 
#@ignore
#@gameInfo
#Scenario: Unauthenticated user Navigating to Playtech Casino Slot game Info page and Click on Play For Fun
# Given I Navigate to the homepage on "browser" 
#When I click on Playtech casino slot Game
#And I click on More info link
#And I click on Play For Fun on Game Info Page
#Then I should see a Slots game launching

#@ignore
@gameInfo
Scenario: Authenticated user navigating to Playtech Casino Slot game Info page
Given I have loggedin on the BasePage
When I click on Playtech casino slot Game
And I click on More info link
Then I should see the Name of the game as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should see Play for Real Button on Game Info page
 And I should see Roulette Express Banner display Game Info Page
 And I should see Jackpot slider on the Game Info Page
# And I should see Winners Slider Game Info Page
 And I should see AppStore logo on Game Info
 And I should see Android Logo on Game Info Page

#@ignore
@gameInfo 
Scenario: Authenticated user navigating to Playtech Casino Slot game Info page
Given I have loggedin on the BasePage
When I click on Playtech casino slot Game 
And I click on More info link
And I click on Play For Real on Game Info Page
Then I should see a Slots game launching
#@ignore
@gameInfo
Scenario: Authenticated user navigating to Playtech Casino Slot game Info page
Given I have loggedin on the BasePage
When I click on Playtech casino slot Game
 And I click on More info link
And I click on Play For Fun on Game Info Page
Then I should see a Slots game launching


#@ignore
@gameInfo
Scenario: Unauthenticated user Navigating to  Vegas Virtue Fusion Game  game Info page 
Given I Navigate to the homepage on "browser" 
When  I click on Vegas Vertical Tab
 And  I click on Playtech casino slot Game
 And I click on More info link
Then I should see the Name of the game as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should see Play for Real Button on Game Info page
 And I should see Roulette Express Banner display Game Info Page
 And I should see Jackpot slider on the Game Info Page
# And I should see Winners Slider Game Info Page
 And I should see AppStore logo on Game Info
 And I should see Android Logo on Game Info Page


#@ignore
@gameInfo
Scenario: Authenticated user navigating to Playtech VegasVirtue Fusion Slot game Info page
Given I have loggedin on the BasePage
When  I click on Vegas Vertical Tab
 And  I click on Playtech Virtue Fusion slot Game
 And  I click on More info link
Then I should see the Name of the game as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should see Play for Real Button on Game Info page
 #And I should see Play for Fun Button on Game Info Page
 And I should see Roulette Express Banner display Game Info Page
 And I should see Jackpot slider on the Game Info Page
# And I should see Winners Slider Game Info Page
 And I should see AppStore logo on Game Info
 And I should see Android Logo on Game Info Page
 
#@ignore
@gameInfo
Scenario: Authenticated user navigating to Playtech VegasVirtue Fusion Slot game Info page to launch the Game
Given I have loggedin on the BasePage
When  I click on Vegas Vertical Tab
When I click on Playtech Virtue Fusion slot Game
And  I click on More info link
And I click on Play For Real on Game Info Page
#Then I should see a Slots game launching
Then I should see a Vegas Slots Game launching
 