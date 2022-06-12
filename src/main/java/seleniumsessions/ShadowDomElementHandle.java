package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_15_MultiMenuHandling_SVGElement_ShadowDomElement.mp4

public class ShadowDomElementHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://mapsvg.com/maps/india");
		driver.manage().window().maximize();
		// driver.switchTo().frame(nameOrId);

	}

}
