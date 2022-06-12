package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_08_DropDown_SelectClass_Utils.mp4

public class SelectDropDownHandleWithGenericMethods {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.id("Form_submitForm_Country"); // By locator for country dropdown
		By state = By.id("Form_submitForm_State"); // By locator for state dropdown
		// doSelectDropDownByIndex(country, 17); // call the generic method created
		// below
		// doSelectDropDownByIndex(state, 4);
		driver.manage().window().maximize();
		doSelectDropDownByValue(country, "India");
		Thread.sleep(3000);
		doSelectDropDownByValue(state, "Maharashtra");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
