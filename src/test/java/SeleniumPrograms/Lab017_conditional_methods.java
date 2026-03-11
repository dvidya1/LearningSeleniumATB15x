package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab017_conditional_methods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        //isdisplayed() //we can check display status of elelment
        boolean logo_status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("status of logo is " + logo_status);

        //isdisplayed() //we can check enable/disable status of operational element
        boolean register_button_check = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
        System.out.println("register_button status " + register_button_check);

        //isselected() //we can use to check if element is selected
        boolean newslettet_validation_check = driver.findElement(By.xpath("//input[@id='NewsLetterSubscriptions_0__IsActive']")).isSelected();
        System.out.println("newsletter validation check status " + newslettet_validation_check);
        Thread.sleep(3000);


        //using isselected in a small program when manually clicked
        System.out.println("Before gender selection");
        WebElement gender_male=driver.findElement(By.xpath("//input[@id='gender-male']"));
        System.out.println(gender_male.isSelected());

        WebElement gender_female=driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println(gender_female.isSelected());

        WebElement first_name=driver.findElement(By.id("FirstName"));
        first_name.sendKeys("test");
        Thread.sleep(3000);

        System.out.println("After gender selection");
        WebElement gender_male_after=driver.findElement(By.xpath("//input[@id='gender-male']"));
        System.out.println(gender_male_after.isSelected());

        WebElement gender_female_after=driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println(gender_female_after.isSelected());




    }

}
