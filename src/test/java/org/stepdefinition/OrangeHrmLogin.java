package org.stepdefinition;

import org.junit.Assert;
import org.pojo.classes.OrangeHrmLoginPOJO;
import org.reusable.UtilityClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHrmLogin extends UtilityClass{
	
	OrangeHrmLoginPOJO o ;
	
	@When("I enter valid username {string}")
	public void i_enter_valid_username(String userName) {
	
		implitWait();
		o = new OrangeHrmLoginPOJO();
		passDataToTextBox(o.getUserName(), userName);
	}

	@When("I enter valid password {string}")
	public void i_enter_valid_password(String pass) {
	    
		passDataToTextBox(o.getPassword(), pass);
	}

	@When("I click on the Login button")
	public void i_click_on_the_Login_button() {
	    
		clickWebElement(o.getLogin());
	}

	@Then("I should be redirected to the dashboard")
	public void i_should_be_redirected_to_the_dashboard() {
	    
		Assert.assertEquals("Wrong Credential", true, o.getDashBoard().getText().equals("Dashboard"));
	}

	@When("I enter invalid username {string}")
	public void i_enter_invalid_username(String wrongUser) {
	    
		implitWait();
		o = new OrangeHrmLoginPOJO();
		passDataToTextBox(o.getUserName(), wrongUser);

	}

	@When("I enter invalid password {string}")
	public void i_enter_invalid_password(String wrongPass) {
	    
		passDataToTextBox(o.getPassword(), wrongPass);
	}
	
	@Then("I should see an invalid credential error message {string}")
	public void i_should_see_an_invalid_credential_error_message(String errorMessage) {
	    
		Assert.assertEquals("Check your credential", errorMessage, o.getInvalidCredential().getText());
	}

	@When("I leave the username and password blank")
	public void i_leave_the_username_and_password_blank() {
	   
		implitWait();
		o = new OrangeHrmLoginPOJO();
		passDataToTextBox(o.getUserName(), "");
		passDataToTextBox(o.getPassword(), "");
	}
	
	@Then("I should see an error message {string}")
	public void i_should_see_an_error_message(String errorMessage) {
	   
		Assert.assertEquals("Check your credential", errorMessage, o.getRequired().get(0).getText());

	}


}
