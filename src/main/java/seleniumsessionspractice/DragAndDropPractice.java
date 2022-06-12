package seleniumsessionspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium_11_ActionsClass_DragnDrop_RightClick_MoveToElement_Submit_SeleniumExceptions.mp4

public class DragAndDropPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();

		WebElement sourceEle = driver.findElement(By.cssSelector("div.ui-draggable"));
		WebElement targetEle = driver.findElement(By.cssSelector("div#droppable"));

		Actions action = new Actions(driver);
		action.clickAndHold(sourceEle)
			.moveToElement(targetEle)
				.release()
					.build()
						.perform();

	}

}
