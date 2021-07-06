$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/facebook.feature");
formatter.feature({
  "name": "Validating home page of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating username and password with valid and Invalid Combination",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Facebook Page #url --\u003ePredefined",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.user_is_on_Facebook_Page_url_Predefined()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to enter Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_need_to_enter_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to click Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.user_need_to_click_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to validate",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_need_to_validate()"
});
formatter.result({
  "status": "passed"
});
});