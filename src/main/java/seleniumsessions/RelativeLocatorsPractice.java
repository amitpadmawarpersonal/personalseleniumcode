package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

//Selenium_16_PaginationWebTable_RelativeLocators_PsuedoElements.mp4

public class RelativeLocatorsPractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://whenwise.com/sign-in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		driver.findElement(By.id("login-btn")).click();

		driver.navigate().to("https://whenwise.com/users/2835/edit");

		WebElement baseEle = driver.findElement(By.xpath("//span[text()='Email on booking confirmation?']"));

		driver.findElement(with(By.className("lever")).toRightOf(baseEle)).click();

	}

}
