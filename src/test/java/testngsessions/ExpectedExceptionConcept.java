package testngsessions;

import org.testng.annotations.Test;

//testng_02_TestNGFeatures_RunnerXML_Report_BaseTest.mp4
public class ExpectedExceptionConcept {

	String name = "Amit";

	@Test(priority = 1, expectedExceptions = { NullPointerException.class, ArithmeticException.class })
	public void searchTest() {
		System.out.println("Macbook");
		int i = 9 / 0; // AE
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		System.out.println(obj.name); // NPE
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void loginTest() {
		int i = 9 / 0;
		System.out.println("login");

//		int[] arr = new int[] { 1, 2, 4, 5 };
//		int[] arr1 = new int[3];
//		int[] arr2 = {1,2,3,4,5};

	}

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void aiobETest() {

		int[] arr = { 1, 2, 4, 6 };

		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

}