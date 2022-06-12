package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgElementConceptPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://mapsvg.com/maps/india");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		List<WebElement> statesList = driver
				.findElements(By.xpath("//*[local-name()='svg' and @id='svg2']//*[name()='path']"));
		System.out.println(statesList.size());

		Actions actions = new Actions(driver);
		for (WebElement e : statesList) {
			actions.moveToElement(e);
			String name = e.getAttribute("title");
			System.out.println(name);

		}
	}

}
