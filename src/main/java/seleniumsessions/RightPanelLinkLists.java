package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightPanelLinkLists {
	static WebDriver driver;

	//Selenium_07_GoogleSearch_FooterList_ECommSearch_CustomUtils.mp4

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By siderBar = By.xpath("//aside[@id='column-right']/div/a");
		clickOnSideBarLinks(siderBar, "Forgotten Password");

	}

	public static void clickOnSideBarLinks(By locator, String value) {
		List<WebElement> sideBarLinks = driver.findElements(locator);
		System.out.println(sideBarLinks.size());

		for (WebElement e : sideBarLinks) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}

		}
	}

}
