package org.stepdefinition;

import org.reusable.UtilityClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class HooksClass extends UtilityClass{

	@Before
	public void preCondition() {

		launchBrowser("Chrome");
		launchUrl();
	}
	
	@After
	private void postCondition(Scenario s) {

		closeBrowser();
	}
	
}
