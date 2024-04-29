$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featureFile/Amazon.feature");
formatter.feature({
  "name": "validate amazon functionality feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AmazonFeature"
    }
  ]
});
formatter.scenario({
  "name": "amazon functionality scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AmazonFeature"
    }
  ]
});
formatter.step({
  "name": "user is on amazon home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonStepDef.user_is_on_amazon_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on best sellers option",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonStepDef.user_click_on_best_sellers_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select baby products option which is available in left side",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepDef.user_select_baby_products_option_which_is_available_in_left_side()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should navicated to baby products page",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonStepDef.it_should_navicated_to_baby_products_page()"
});
formatter.result({
  "status": "passed"
});
});