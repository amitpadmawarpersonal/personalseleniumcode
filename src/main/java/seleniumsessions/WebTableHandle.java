package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_12_CustomXapth_1_WebTableHandle.mp4

public class WebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		// xpath axes:
		// Select the checkbox from web table
		// a[text()='Joe.Root']//parent::td/preceding-sibling::td/input

		WebElement checkbox = driver
				.findElement(By.xpath("//a[text()='Joe.Root']//parent::td/preceding-sibling::td/input"));
		checkbox.click();

	
	}

}
