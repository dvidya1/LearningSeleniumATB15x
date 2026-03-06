package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab014_css {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();
    //css id //tag id //tag#id
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("computers");
        //tag is not compulsory can be removed too
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("computers");

        //css class //tag class //tag.classname
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("computers");
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("computers");

        //css attribute //tag attribute //tag[attribute="value"]
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("computers");
        //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("computers");

        //css classname and attribute //tag classname attribute //tag.classname[attribute="value"]
        //driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("computers");
        //driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("computers");

    }
}
