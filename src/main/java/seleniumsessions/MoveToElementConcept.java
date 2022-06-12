package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_11_ActionsClass_DragnDrop_RightClick_MoveToElement_Submit_SeleniumExceptions.mp4

public class MoveToElementConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");

		WebElement contentMenu = driver.findElement(By.className("menulink"));
		// Need to create Actions class from Selenium

		Actions act = new Actions(driver);
		act.moveToElement(contentMenu).build().perform();// build is used where there are multiple elements to me found
															// and clicked, like parent - child1 - child2
		driver.findElement(By.linkText("COURSES")).click();// Linktext takes what is visible on UI not what's in DOM

	}

}
