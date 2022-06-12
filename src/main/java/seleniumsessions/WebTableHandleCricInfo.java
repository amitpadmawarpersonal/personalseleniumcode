package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_12_CustomXapth_1_WebTableHandle.mp4

public class WebTableHandleCricInfo {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/indian-premier-league-2022-1298423/gujarat-titans-vs-sunrisers-hyderabad-40th-match-1304086/full-scorecard");
		driver.manage().window().maximize();

		// Now use the generic method created belo and just provide the player names
		System.out.println(getUserData("Abhishek Sharma"));
		System.out.println(getUserData("Kane Williamson"));
		System.out.println(getUserData("Rahul Tripathi"));
		System.out.println(getUserData("Aiden Markram"));
		System.out.println(getUserData("Nicholas Pooran"));
		System.out.println(getUserData("Washington Sundar"));

	}

	public static List<String> getUserData(String name) {
		System.out.println("Player name is: " + name); // title for player data
		// xpath for fetching the player name and his stats from the table
		List<WebElement> cricInfo = driver.findElements(By.xpath(
				"//span[text()='" + name + "']/parent::span/parent::a/parent::span/parent::td/following-sibling::td"));
		// create blank array list to store the printed data
		List<String> colList = new ArrayList<String>();
		// iterate the for loop for fetching the data
		for (WebElement e : cricInfo) {
			String details = e.getText(); // get the text and store it in string var
			colList.add(details);// add all the data in the blank array list created above

		}
		return colList;// returns the whole array list with data
	}

}
