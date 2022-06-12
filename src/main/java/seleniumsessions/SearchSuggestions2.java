package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSuggestions2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("VisualSearchInput")).sendKeys("jordan");
		driver.findElement(By.xpath("//ul[@id='VisualSearchSuggestionsList']//a[@id='VisualSearchSuggestion-1']"))
				.click();

	}

}
