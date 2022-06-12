package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeConcept {

//Selenium_06_TotalLinks_Images_GetAttribute_FindElements_UseCases.mp4

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().logs();

//		String place = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(place);
//
//		driver.findElement(By.id("input-firstname")).sendKeys("Amit");
//		String value = driver.findElement(By.id("input-firstname")).getAttribute("value");
//		System.out.println(value);

		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		System.out.println(doGetAttributeValue(firstname, "placeholder"));
		
		doSendKeys(lastname, "Padmawar");
		System.out.println(doGetAttributeValue(lastname, "value"));
		
		if(doIsDisplayed(firstname)) {
			System.out.println("true");
		}
		
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static String doGetAttributeValue(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
