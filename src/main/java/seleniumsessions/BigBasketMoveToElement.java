package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_11_ActionsClass_DragnDrop_RightClick_MoveToElement_Submit_SeleniumExceptions.mp4Selenium_15_MultiMenuHandling_SVGElement_ShadowDomElement.mp4
//Selenium_15_MultiMenuHandling_SVGElement_ShadowDomElement.mp4
public class BigBasketMoveToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement mainMenu = driver.findElement(
				By.xpath("//li[@class='dropdown full-wid hvr-drop']/a[@class='dropdown-toggle meganav-shop']"));
		Thread.sleep(1500);

		Actions act = new Actions(driver);
		act.moveToElement(mainMenu).perform();
		Thread.sleep(1500);

		act.moveToElement(driver.findElement(By.linkText("Bakery, Cakes & Dairy"))).perform();
		Thread.sleep(1500);
		act.moveToElement(driver.findElement(By.linkText("Cookies, Rusk & Khari"))).perform();
		Thread.sleep(1500);
		act.moveToElement(driver.findElement(By.linkText("Premium Cookies"))).perform();
		Thread.sleep(1500);
		// act.moveToElement(driver.findElement(By.linkText("Biscuits"))).click().build().perform();
		WebElement fourthMenu = driver.findElement(By.linkText("Biscuits"));
		act.moveToElement(fourthMenu).click().build().perform();

	}

}
