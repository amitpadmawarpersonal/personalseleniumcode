package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {
	public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.getTitle();
		// driver.quit();//null session id
		driver.close();// invalid session id

	}

}
//Boni Garcia

//ChromeDriver v97   Chrome Browser v99
