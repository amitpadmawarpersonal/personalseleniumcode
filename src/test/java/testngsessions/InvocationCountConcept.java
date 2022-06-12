package testngsessions;

import org.testng.annotations.Test;
//testng_02_TestNGFeatures_RunnerXML_Report_BaseTest.mp4

public class InvocationCountConcept {
	
	@Test(invocationCount = 10) //Test will be executed 10 times
	public void makePayment() {
		System.out.println("Make payment");
	}

}
