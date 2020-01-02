$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyBackgroundFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Google search with background",
  "description": "",
  "id": "google-search-with-background",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7420382992,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I choose configurations from config file",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I open Google page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I verify page title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I verify page url",
  "keyword": "And "
});
formatter.match({
  "location": "GooglePageSteps.i_choose_configurations_from_config_file()"
});
formatter.result({
  "duration": 304308317,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_open_Google_page()"
});
formatter.result({
  "duration": 958269113,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_verify_page_title()"
});
formatter.result({
  "duration": 608482993,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_verify_page_url()"
});
formatter.result({
  "duration": 425514989,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Google search for Selenium",
  "description": "",
  "id": "google-search-with-background;google-search-for-selenium",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@RunBackground"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I enter \"Selenium\" in the search field",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click search button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify whether search results should are displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium",
      "offset": 9
    }
  ],
  "location": "GooglePageSteps.i_enter_in_the_search_field(String)"
});
formatter.result({
  "duration": 124536793,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_click_search_button()"
});
formatter.result({
  "duration": 1849198130,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.I_verify_whether_search_results_should_are_displayed()"
});
formatter.result({
  "duration": 75666809,
  "status": "passed"
});
formatter.after({
  "duration": 579536611,
  "status": "passed"
});
formatter.before({
  "duration": 4865105065,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I choose configurations from config file",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I open Google page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I verify page title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I verify page url",
  "keyword": "And "
});
formatter.match({
  "location": "GooglePageSteps.i_choose_configurations_from_config_file()"
});
formatter.result({
  "duration": 310656,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_open_Google_page()"
});
formatter.result({
  "duration": 736693356,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_verify_page_title()"
});
formatter.result({
  "duration": 494472190,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_verify_page_url()"
});
formatter.result({
  "duration": 410772046,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Google search for Computer",
  "description": "",
  "id": "google-search-with-background;google-search-for-computer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@RunBackground"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I enter \"Computer\" in the search field",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click search button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify whether search results should are displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Computer",
      "offset": 9
    }
  ],
  "location": "GooglePageSteps.i_enter_in_the_search_field(String)"
});
formatter.result({
  "duration": 123432394,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_click_search_button()"
});
formatter.result({
  "duration": 1925324047,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.I_verify_whether_search_results_should_are_displayed()"
});
formatter.result({
  "duration": 45726398,
  "status": "passed"
});
formatter.after({
  "duration": 552008458,
  "status": "passed"
});
});