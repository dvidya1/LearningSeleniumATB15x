package SeleniumPrograms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class Lab023_page {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://thetestingacademy.com/");
        driver.manage().window().maximize();
        Actions page_action = new Actions(driver);
        page_action.sendKeys(Keys.PAGE_DOWN).build().perform();
    }
}
