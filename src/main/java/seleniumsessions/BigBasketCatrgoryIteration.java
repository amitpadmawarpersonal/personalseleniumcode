package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_15_MultiMenuHandling_SVGElement_ShadowDomElement.mp4

public class BigBasketCatrgoryIteration {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();

		WebElement mainMenu = driver.findElement(By.cssSelector("a.meganav-shop"));

		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(1500);

		List<WebElement> levelOneEle = driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
		// System.out.println(levelOneEle.size());

		for (WebElement e1 : levelOneEle) {
			actions.moveToElement(e1).perform();
			System.out.println(e1.getText());

			List<WebElement> levelTwoEle = driver
					.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[last()]//a"));
			// System.out.println(levelTwoEle.size());
			for (WebElement e2 : levelTwoEle) {
				actions.moveToElement(e2).perform();

				System.out.println(e2.getText());

				List<WebElement> levelThreeEle = driver
						.findElements(By.xpath("(//ul[@class='list-unstyled'])[last()-1]//a"));
				// System.out.println(levelThreeEle.size());
				for (WebElement e3 : levelThreeEle) {
					actions.moveToElement(e3).perform();

					System.out.println(e3.getText());

				}

			}

		}

	}

}
