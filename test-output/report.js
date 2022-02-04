$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_workspace/FreeAmazonBddFreamwork/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon login feature with credentials",
  "description": "",
  "id": "amazon-login-feature-with-credentials",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Amazon login scenario",
  "description": "",
  "id": "amazon-login-feature-with-credentials;amazon-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is amazon signIn",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters emailId",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_login_Page()"
});
formatter.result({
  "duration": 2637709700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_amazon_signIn()"
});
formatter.result({
  "duration": 6918100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_emailId()"
});
formatter.result({
  "duration": 137814400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_continue_button()"
});
formatter.result({
  "duration": 381482600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_password()"
});
formatter.result({
  "duration": 56490000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 78485100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 667136700,
  "status": "passed"
});
});