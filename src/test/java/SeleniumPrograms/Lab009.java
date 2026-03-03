package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab009 {
    @Test
    public void test_lab009() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement a_make_appointment= driver.findElement(By.id("btn-make-appointment"));
        a_make_appointment.click();
        WebElement input_username = driver.findElement(By.id("txt-username"));
        input_username.sendKeys("John Doe");
        WebElement input_password = driver.findElement(By.id("txt-password"));
        input_password.sendKeys("ThisIsNotAPassword");
        WebElement button_login = driver.findElement(By.id("btn-login"));
        button_login.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");
    }
}
