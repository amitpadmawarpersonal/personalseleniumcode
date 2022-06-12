package seleniumsessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketNew {

	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bigbasket.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        WebElement dropdown = driver.findElement(By.xpath("//li[@class='dropdown full-wid hvr-drop']//a"));
        Actions action = new Actions(driver);
        action.moveToElement(dropdown).perform();


        List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@id='navBarMegaNav']//li)"));

        for (int i = 1; i <= allOptions.size(); i++) {

            WebElement firstOption = driver.findElement(By.xpath("(//ul[@id='navBarMegaNav']//li)[" + i + "]"));
            action.moveToElement(firstOption).perform();
            System.out.println(firstOption.getText());


            List<WebElement> optionlist_2 = driver.findElements(By.xpath("(//div[@class='col-md-3 pad-rt-0 desgn-fix']//ul)[2]//li"));

            for (int j = 1; j <= optionlist_2.size(); j++) {

                WebElement secondOption = driver.findElement(By.xpath("(//div[@class='col-md-3 pad-rt-0 desgn-fix']//ul)[2]//li[" + j + "]"));

                if (secondOption.isDisplayed())
                {
                    action.moveToElement(secondOption).perform();
                    System.out.println(secondOption.getText());
                }
                List<WebElement> optionlist_3_4 = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])//li"));

                for (WebElement eachoption3_4 : optionlist_3_4) {

                    if (!eachoption3_4.getText().isBlank()){
                        System.out.println(eachoption3_4.getText());
                    }
                }
            }
        }
    }
}