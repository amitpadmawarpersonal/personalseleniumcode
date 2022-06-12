package testngsessions;

import org.testng.annotations.Test;
//testng_02_TestNGFeatures_RunnerXML_Report_BaseTest.mp4

public class DependsOnMethodsConcept {

	//AAA - Test should be written independently
	
	@Test
	public void LogInTest() {
		System.out.println("Login");
		int i = 7/0;
	}

	@Test(dependsOnMethods = "LogInTest")
	public void bMakePaymentTest() {
		System.out.println("Make Payment");
	}

	@Test//(dependsOnMethods = "LogInTest")
	public void cLogOutTest() {
		System.out.println("Logout");
	}

}
