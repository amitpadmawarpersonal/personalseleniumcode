package mytestpackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RPLoginNegativeTest extends BaseTest {

	@Test
	public void titleTest() throws InterruptedException {
		driver.get("https://amitwebsite.residentportal.com/auth");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("test@t.lcl");
		// driver.findElement(By.xpath("//input[@label='Email']")).sendKeys("test@t.lcl");
		driver.findElement(By.name("password")).sendKeys("23423");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='css-y1gt6f']/button[contains(@class,'ehlti5m0')]")).click();
		Thread.sleep(5000);

		String error = driver
				.findElement(
						By.xpath("//div[@type='error']/em[contains(text(),'The username or password is incorrect.')]"))
				.getText();
		System.out.println(error);
		Assert.assertTrue(error.contains("The username or password is incorrect."));
	}

}
