package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilNew implements UtilNew {

	WebDriver driver;

	public void init_browser(String browser_name) {
		System.out.println("The browser is: " + browser_name);
//		if (browser_name.equalsIgnoreCase(chrome_browser)) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		} else if (browser_name.equalsIgnoreCase(edge_browser)) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		} else if (browser_name.equalsIgnoreCase(firefox_browser)) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//
//		} else {
//			System.out.println("Please provide correct browser name: " + browser_name);
//		}
//

		switch (browser_name = firefox_browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please enter the correct browser name: " + browser_name);
			break;
		}

//		switch (browser_name = firefox_browser) {
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//		case "edge":
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			break;
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
//		default:
//			System.out.println("Please enter the correct browser name: " + browser_name);
//			break;
//
//		}
	}

	@Override
	public void navigateUrl(String url) {

		if (url.isEmpty()) {
			return;
		}
		if (url.isBlank()) {
			return;
		}
		if (url.indexOf("http") == -1 || url.indexOf("https") == -1) {
			System.out.println("http/https is missing..");
		}
		driver.get(url);

	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();

	}

	@Override
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	@Override
	public String getPageSource() {
		return driver.getPageSource();
	}

	@Override
	public void closeBrowser() {
		driver.close();

	}

	@Override
	public void quitBrowser() {
		driver.quit();

	}

}
