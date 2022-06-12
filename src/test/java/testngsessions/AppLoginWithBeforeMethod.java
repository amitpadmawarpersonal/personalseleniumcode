package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//testng_02_TestNGFeatures_RunnerXML_Report_BaseTest.mp4

public class AppLoginWithBeforeMethod {
	WebDriver driver;
	String name = "Amit";

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
	}

	@Test(priority = 2, expectedExceptions = ArithmeticException.class)
	public void getTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login34");
		int num = 9 / 0;
	}

	@Test(priority = 1, expectedExceptions = NullPointerException.class, dependsOnMethods = "getTitleTest")
	public void getUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("/login"));
		AppLoginWithBeforeMethod app = new AppLoginWithBeforeMethod();
		app = null;
		System.out.println(app.name);
	}

	@Test(priority = 3)
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
