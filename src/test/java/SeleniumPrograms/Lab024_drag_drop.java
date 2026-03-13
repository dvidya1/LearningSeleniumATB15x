package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab024_drag_drop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        Actions drag_action = new Actions(driver);
        WebElement a= driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement b= driver.findElement(By.xpath("//div[@id='column-b']"));
        drag_action.dragAndDrop(a,b).build().perform();

    }
}

