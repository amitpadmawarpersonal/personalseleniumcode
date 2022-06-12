package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSuggestions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("boat");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//div[@class='autocomplete-results-container']//div[@aria-label='boat seats']/span[contains(text(),'in Sports & Fitness')]"))
				.click();

	}

}
