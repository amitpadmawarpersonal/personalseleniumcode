package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//Selenium_06_TotalLinks_Images_GetAttribute_FindElements_UseCases.mp4

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		// find out total no of images on page - count of images
		// print the alt/src/height of each image on console
		// ignore images without text

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		By images = By.tagName("img");
		// By srcVal = By.tagName("src");
		By links = By.tagName("a");
		int linksCount = getElementsCount(links);
		int imagesCount = getElementsCount(images);
		// int linksCount = getElementsCount(links);
		System.out.println(linksCount + " : " + imagesCount);

//		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//		System.out.println("Total images: " + imagesList.size());
//		for (WebElement e : imagesList) {
//			String altvalue = e.getAttribute("alt");
//			String srcValue = e.getAttribute("src");
//			String htValue = e.getAttribute("height");
//			System.out.println(altvalue);
//			System.out.println(srcValue);
//			System.out.println(htValue);
//
//		}

	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
