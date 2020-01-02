Feature: My feature tests are described here

@RunThis
  Scenario: Google search for keyword
    Given I choose configurations from config file
    When I open Google page
    Then I verify page title
    And I verify page url
    When I enter value in the search field
    And I click search button
    Then I verify whether search results should are displayed
    
    
  #@RunThat
  #Scenario: Google search for keyword
   # Given I choose configurations from config file
   # When I open Google page
   # Then I verify page title
   # And I verify page url
   # When I enter "Selenium" in the search field
   # And I click search button
   # Then I verify whether search results should are displayed
    
  #@RunOutline
  #Scenario Outline: Multiple google search
   # Given I choose configurations from config file
    #When I open Google page
    #Then I verify page title
    #And I verify page url
    #When I enter "<SearchValue>" in the search field
    #And I click search button
    #Then I verify whether search results should are displayed

    #Examples:
    	#|SearchValue|
    #	|Computer		|
    	#|Selenium		|
    	#|Microsoft	|