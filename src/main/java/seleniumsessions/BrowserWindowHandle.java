package seleniumsessions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_10_BrowserWindowHandle_newWindow_Selenium4.x_Changes.mp4

public class BrowserWindowHandle {
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
		Iterator<String> it = handles.iterator();// It ill start pointing to the child window, just above it
		// Now need to move the iterator to the window as it is just above right now
		// which is blank values
		String parentWindowId = it.next();
		System.out.println("Parent window id: " + parentWindowId);
		// Now move iterator to child widow to get child window id
		String childWindowId = it.next();
		System.out.println("Child window id: " + childWindowId);
		// driver is still at parent window, so switch to child window
		driver.switchTo().window(childWindowId);
		String titleChild1 = driver.getTitle();
		System.out.println("Child 1 title: " + titleChild1);
		driver.close();
		// after closing the child window, driver is lost, so we need to get it to the
		// parent window
		driver.switchTo().window(parentWindowId);
		String titleParent = driver.getTitle();
		System.out.println("Parent title: " + titleParent);
		Thread.sleep(3000);

		// Clicking Facebook icon
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
//		Set<String> handles2 = driver.getWindowHandles();
//		Iterator<String> it2 = handles2.iterator();
//		String parentWindowId2 = it2.next();
//		System.out.println("Parent window id 2: " + parentWindowId2);
//		String childWindowId2 = it2.next();
//		System.out.println("Facebook window id: " + childWindowId2);
//		driver.switchTo().window(childWindowId2);
//		System.out.println("Facebook title is: " + driver.getTitle());
//		Thread.sleep(3000);
//		driver.close();
//		driver.switchTo().window(parentWindowId2);
//		Thread.sleep(3000);

		// Clicking on Twitter icon
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
//		Set<String> handles3 = driver.getWindowHandles();
//		Iterator<String> it3 = handles3.iterator();
//		String parentWindowId3 = it3.next();
//		System.out.println("parent window id 3: " + parentWindowId3);
//		String childWindow3 = it3.next();
//		System.out.println("Child window id3: " + childWindow3);
//		driver.switchTo().window(childWindow3);
//		System.out.println("Child window title 3: " + driver.getTitle());
//		Thread.sleep(3000);
//		driver.close();
//		driver.switchTo().window(parentWindowId3);
//		Thread.sleep(3000);

		// Clicking on YouTube icon
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
//		Set<String> handles4 = driver.getWindowHandles();
//		Iterator<String> it4 = handles4.iterator();
//		String parentWindowId4 = it4.next();
//		System.out.println("Parent window id 4: " + parentWindowId4);
//		String childWindowId4 = it4.next();
//		System.out.println("Child window id 4: " + childWindowId4);
//		driver.switchTo().window(childWindowId4);
//		Thread.sleep(3000);
//		driver.close();
//		driver.switchTo().window(parentWindowId4);

	}

}
