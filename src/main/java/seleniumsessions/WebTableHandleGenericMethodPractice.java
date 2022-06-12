package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium_12_CustomXapth_1_WebTableHandle.mp4

public class WebTableHandleGenericMethodPractice {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		// Just call the method created below and pass the username from web table to
		// select tehe respective checkbox
		selectUser("Joe.Root");

	}

	public static void selectUser(String name) {
		WebElement checkbox = driver
				.findElement(By.xpath("//a[text()='" + name + "']/parent::td/preceding-sibling::td/input"));
		checkbox.click();
	}

}