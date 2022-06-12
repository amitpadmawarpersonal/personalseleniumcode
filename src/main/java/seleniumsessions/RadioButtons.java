package seleniumsessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement baseEle = driver.findElement(By.cssSelector("label[for='radio2']"));
		System.out.println(baseEle.getText());

		driver.findElement(with(By.cssSelector("[name='radioButton'][value='radio2']")).toLeftOf(baseEle)).click();

	}

}
