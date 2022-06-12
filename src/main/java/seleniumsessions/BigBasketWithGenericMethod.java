package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketWithGenericMethod {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://bigbasket.com");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		// use the generic method crated below
		doHoverOnFourLevelMenu("Cleaning & Household", "Pooja Needs", "Agarbatti, Incense Sticks", "Deepam Oil");

	}

	public static void doHoverOnFourLevelMenu(String l1, String l2, String l3, String l4) throws InterruptedException {
		WebElement mainMenu = driver.findElement(By.cssSelector("a.meganav-shop"));

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
