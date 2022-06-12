package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserEdge {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();

		EdgeOptions eo = new EdgeOptions();
		eo.setHeadless(false);
		eo.addArguments("--incognito");
		WebDriver driver = new EdgeDriver(eo);
		driver.get("https://twitter.com");
		System.out.println(driver.getTitle());

	}

}
