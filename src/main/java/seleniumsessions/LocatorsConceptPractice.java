package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConceptPractice {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/");

		// 4. With generic getElement() method
//		By username = By.id("input-username");
//		By password = By.id("input-password");
//		
//		getElement(username).sendKeys("amit@test.lcl");
//		getElement(password).sendKeys("test@123");

		// 5. with generic getlement + do doSendKeys() methods
		By username = By.id("input-username");
		By password = By.id("input-password");

		doSendKeys(username, "amit@test.lcl");
		doSendKeys(password, "test@123");

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

}
