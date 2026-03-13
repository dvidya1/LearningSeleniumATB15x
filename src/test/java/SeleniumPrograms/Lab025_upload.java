package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab025_upload {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement upload_file= driver.findElement(By.id("fileToUpload"));
        //approach 1
        // upload_file.sendKeys("C:\\Users\\Keshav\\IdeaProjects\\LearningSeleniumATB15x\\src\\test\\java\\SeleniumPrograms\\Lab025_upload.java");

        //approach 2, saving directory
        String user_dir=System.getProperty("user.dir");
        System.out.println(user_dir);
        upload_file.sendKeys(user_dir + "\\src\\test\\java\\SeleniumPrograms\\Lab025_upload.java");

        Thread.sleep(3000);
        driver.findElement(By.name("submit")).click();
    }
}
