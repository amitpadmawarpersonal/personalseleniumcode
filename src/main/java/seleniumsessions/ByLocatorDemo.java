package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ByLocatorDemo {

	public static void main(String[] args) {

		BrowserUtil butil = new BrowserUtil();//to call browser specific methods
		WebDriver driver = butil.init_driver("chrome");
		butil.navigateUrl("https://demo.opencart.com/index.php?route=account/register");
		butil.getPageTitle();
		butil.getPageUrl();

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirm = By.id("input-confirm");

		ElementUtil eutil = new ElementUtil(driver); //to call element specific methods
		eutil.doSendKeys(firstName, "amit");
		eutil.doSendKeys(lastName, "padmawar");
		eutil.doSendKeys(email, "amit@gmail.com");
		eutil.doSendKeys(phone, "2323232323");
		eutil.doSendKeys(password, "test@123");
		eutil.doSendKeys(confirm, "test@123");

	}

}
