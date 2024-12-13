package org.reusable;

import java.awt.Robot;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityClass {

	public static WebDriver driver;
	public static Robot r;

	public static void launchBrowser(String browserName) {

		switch (browserName) {
		case "Chrome":

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "Edge":

			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;

		case "Firefox":

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		}
	}

	public static void launchUrl() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	public static void implitWait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public static void passDataToTextBox(WebElement element, String testData) {

		element.sendKeys(testData);
	}

	public static void clickWebElement(WebElement element) {

		element.click();
	}

	public static void closeBrowser() {

		driver.close();
	}
}
