# SampleCuPom

This Framework is BDD Page Object model using Maven Repository
All Codes are inside the src/main/java

BaseTest Class is where all Properties Initialisation are and this can be located in a Package Folder called com.suite.
StepsDefinition class is where all Ghekins steps are and this is where each method on each class is called for implementation

Config Package contains two Files which are
Config.properties files and OR.properties file
Config.properties file is where all browser setting, Url and Default Username and Password are kept
OR.properties file .
Pages Package is a Package where all Page classes are kept
Util Package and inside it there is a class called Constant.
Constant Class is a class where all element identifier are kept

There is another source folder called  src/main resources
 Inside this src/main/resource there two Packages kept 
 i) com.suite which contain all feature files relating to the Website
 ii) com.suite.cashier contain all features files of the Safecharge cashier
 
lib folder is a folder that has all the chrome.exe,geckco.exe and IESever.exe drivers for windows OS
 while chrome and geckco drivers are for linux OS.
 
 pom.xml file is where all maven dependencies are kept and also the execution is called when running through command line
 
 This Framework can be run in 3 ways 
 i) Junit Suite Runner which is kept inside com.suite
 ii) Through Command line by Navigating to the project on the Command Prompt typing: mvn integration-test
 iii) You can also run this project by clicking on the run-test.bat file inside the project.
 
 
