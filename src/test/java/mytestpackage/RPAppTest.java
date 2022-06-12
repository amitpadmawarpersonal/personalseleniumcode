package mytestpackage;

import org.testng.Assert;
import org.testng.annotations.Test;


//testng_02_TestNGFeatures_RunnerXML_Report_BaseTest.mp4

public class RPAppTest extends BaseTest {

	/*
	 * //Remove this duplicate code from all 3 GoogleTest, DemoOpenCartTest and
	 * RPAppTest and move to BaseTest WebDriver driver;
	 * 
	 * @BeforeTest public void setUp() { WebDriverManager.chromedriver().setup();
	 * driver = new ChromeDriver();
	 * driver.get("https://amitwebsite.residentportal.com/auth");
	 * driver.manage().window().maximize(); }
	 */

	@Test(priority = 1)
	public void rpTitleTest() {
		driver.get("https://amitwebsite.residentportal.com/auth");
		Assert.assertEquals(driver.getTitle(), "Resident Portal");
	}

	@Test(priority = 2)
	public void rpUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("/auth"));
	}

	/*
	 * //Remove this duplicate code from all 3 GoogleTest, DemoOpenCartTest and
	 * RPAppTest and move to BaseTest
	 * 
	 * @AfterTest public void terDown() { driver.close(); }
	 */
}
