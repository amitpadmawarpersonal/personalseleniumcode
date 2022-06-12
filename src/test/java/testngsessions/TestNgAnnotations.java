package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	@BeforeSuite
	public void connectWithDb() {
		System.out.println("BeforeSuite -- connect with DB");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BeforeTest -- create user");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BeforeClass -- launch browser");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BeforeMethod -- log in to App");
	}

	@Test
	public void homePageTitleTest() {
		System.out.println("Test -- title test");
	}

	@Test
	public void homePageUrlTest() {
		System.out.println("Test - url test");
	}

	@Test
	public void isUserLoggedInTest() {
		System.out.println("Test -- user is logged in");
	}

	@AfterMethod
	public void logOut() {
		System.out.println("AfterMethod --User is logged out");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass -- close the browser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AfterTest -- delete user");
	}

	@AfterSuite
	public void disconnectDb() {
		System.out.println("AfterSuite -- disconnect with DB");
	}
}
