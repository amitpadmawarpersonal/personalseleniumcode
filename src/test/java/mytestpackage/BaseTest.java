package mytestpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
//testng_02_TestNGFeatures_RunnerXML_Report_BaseTest.mp4

//This class will take care of pre and post conditions for GoogleTest, DemoOpenCartTest and RPAppTest classes
public class BaseTest {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void terDown() {
		driver.close();
	}

}
