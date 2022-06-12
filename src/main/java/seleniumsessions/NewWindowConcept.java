package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_10_BrowserWindowHandle_newWindow_Selenium4.x_Changes.mp40
public class NewWindowConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String parentWindowId = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://facebook.com");
		String facebookWindowId = driver.getWindowHandle();
		System.out.println(driver.getTitle());

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://twitter.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(facebookWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
