package seleniumsessionspractice;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_16_PaginationWebTable_RelativeLocators_PsuedoElements.mp4

public class RelativeLocatorsPractice2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		Thread.sleep(2000);

		// Checking checkbox to the right of Privacy Policy
		WebElement baseEle1 = driver.findElement(By.linkText("Privacy Policy"));
		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toRightOf(baseEle1)).click();
		Thread.sleep(2000);

		// Checking Newsletter Radio Button
		WebElement baseEle2 = driver.findElement(By.xpath("//input[@value='1']/parent::label[@class='radio-inline']"));
		System.out.println(baseEle2.getText());
		driver.findElement(with(By.xpath("(//input[@type='radio' and @value='1'])[2]")).toLeftOf(baseEle2)).click();

	}

}
