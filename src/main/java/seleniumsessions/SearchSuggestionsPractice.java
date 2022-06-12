package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_07_GoogleSearch_FooterList_ECommSearch_CustomUtils.mp4
public class SearchSuggestionsPractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium with java");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(list.size());

//		for (int i = 0; i < list.size(); i++) {
//			String text = list.get(i).getText();

		for (WebElement t : list) {
			String text = t.getText();
			System.out.println(text);
				if (text.contentEquals("selenium with java full course")) {
					t.click();
					break;
			}
		}
	}

}
