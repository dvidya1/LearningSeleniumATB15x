package SeleniumPrograms;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Lab010_xpath {
    @Owner("dvidya1")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Automate orangehr login page")
    @Test
    public void test_lab010() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        input_username.sendKeys("admin");
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        input_password.sendKeys("Hacker@4321");
        WebElement input_login = driver.findElement(By.xpath("//button[@type='submit']"));
        input_login.click();
        Thread.sleep(1000);
        WebElement PIM = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6"));
        Assert.assertEquals(PIM.getText(),"PIM");
    }
}
