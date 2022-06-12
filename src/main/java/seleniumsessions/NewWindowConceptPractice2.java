package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium_10_BrowserWindowHandle_newWindow_Selenium4.x_Changes.mp4

public class NewWindowConceptPractice2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		String googleWindowId = driver.getWindowHandle();
		Thread.sleep(2000);

		// open new window and open new URL
		driver.switchTo().newWindow(WindowType.TAB);
		String facebookWindowId = driver.getWindowHandle();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		// Open new tab and new URL
		driver.switchTo().newWindow(WindowType.TAB);
		String twitterWindowId = driver.getWindowHandle();
		driver.get("https://twitter.com");
		System.out.println(driver.getTitle());

		// Open new tab and URL
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://youtube.com");
		System.out.println(driver.getTitle());
		driver.close();

		// Switch to earlier tab
		driver.switchTo().window(twitterWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();

		// switch to earlier tab
		driver.switchTo().window(facebookWindowId);
		System.out.println(driver.getTitle());
		driver.close();

		// switch to main tab
		driver.switchTo().window(googleWindowId);
		System.out.println(driver.getTitle());
		driver.close();

	}

}
