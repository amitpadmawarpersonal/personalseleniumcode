package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_12_CustomXapth_1_WebTableHandle.mp4

public class WebTableHandleCricInfo2 {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/indian-premier-league-2022-1298423/gujarat-titans-vs-sunrisers-hyderabad-40th-match-1304086/full-scorecard");
		driver.manage().window().maximize();

		System.out.println(getuserData("Mohammed Shami"));
		System.out.println(getuserData("Yash Dayal"));
		System.out.println(getuserData("Alzarri Joseph"));
		System.out.println(getuserData("Rashid Khan"));
		System.out.println(getuserData("Lockie Ferguson"));

	}

	public static List<String> getuserData(String name) {
		System.out.println("Bowler name is: " + name);
		List<WebElement> bowlerDetails = driver.findElements(
				By.xpath("//span[text()='" + name + "']/parent::a/parent::span/parent::td/following-sibling::td"));
		List<String> colDetails = new ArrayList<String>();

		for (WebElement e : bowlerDetails) {
			String details = e.getText();
			colDetails.add(details);
		}
		return colDetails;
	}

}
