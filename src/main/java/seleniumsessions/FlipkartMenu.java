package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartMenu {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		hoverOnElements("Televisions", "Smart TVs");

	}

	public static void hoverOnElements(String e1, String e2) throws InterruptedException {
		WebElement appliances = driver.findElement(By.xpath("//div[@class='xtXmba' and text()='Appliances']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(appliances).perform();
		Thread.sleep(2000);

		actions.moveToElement(driver.findElement(By.linkText(e1))).perform();
		Thread.sleep(2000);

		actions.moveToElement(driver.findElement(By.linkText(e2))).click().build().perform();

	}

}