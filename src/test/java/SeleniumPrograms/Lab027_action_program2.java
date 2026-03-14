package SeleniumPrograms;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab027_action_program2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://www.booking.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Actions origin_destination_boking_com = new Actions(driver);
        WebElement flights = driver.findElement(By.xpath("//a[@id='flights']"));
        origin_destination_boking_com.moveToElement(flights).click().build().perform();
        Thread.sleep(3000);
        WebElement going_to = driver.findElement(By.xpath("//span[@class='ShellButton-module__content___UQ5tr']"));
        origin_destination_boking_com.moveToElement(going_to).click().build().perform();
        Thread.sleep(3000);
            WebElement going_to_name=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@role='combobox']")));
        going_to_name.sendKeys("DEL");
        Thread.sleep(3000);
            going_to_name.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Explore']")).click();
    }
}
