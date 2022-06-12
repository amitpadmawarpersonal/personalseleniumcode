package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSuggestions1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("shirt");
		driver.findElement(By.id("q")).sendKeys("shirt");
		Thread.sleep(4000);
		List<WebElement> ListEle = driver.findElements(By.xpath("//ul[@class='rilrtl-list ']/li"));
		System.out.println(ListEle.size());

		for (WebElement e : ListEle) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}
