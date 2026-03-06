package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab013_chained_xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        boolean image_status = driver.findElement(By.xpath("//div[@id='nav-logo']/a[@id='nav-logo-sprites']")).isDisplayed();
        System.out.println(image_status);
    }
}
