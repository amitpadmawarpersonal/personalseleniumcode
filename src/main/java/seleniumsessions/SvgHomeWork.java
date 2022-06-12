package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgHomeWork {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		List<WebElement> rectBars = driver.findElements(By.xpath(
				"(//*[local-name()='svg' and @class='highcharts-root'])[last()]//*[name()='g' and @class='highcharts-series highcharts-series-0 highcharts-column-series highcharts-tracker']//*[name()='rect']"));
		System.out.println("Number of orange bars: " + rectBars.size());

	}

}
