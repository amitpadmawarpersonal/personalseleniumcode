package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmericanEagleMoveToElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aeo.in/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		doProductSearchTwoLevelMenu("Men", "Polo Shirts");

	}

	public static void doProductSearchTwoLevelMenu(String l1, String l2) throws InterruptedException {
		WebElement Postpaid = driver.findElement(By.linkText(l1));
		Actions actions = new Actions(driver);
		actions.moveToElement(Postpaid).perform();
		Thread.sleep(1500);
		actions.moveToElement(driver.findElement(By.linkText(l2))).click().build().perform();

	}

}
