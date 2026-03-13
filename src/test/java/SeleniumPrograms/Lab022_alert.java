package SeleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab022_alert {
    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        Thread.sleep(3000);
       //JS ALert //having ok in alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(3000);
        //accept alert //1st approach
      // driver.switchTo().alert().accept();
//OR
       //accept alert and print the text //2nd approach
        Alert jsalert = driver.switchTo().alert();
        System.out.println(jsalert.getText());
        jsalert.accept();
        String jsalert_result=driver.findElement(By.id("result")).getText();
        Assert.assertEquals(jsalert_result,"You successfully clicked an alert");


     /*  //Confirm ALert //having ok and cancel in alert //1st approach
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
       driver.switchTo().alert().dismiss();

       //2nd approach
       Alert jsconfirm = driver.switchTo().alert();
        System.out.println(jsconfirm.getText());
       jsalert.dismiss();

       //Prompt Aler //ok cancel with input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert jsprompt = driver.switchTo().alert();
     jsprompt.sendKeys("prompt ok");
       jsprompt.accept();
        //OR
        jsprompt.sendKeys("prompt cancel");
        jsprompt.dismiss(); */

    }
}
