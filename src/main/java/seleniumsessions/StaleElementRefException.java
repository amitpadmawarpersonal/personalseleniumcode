package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_14_JavaScriptExecutor.mp4
public class StaleElementRefException {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://opencart.antropy.co.uk/index.php?route=account/login");
		Thread.sleep(5000);
		WebElement emailId = driver.findElement(By.name("email"));
		emailId.sendKeys("roger@that.lcl");
		driver.navigate().refresh();
		emailId = driver.findElement(By.name("email"));
		emailId.sendKeys("rogerfed@that.lcl");
	}

}
