package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab026_action_program1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.spicejet.com/");
        driver.manage().window().maximize();
        Actions origin_destination = new Actions(driver);
        WebElement origin = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']"));
        WebElement destination = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input[@type='text']"));
        origin_destination.moveToElement(origin).click().sendKeys("AGR").moveToElement(destination).click().sendKeys("AMD").build().perform();
    }
}