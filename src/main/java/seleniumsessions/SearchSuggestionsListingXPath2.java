package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSuggestionsListingXPath2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("pants");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//ul[@class='rilrtl-list ']//a[@class='search-suggestionList  ']//span[contains(text(),'pants for girls')]"))
				.click();

	}

}
