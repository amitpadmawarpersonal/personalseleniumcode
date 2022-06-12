package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.edgedriver().setup();
		WebDriver driver = new HtmlUnitDriver();

//		ChromeOptions co = new ChromeOptions();
//		//co.setHeadless(true);
//		co.addArguments("--headless");

		// WebDriver driver = new ChromeDriver();
		driver.get("https://www.entrata.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
