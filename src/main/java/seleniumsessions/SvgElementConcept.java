package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium_15_MultiMenuHandling_SVGElement_ShadowDomElement.mp4

public class SvgElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		List<WebElement> statesList = driver.findElements(By
				.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']//*[name()='path']"));
		System.out.println(statesList.size());

		Actions actions = new Actions(driver);

		for (WebElement e : statesList) {
			actions.moveToElement(e);
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
		}

	}

}
