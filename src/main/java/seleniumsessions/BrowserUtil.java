package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil implements Util {

	public WebDriver driver;

	public WebDriver init_driver(String browser_name) {
		// cross browser logic

		System.out.println("Brwoser name is: " + browser_name);
		if (browser_name.equalsIgnoreCase(CHROME_BROWSER)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser_name.equalsIgnoreCase(EDGE_BROWSER)) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser_name.equalsIgnoreCase(FIREFOX_BROWSER)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please pass the correct browser name: " + browser_name);
		}
		return driver;

	}

	@Override
	public void navigateUrl(String url) {
		if (url == null) {
			return;
		}
		if (url.isEmpty()) {
			return;
		}
		if (url.indexOf("http") == -1 || url.indexOf("https") == -1) {
			System.out.println("Please pass the correct url, http/https missing...");
			return;
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
