package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab005_locators {

/*Locators - Find the Web elements
Open the URL https://app.vwo.com/#/login
Find the Email id** and enter the email as **admin@admin.com**
Find the Pass inputbox** and enter passwrod as **admin**.
Find and Click on the submit button
Verify that the error message is shown
"_**Your email, password, IP address or location did not match"**_
*/
@Test
public void test_locators() throws InterruptedException{
    //driver
    WebDriver driver = new ChromeDriver();
    driver.get("https://app.vwo.com");
    driver.manage().window().maximize();
    //locator
    WebElement input_email = driver.findElement(By.id("login-username"));
    input_email.sendKeys("admin@admin.com");

    WebElement input_password = driver.findElement(By.name("password"));
    input_password.sendKeys("wrongpass@123");

    WebElement button_submit = driver.findElement(By.id("js-login-btn"));
    button_submit.click();

    Thread.sleep(5000);

    WebElement error_message_login = driver.findElement(By.className("notification-box-description"));
    System.out.println(error_message_login.getText());
    //wait

    //assertion
    Assert.assertEquals(error_message_login.getText().trim(),"Your email, password, IP address or location did not match");
    //quit
    driver.quit();

}

}
