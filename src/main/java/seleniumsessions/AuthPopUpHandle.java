package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_09_Alert_PopUp_AuthPopUp_FrameHandle_WindowSize.mp4

public class AuthPopUpHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Need to provide the username:password  together with the URL, with variables
//		String un = "admin";
//		String pwd = "admin";
//		driver.get("https://"+un+":"+pwd+"@the-internet.herokuapp.com/basic_auth");
		
		//Need to provide the username:password  together with the URL, directly
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
