package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_09_Alert_PopUp_AuthPopUp_FrameHandle_WindowSize.mp4

public class JSPopUpHandle {

	// JS pop up methods -
	// 1. alert("msg");
	// 2. prompt("text field to enter value");
	// 3. confirm("are you sure?");

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();

		Thread.sleep(3000);
		// Need to switch to alert from the page elements -

//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();

		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		alrt.sendKeys("admin"); // To enter the value for Prompt type JS pop ups

	}

}
