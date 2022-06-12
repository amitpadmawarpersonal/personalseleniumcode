package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//Selenium_06_TotalLinks_Images_GetAttribute_FindElements_UseCases.mp4

public class MultipleElementsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// FE - Single element
		// FEs - Multiple elements

		// find out total no of links on page - count of links
		// print the text of each link on console
		// ignore links without text
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		// links are associated with <a> tag
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());

		//indexed based for loop
//		for (int i = 0; i < linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//			String hrefVal = linksList.get(i).getAttribute("href");
//			if (!text.isEmpty()) {
//				System.out.println(text + ":" + hrefVal);
//			}
//		}
		
		//for each loop
//		for (WebElement e : linksList) {
//			String text = e.getText();
//			String hrefval = e.getAttribute("href");
//			if (!text.isEmpty()) {
//				System.out.println(text + ":" + hrefval);
//			}
//		}
		
		//Streams
//		linksList
//		.stream()
//			.filter(e ->!e.getText().isEmpty())
//				.forEach(e-> System.out.println(e.getText()));
		
		//Parallel Streams
		linksList.parallelStream()
			.filter(e->!e.getText().isEmpty())
				.forEach(e->System.out.println(e.getText()));
		
	}
}
