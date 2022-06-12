package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {

	//Selenium_07_GoogleSearch_FooterList_ECommSearch_CustomUtils.mp4

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		List<WebElement> footer = driver.findElements(By.xpath("//footer//div[@class='ftr-items']/a"));
		System.out.println(footer.size());

//		for (int i = 0; i < footer.size(); i++) {
//			String text = footer.get(i).getText();
//			System.out.println(text);

		for (WebElement e : footer) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("Fees & Payments")) {
				e.click();
				break;
			}
		}

//		driver.findElement(By.xpath("//footer//div[@class='ftr-items']/a[contains(text(),'Fees & Payments')]")).click();

	}

}