package org.pojo.classes;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.UtilityClass;

public class OrangeHrmLoginPOJO extends UtilityClass{
	
	public OrangeHrmLoginPOJO() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement login;

	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashBoard;
	
	@FindBy(xpath="//p[text()='Invalid credentials']")
	private WebElement invalidCredential;
	
	@FindBy(xpath="//span[text()='Required']")
	private List<WebElement> required;
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getDashBoard() {
		return dashBoard;
	}

	public WebElement getInvalidCredential() {
		return invalidCredential;
	}

	public List<WebElement> getRequired() {
		return required;
	}
	
	
	
	
}
