package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_06_TotalLinks_Images_GetAttribute_FindElements_UseCases.mp4

public class TotalTextFields {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");

		By textFields = By.className("form-control");
		ElementUtil eleUtil = new ElementUtil(driver);
		int textFieldsCount = eleUtil.getElementsCount(textFields);
		System.out.println(textFieldsCount);

	}

}
