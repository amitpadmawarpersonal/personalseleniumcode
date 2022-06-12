package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleOneByOneGenericMethod {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		By linkedIn = By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
		By facebook = By.xpath("//img[@alt='OrangeHRM on Facebook']");
		By twitter = By.xpath("//img[@alt='OrangeHRM on twitter']");
		By youtube = By.xpath("//img[@alt='OrangeHRM on youtube']");
		
		// clickOnSocialMediaIcons(linkedIn);

	}

//	public static void clickOnSocialMediaIcons(By locator) {
//		Set<String> handle = driver.getWindowHandles();
//		Iterator<String> it = handle.iterator();
//		it.next();
//		
//			
//		}
//			
//
//}

}
