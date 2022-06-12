package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_10_BrowserWindowHandle_newWindow_Selenium4.x_Changes.mp4

public class NewWindowConceptPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		String googleWindowId = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		String facebookWindowId = driver.getWindowHandle();
		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://twitter.com");
		System.out.println(driver.getTitle());
		String twitterWindowId = driver.getWindowHandle();
		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://youtube.com");
		System.out.println(driver.getTitle());
		driver.close();

		// Switch to twitter tab
		driver.switchTo().window(twitterWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();// close twitter tab

		// switch to faceebok tab
		driver.switchTo().window(facebookWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();// close facebook window

		// switch to google window
		driver.switchTo().window(googleWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();

	}

}
