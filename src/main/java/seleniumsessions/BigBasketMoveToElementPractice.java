package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketMoveToElementPractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		Actions actions = new Actions(driver);

		actions.moveToElement(driver.findElement(By.cssSelector("a.meganav-shop"))).perform();
		Thread.sleep(1500);
		actions.moveToElement(driver.findElement(By.linkText("Foodgrains, Oil & Masala"))).perform();
		Thread.sleep(1500);
		actions.moveToElement(driver.findElement(By.linkText("Salt, Sugar & Jaggery"))).perform();
		Thread.sleep(1500);
		actions.moveToElement(driver.findElement(By.linkText("Sugarfree Sweeteners"))).perform();
		Thread.sleep(1500);
		actions.moveToElement(driver.findElement(By.linkText("Jaggery"))).click().build().perform();
	}

}
