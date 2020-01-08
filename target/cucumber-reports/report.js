$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyTest.feature");
formatter.feature({
  "line": 1,
  "name": "My feature tests are described here",
  "description": "",
  "id": "my-feature-tests-are-described-here",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4004235993,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Google search for keyword",
  "description": "",
  "id": "my-feature-tests-are-described-here;google-search-for-keyword",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@RunThis"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I choose configurations from config file",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I open Google page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify page title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I verify page url",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter value in the search field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click search button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify whether search results should are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GooglePageSteps.i_choose_configurations_from_config_file()"
});
formatter.result({
  "duration": 179627882,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_open_Google_page()"
});
formatter.result({
  "duration": 3514122150,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_verify_page_title()"
});
formatter.result({
  "duration": 388576959,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_verify_page_url()"
});
formatter.result({
  "duration": 339092045,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_enter_value_in_the_search_field()"
});
formatter.result({
  "duration": 98511426,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.i_click_search_button()"
});
formatter.result({
  "duration": 2924733818,
  "status": "passed"
});
formatter.match({
  "location": "GooglePageSteps.I_verify_whether_search_results_should_are_displayed()"
});
formatter.result({
  "duration": 66756466,
  "status": "passed"
});
formatter.after({
  "duration": 706838838,
  "status": "passed"
});
});