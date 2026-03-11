package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Lab018_method_practise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getPageSource());
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
        boolean display_status = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).isDisplayed();
        System.out.println(display_status);
        boolean enable_status = driver.findElement(By.xpath("//button[normalize-space()='START']")).isEnabled();
        System.out.println(enable_status);
        Thread.sleep(7000);
        boolean selection_status = driver.findElement(By.xpath("//input[@id='sunday']")).isSelected();
        System.out.println(selection_status);
        driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();
        Set<String> windowids = driver.getWindowHandles();
        System.out.println("window ids are " + windowids);
        Thread.sleep(7000);
        driver.quit();
    }
}
