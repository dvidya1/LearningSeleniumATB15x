package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab024_drag_drop_action {
    public static void main(String[] args) {
       // program 1
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        Actions drag_action = new Actions(driver);
        WebElement a= driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement b= driver.findElement(By.xpath("//div[@id='column-b']"));
        drag_action.dragAndDrop(a,b).build().perform();

        //program 2
        driver.navigate().to("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        WebElement firstname= driver.findElement(By.name("firstname"));
        Actions firstname_action=new Actions(driver);
        firstname_action.keyDown(Keys.SHIFT).sendKeys(firstname,"automation").keyUp(Keys.SHIFT).build().perform();


    }
}

