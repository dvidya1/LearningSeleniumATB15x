package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Lab021_check_box {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //single check box
        driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //all check box
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
         for (int i=0;i<checkboxes.size();i++) {
          checkboxes.get(i).click();
          }

      //  check last 3 check box
          for (int i=checkboxes.size()-1;i>=checkboxes.size()-3;i--) {
         checkboxes.get(i).click();
    }
        //uncheck selected ones
        for (int i=0;i<=3;i++) {
                checkboxes.get(i).click();
        }
Thread.sleep(3000);
        for (int i=0;i<=3;i++) {
         if(checkboxes.get(i).isSelected()){
             checkboxes.get(i).click();
         }
        }


}

}
