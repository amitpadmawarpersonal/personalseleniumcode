package seleniumsessionspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSuggestions2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("roger federer");
		Thread.sleep(3000);

		List<WebElement> ListEle = driver
				.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']/span"));
		System.out.println(ListEle.size());

//		for (WebElement e : ListEle) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.contains("roger federer news")) {
//				e.click();
//				break;
//			}
//		}

		for (int i = 0; i < ListEle.size(); i++) {
			String text = ListEle.get(i).getText();
			System.out.println(text);
		}

	}

}
