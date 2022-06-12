package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium_09_Alert_PopUp_AuthPopUp_FrameHandle_WindowSize.mp4

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"imageTemplateContainer\"]/img")).click();
		Thread.sleep(3000);

		// driver.switchTo().frame(0); //by frame index
		// driver.switchTo().frame("frame-one748593425"); //by frame id or name

		driver.switchTo().frame(driver.findElement(By.id("frame-one748593425")));// by web element
		String text = driver.findElement(By.xpath("//*[@id=\"q16\"]/div/div/span")).getText();
		System.out.println(text);
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("2009");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Bajaj");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("Pulsor");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Black");
		driver.findElement(By.name("RESULT_TextField-6")).sendKeys("45");
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("123456789");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Amit");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("124 st");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("St.martin road");
		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("Chicago");

		WebElement dropDown = driver.findElement(By.id("RESULT_RadioButton-12"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("Illinois");
		driver.findElement(By.id("RESULT_TextField-13")).sendKeys("87954");
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("9898989898");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("amit@test.com");
		driver.findElement(By.id("FSsubmit")).click();

		driver.switchTo().defaultContent(); // coming out of iframe on the main page
		WebElement para = driver.findElement(By
				.xpath("//div[@class='details__text-wrapper']//p[contains(text(),'Get started with Formsite today')]"));
		String paraText = para.getText();
		if (paraText.contains("Get started with Formsite today")) {
			System.out.println(paraText);

		}
	}

}
