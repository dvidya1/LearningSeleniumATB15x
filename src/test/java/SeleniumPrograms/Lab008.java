package SeleniumPrograms;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Lab008 {
    @Owner("dvidya1")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void test_lab008() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vwo.com/free-trial");
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));
        WebElement input_email = driver.findElement(By.id("page-v1-step1-email"));
        input_email.sendKeys("abc");
        WebElement input_i_agree = driver.findElement(By.name("gdpr_consent_checkbox"));
        input_i_agree.click();
        WebElement button_create = driver.findElement(By.tagName("button"));
        button_create.click();
        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");
    }
}



