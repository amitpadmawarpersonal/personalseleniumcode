package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_07_GoogleSearch_FooterList_ECommSearch_CustomUtils.mp4

public class RightPanelLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By siderBar = By.xpath("//aside[@id='column-right']/div/a");
		List<String> actEleTextList = getElementsTextList(siderBar);
		System.out.println(actEleTextList);
		//printAllElementsText(siderBar);

	}
	
	public static int getElementsListCount(By locator) {
		return driver.findElements(locator).size();
	}
	
	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = driver.findElements(locator);
		for (int i = 0; i < eleList.size(); i++) {
			String text = eleList.get(i).getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}

	public static void printAllElementsText(By locator) {
		List<WebElement> eleList = driver.findElements(locator);
		for (int i = 0; i < eleList.size(); i++) {
			String text = eleList.get(i).getText();
			System.out.println(text);
		}

	}

}
