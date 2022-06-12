package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_10_BrowserWindowHandle_newWindow_Selenium4.x_Changes.mp4

public class WindowHandleOneByOne {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Clicking LinkedIn icon
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		// Now child window will be opened so need to handle it
		Set<String> handles = driver.getWindowHandles();// It will store the window ids of parent and child windows and
														// it will be unique that's why it's return type is Set<String>
		Iterator<String> it = handles.iterator();// It will start pointing to the child window, just above it
		// Now need to move the iterator to the window as it is just above right now
		// which is blank values
		String orangeHrmWindowId1 = it.next();
		System.out.println("OrangeHRM window id: " + orangeHrmWindowId1);
		// Now move iterator to child widow to get child window id
		String LinkedInWindowId = it.next();
		System.out.println("LinkedIn window id: " + LinkedInWindowId);
		// driver is still at parent window, so switch to child window
		driver.switchTo().window(LinkedInWindowId);
		String linkedInTitle = driver.getTitle();
		System.out.println("LinkedIn title: " + linkedInTitle);
		driver.close();
		// after closing the child window, driver is lost, so we need to get it to the
		// parent window
		driver.switchTo().window(orangeHrmWindowId1);
		String OrangeHrmTitle1 = driver.getTitle();
		System.out.println("OrangeHRM title1: " + OrangeHrmTitle1);
		Thread.sleep(3000);

		// Clicking Facebook icon
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		Set<String> handles2 = driver.getWindowHandles();
		Iterator<String> it2 = handles2.iterator();
		String orangeHrmWindowId2 = it2.next();
		System.out.println("Orange HRM window id 2: " + orangeHrmWindowId2);
		String facebooksWindowId = it2.next();
		System.out.println("Facebook window id: " + facebooksWindowId);
		driver.switchTo().window(facebooksWindowId);
		System.out.println("Facebook title is: " + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(orangeHrmWindowId2);
		System.out.println("OrangeHRM title2: " + driver.getTitle());

		Thread.sleep(3000);

		// Clicking on Twitter icon
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		Set<String> handles3 = driver.getWindowHandles();
		Iterator<String> it3 = handles3.iterator();
		String orangeHrmWindowId3 = it3.next();
		System.out.println("Orange HRM window id 3: " + orangeHrmWindowId3);
		String twitterWindowId = it3.next();
		System.out.println("Twitter window id: " + twitterWindowId);
		driver.switchTo().window(twitterWindowId);
		System.out.println("Twitter window title : " + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(orangeHrmWindowId3);
		System.out.println("OrangeHRM title3: " + driver.getTitle());

		Thread.sleep(3000);

		// Clicking on YouTube icon
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		Set<String> handles4 = driver.getWindowHandles();
		Iterator<String> it4 = handles4.iterator();
		String orangeHrmWindowId4 = it4.next();
		System.out.println("Orange HRM window id 4: " + orangeHrmWindowId4);
		String youTubeWindowId = it4.next();
		System.out.println("Youtube window id: " + youTubeWindowId);
		driver.switchTo().window(youTubeWindowId);
		System.out.println("Youtube title: "+driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(orangeHrmWindowId4);
		System.out.println("OrangeHRM title4: " + driver.getTitle());


	}

}
