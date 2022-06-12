package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();

		String currentMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(currentMonth);

		while (!currentMonth.equalsIgnoreCase("January 2022")) {// negative condition so that if current month is not
																// matching with expected month then go inside while
																// loop
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			currentMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

		}
		selectDate("22");

	}

	public static void selectDate(String dateNumber) {
		driver.findElement(By.xpath("//a[text()='" + dateNumber + "']")).click();

	}

}
