package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_08_DropDown_SelectClass_Utils.mp4

public class SelectDropdownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// dropdown with <select> html tag

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.id("Form_submitForm_Country"); // By locator for country dropdown
		By state = By.id("Form_submitForm_State"); // By locator for state dropdown

		WebElement country_ele = driver.findElement(country); // WebElement to pass to Select object of country dropdown
		WebElement state_ele = driver.findElement(state); // WebElement to pass to Select object of state dropdown
		Select select = new Select(country_ele); // Need to pass WebElement, not the locator
		Select select1 = new Select(state_ele);
//		select.selectByIndex(10); //1. value selection by index
//		select.selectByValue("Australia"); //2. value selection by value attribute
		select.selectByVisibleText("India"); //3. value selection by text
		Thread.sleep(3000);
		select1.selectByValue("Goa"); // for selecting value in second state dropdown
		

	}

}
