package mytestpackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//testng_02_TestNGFeatures_RunnerXML_Report_BaseTest.mp4

public class DemoOpenCartTest extends BaseTest {

	/*
	 * //Remove this duplicate code from all 3 GoogleTest, DemoOpenCartTest and
	 * RPAppTest and move to BaseTest WebDriver driver;
	 * 
	 * @BeforeTest public void setUp() { WebDriverManager.chromedriver().setup();
	 * driver = new ChromeDriver();
	 * driver.get("https://demo.opencart.com/index.php?route=account/login");
	 * driver.manage().window().maximize(); }
	 */

	@Test(priority = 1)
	public void titleTest() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");
	}

	@Test(priority = 2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("route=account/login"));
	}

	@Test(priority = 3)
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}

	/*
	 * //Remove this duplicate code from all 3 GoogleTest, DemoOpenCartTest and
	 * RPAppTest and move to BaseTest
	 * 
	 * @AfterTest public void tearDown() { driver.close(); }
	 */

}
