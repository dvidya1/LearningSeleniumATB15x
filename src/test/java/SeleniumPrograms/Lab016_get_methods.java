package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Lab016_get_methods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //get() //opens url on the browser
        driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //getTitle() //returns title of the web page
        System.out.println(driver.getTitle());

        //getCurrentUrl()) //returns url of the page
        System.out.println(driver.getCurrentUrl());

        //getPageSource() //returns source code of the page
       // System.out.println(driver.getPageSource());

        //getWindowHandle(); //returns id of the single browser window
       System.out.println("window id is " + driver.getWindowHandle());
        Thread.sleep(7000);


        //getWindowHandles() //returns ids of the multiple browser windows
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //opens another broswer by clicking
        Set<String> windowids = driver.getWindowHandles();
        System.out.println("window ids are " + windowids);
    }

}
