package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_12_CustomXapth_1_WebTableHandle.mp4

public class CustomXpath1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		// Xpath with last() function
//		WebElement amazonPayonMerchants = driver.findElement(
//				By.xpath("((//div[@class='navFooterVerticalRow navAccessibility']//ul)[last()-1]/li)[last()]"));

		// Xpath with position() function
//		WebElement amazonPayonMerchants = driver.findElement(
//				By.xpath("((//div[@class='navFooterVerticalRow navAccessibility']//ul)[position()=3]/li)[last()]"));

		// Xpath with index
		// WebElement amazonPayonMerchants =
		// driver.findElement(By.xpath("((//div[@class='navFooterVerticalRow
		// navAccessibility']//ul)[3]/li)[last()]"));
		// String text = amazonPayonMerchants.getText();
//		System.out.println(amazonPayonMerchants.getText());

//		CUSTOM XPATH - 
//		Address of the element in DOM
//		Abs - 
//		Rel - 
//		//htmltag[@attr1='value' and @attr2='value']
//		//htmltag[@attr1='value' or @attr2='value']
//
//		index
//		position()
//		last()
//		last()-1 = second last element
//		last()-3 = third last element
//
//		child to parent - 
//		/../../../..
//		parent::parent_html_tag
//
//		Index/Position-
//		(//input[@class='form-control'])[position()=3] - position number with function
//		(//input[@class='form-control'])[3] - index number
//
//		last()-
//		(//input[@class='form-control'])[last()] - selects the last element in the list
//
//		amazon.in
//		Xpath for Help link in footer - 
//		((//div[@class='navFooterVerticalRow navAccessibility']//ul)[last()]/li)[last()]
//
//		Xpath for Amazon Pay on Merchants link in footer - 
//		((//div[@class='navFooterVerticalRow navAccessibility']//ul)[last()-1]/li)[last()]
//
//		text() - function
//
//		//htmltag[text()='value']
//		(//a[text()='Customer Service'])[position()=2]
//
//		contains() function - 
		// htmltag[contains(@attr='value')]
		// https://demo.opencart.com/index.php?route=account/login
		// input[@name='email' and contains(@id,'input') and @type='text' and
		// contains(@class,'form')]

		// contains() with text()
		// fetch all the links which contains amazon text Amazon
		// htmltag[contains(text(),'value')]
		// a[contains(text(),'Amazon')]

		// Print all the links from Amazon which has text Amazon in it
//		List<WebElement> amazonLinks = driver.findElements(By.xpath("//a[contains(text(),'Amazon')]"));
//		System.out.println(amazonLinks.size());
//		for (WebElement e : amazonLinks) {
//			e.getText();
//			System.out.println(e.getText());
//		}

		// Print all the links from Amazon.com

//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		
//		for(WebElement e : links) {
//			e.getText();
//			System.out.println(e.getText());
//		}

		// All the headers which has gaming word in it from Amazon.com
		// h2[contains(text(),'Gaming')]

		// contains() with text() and attribute from Amazon.com:
		// a[contains(text(),'Sell') and @class='nav-a ']

		// contains() with text() and contains - attribute from Amazon.com:
		// htmltag[contains(text(),'value') and contains(@attr,'value')]
		// a[contains(text(),'Sell') and contains(@class,'nav_cs_4')]

		// Starts-with() function
		// h2[starts-with(text(),'Health')]

//		//To go to immediate parent htmltag
//		/.. OR
//		parent::htmltag
//
//		//To go to sibling above not below
//		preciding-sibling::sibling_htmltag
//
//		//To go to immediaite sibling
//		following-sibling::sibling_htmltag

		List<WebElement> flipkart = driver.findElements(By.xpath("//a[starts-with(text(),'Flipkart')]"));
		System.out.println(flipkart.size());
		Thread.sleep(3000);

		for (WebElement t : flipkart) {
			t.getText();
			System.out.println(t.getText());
		}
	}

}
