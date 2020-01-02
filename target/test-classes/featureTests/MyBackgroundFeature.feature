Feature: Google search with background

Background:
Given I choose configurations from config file
    When I open Google page
    Then I verify page title
    And I verify page url
    
    
@RunBackground
  Scenario: Google search for Selenium
    When I enter "Selenium" in the search field
    And I click search button
    Then I verify whether search results should are displayed
    
    
  @RunBackground
  Scenario: Google search for Computer
    When I enter "Computer" in the search field
    And I click search button
    Then I verify whether search results should are displayed
  