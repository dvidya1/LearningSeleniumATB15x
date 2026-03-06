package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab012_xpath_attribute_types {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //xpatch with one atrribute
      //driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("large plastic bags");

        //xpatch with multiple attribute
       //  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'][@name='field-keywords']")).sendKeys("large plastic bags");

        //xpatch with multiple attributes using and / or operator
        //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']")).sendKeys("large plastic bags");
      // driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']")).sendKeys("large plastic bags");

        //xpath with contains
      // driver.findElement(By.xpath("//input[contains (@name,'field-')]")).sendKeys("large plastic bags");

        //xpath with starts with
        //driver.findElement(By.xpath("//input[starts-with (@name,'field')]")).sendKeys("large plastic bags");

    }
}
