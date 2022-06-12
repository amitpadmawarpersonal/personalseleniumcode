package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserFinal {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions c = new ChromeOptions();
		//c.setHeadless(true);
		//c.addArguments("--headless");
		c.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(c);
		driver.navigate().to("https://xento.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
