package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab019_navigate_methods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println("after back " + driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println("after forward " + driver.getCurrentUrl());

        driver.navigate().refresh();
        System.out.println(driver.getTitle());
    }
}
