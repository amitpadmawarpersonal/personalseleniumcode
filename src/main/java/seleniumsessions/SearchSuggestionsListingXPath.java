package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Based on Selenium_07_GoogleSearch_FooterList_ECommSearch_CustomUtils.mp4
// 12th April 2022
// https://app.box.com/file/944770470949
public class SearchSuggestionsListingXPath {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("shirt");
		Thread.sleep(4000);
		List<WebElement> ListEle = driver.findElements(By.xpath("//ul[@class='rilrtl-list ']/li"));
		System.out.println(ListEle.size());

		for (WebElement e : ListEle) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("Shirt Kurtas For Men")) {
				e.click();
				break;

			}

		}

	}

}
