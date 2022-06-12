package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium_15_MultiMenuHandling_SVGElement_ShadowDomElement
public class BigBasketWithGenericMethodPractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();

		doProductSearchFourLevelMenu("Snacks & Branded Foods", "Frozen Veggies & Snacks", "Frozen Veg Snacks",
				"Green Peas");

	}

	public static void doProductSearchFourLevelMenu(String l1, String l2, String l3, String l4)
			throws InterruptedException {
		WebElement mainMenu = driver.findElement(By.cssSelector("a.meganav-shop"));
		Thread.sleep(1500);
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(1500);
		actions.moveToElement(driver.findElement(By.linkText(l1))).perform();
		Thread.sleep(1500);
		actions.moveToElement(driver.findElement(By.linkText(l2))).perform();
		Thread.sleep(1500);
		actions.moveToElement(driver.findElement(By.linkText(l3))).perform();
		Thread.sleep(1500);
		actions.moveToElement(driver.findElement(By.linkText(l4))).click().build().perform();

	}
}
