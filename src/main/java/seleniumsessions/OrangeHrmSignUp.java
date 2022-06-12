package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmSignUp {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brutil = new BrowserUtil();// to get the browser specific methods

		WebDriver driver = brutil.init_driver("chrome");
		brutil.navigateUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		brutil.getPageTitle();
		brutil.getPageUrl();

		By name = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");
		By phone = By.id("Form_submitForm_Contact");

		ElementUtil eutil = new ElementUtil(driver);// to get the element specific methods
		eutil.doSendKeys(name, "amit");
		eutil.doSendKeys(email, "amit@test.com");
		eutil.doSendKeys(phone, "2323232323");
		Thread.sleep(3000);
		brutil.quitBrowser();

	}

}
