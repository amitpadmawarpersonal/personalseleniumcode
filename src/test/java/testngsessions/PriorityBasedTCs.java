package testngsessions;

import org.testng.annotations.Test;
//testng_02_TestNGFeatures_RunnerXML_Report_BaseTest.mp4
public class PriorityBasedTCs {

	@Test()
	public void aTest() {
		System.out.println("A test");
	}

	@Test
	public void bTest() {
		System.out.println("B test");
	}

	@Test(priority = 1, enabled = true)
	public void cTest() {
		System.out.println("C test");
	}

	@Test(priority = 2)
	public void dTest() {
		System.out.println("D test");
	}

	@Test(priority = 0)
	public void eTest() {
		System.out.println("E test");
	}

}
