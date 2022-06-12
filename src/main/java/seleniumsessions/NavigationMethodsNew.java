package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethodsNew {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		driver.get("https://entrata.com");
//		driver.get("https://twitter.com");

		driver.navigate().to("https://entrata.com");
		driver.navigate().to("https://twitter.com");

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
