package seleniumsessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Selenium_16_PaginationWebTable_RelativeLocators_PsuedoElements.mp4

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorsIplTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2022-1298423/points-table-standings");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		findFamilyElements("Chennai Super Kings", "a", "td", "span", "span");

	}

	public static void findFamilyElements(String base, String e1, String e2, String e3, String e4) {

		WebElement baseEle = driver.findElement(By.xpath("//span[text()='"+base+"']"));
		String rightSideEle = driver.findElement(with(By.tagName(e1)).toRightOf(baseEle)).getText();
		System.out.println("AQI-US is:" + rightSideEle);

		String leftSideEle = driver.findElement(with(By.tagName(e2)).toLeftOf(baseEle)).getText();
		System.out.println("Rank is: " + leftSideEle);

		String aboveEle = driver.findElement(with(By.tagName(e3)).above(baseEle)).getText();
		System.out.println("Above city name is: " + aboveEle);

		String belowEle = driver.findElement(with(By.tagName(e4)).below(baseEle)).getText();
		System.out.println("Below city name is: " + belowEle);

	}

}
