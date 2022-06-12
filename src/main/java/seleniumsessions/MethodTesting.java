package seleniumsessions;

import static org.testng.Assert.assertEquals;

public class MethodTesting {

	public static void main(String[] args) {

		sumTest(10, 20);
		subTest(20, 1);
		// System.out.println("sub");

	}

	public static void sumTest(int a, int b) {
		int result = a + b;
		assertEquals(30, result);
		System.out.println(result);
	}

	public static void subTest(int a, int b) {
		int result = a - b;
		assertEquals(19, result);
		System.out.println(result);
	}

}