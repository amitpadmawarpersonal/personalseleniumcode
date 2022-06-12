package mytestpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

//testng_02_TestNGFeatures_RunnerXML_Report_BaseTest.mp4

public class GoogleTest extends BaseTest {

	/*
	 * //Remove this duplicate code from all 3 GoogleTest, DemoOpenCartTest and
	 * RPAppTest and move to BaseTest WebDriver driver;
	 * 
	 * @BeforeTest public void setUp() { WebDriverManager.chromedriver().setup();
	 * driver = new ChromeDriver(); driver.get("https://www.google.com/");
	 * driver.manage().window().maximize(); }
	 */

	@Test(priority = 1)
	public void googleTitleTest() {
		driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "Google");

	}

	@Test(priority = 2)
	public void googleUlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}

	/*
	 * //Remove this duplicate code from all 3 GoogleTest, DemoOpenCartTest and
	 * RPAppTest and move to BaseTest
	 * 
	 * @AfterTest public void tearDown() { driver.close(); }
	 */

}
