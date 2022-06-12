package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/");

//1. id - Creating WebElement and action on the same line, not reusable, next time for same action need to create same element again

		driver.findElement(By.id("input-username")).sendKeys("amit@test.lcl");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
//		driver.findElement(By.className("btn")).click();

//2. Create WebelEments, store them in variable and use those variables later to perform the actions
//		WebElement username = driver.findElement(By.id("input-username"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		WebElement button = driver.findElement(By.className("btn"));
//		username.sendKeys("test@test.lcl");
//		password.sendKeys("test@123");
//		button.click();
		// here we can reuse the variables created to perform actions later

//3. By locator
		// 3.1 We are maintaining the By locators without hitting server, N number of
		// Buy locators can be maintained
		// 3.2 Store the elements in variable by creating WebElements, whenever and
		// which ever required only those
		// 3.3 Use the variables to perform actions on only required WebElements using
		// the variables
//		By username = By.id("input-username");
//		By password = By.id("input-password");
//		
//		WebElement uname = driver.findElement(username);
//		WebElement pwd = driver.findElement(password);
//		
//		uname.sendKeys("amit@test.lcl");
//		pwd.sendKeys("test@123");

		// Practice 3rd approach -
//		By username = By.id("input-username");
//		By password = By.id("input-password");
//		
//		WebElement user = driver.findElement(username);
//		WebElement pwd = driver.findElement(password);
//		
//		user.sendKeys("test@test.lcl");
//		pwd.sendKeys("test@123");

		// Practice 3rd approach -
//		By username = By.id("input-username");
//		By password = By.id("input-password");
//		
//		WebElement user = driver.findElement(username);
//		WebElement pwd = driver.findElement(password);
//		
//		user.sendKeys("amit@test.lcl");
//		pwd.sendKeys("test@123");

		// 4. By locators with a generic method, just one driver.
		// find element under the generic method getElement(By locator); and use it for
		// N number of locators
//		By username = By.id("input-username");
//		By password = By.id("input-password");

//		WebElement user = getElement(username);
//		WebElement pwd = getElement(password);
//		user.sendKeys("amit@test.lcl");
//		pwd.sendKeys("test@123");

// 5. By locators Object Repository (OR) with a generic method - 
//getElement(By locator) + action method doSendKeys(By locator, String value) method also
//		By username = By.id("input-username");
//		By password = By.id("input-password");
//		
//		doSendKeys(username, "amit@test.lcl");
//		doSendKeys(password, "test@123");

//6.By locators Object Repository (OR) with a generic method in ElementUtil class
//		By username = By.id("input-username");
//		By password = By.id("input-password");
//		
//		ElementUtil eutil = new ElementUtil(driver);
//		eutil.doSendKeys(username, "amit@test.lcl");
//		eutil.doSendKeys(password, "test@123");

//7. String locator OR with generic methods in ElementUtil class		
		By username = By.id("input-username");
		By password = By.id("input-password");
	}

	public static By getBy(String locatorType, String locatorValue) {

		By locator = null;

		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			System.out.println("Please pass the correct locator type...");
		}
		return locator;
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
