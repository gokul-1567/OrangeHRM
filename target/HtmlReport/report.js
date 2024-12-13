$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/OrangeHrmLogin.feature");
formatter.feature({
  "name": "To validate Login functionality of OrangeHRM application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid username \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHrmLogin.i_enter_valid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid password \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHrmLogin.i_enter_valid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHrmLogin.i_click_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHrmLogin.i_should_be_redirected_to_the_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify Login with invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid username \"wrongUser\"",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHrmLogin.i_enter_invalid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid password \"12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHrmLogin.i_enter_invalid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHrmLogin.i_click_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see an invalid credential error message \"Invalid credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHrmLogin.i_should_see_an_invalid_credential_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify Login with blank credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I leave the username and password blank",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHrmLogin.i_leave_the_username_and_password_blank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHrmLogin.i_click_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see an error message \"Required\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHrmLogin.i_should_see_an_error_message(String)"
});
formatter.result({
  "status": "passed"
});
});