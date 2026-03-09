package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab015_tta_bank_project{
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement signup = driver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
        signup.click();
        WebElement signup_fullname = driver.findElement(By.xpath("//input[@placeholder='John Doe' and @type='text']"));
        signup_fullname.sendKeys("awdth");
        WebElement signup_email = driver.findElement(By.xpath("//input[@placeholder='you@example.com' and @type='email']"));
        signup_email.sendKeys("awdth@awdth.com");
        WebElement signup_password = driver.findElement(By.xpath("//input[@type='password']"));
        signup_password.sendKeys("awdth");
        WebElement signup_create = driver.findElement(By.xpath("//button[text()='Create Account']"));
        signup_create.click();
        Thread.sleep(5000);
        WebElement total_balance_before = driver.findElement(By.xpath("//p[@class='text-blue-100 text-sm font-medium']"));
        System.out.println("total_balance_before is " + total_balance_before.getText());
        Thread.sleep(5000);
        WebElement transfer_funds = driver.findElement(By.xpath("//button[normalize-space()='Transfer Funds']"));
        transfer_funds.click();
        Thread.sleep(5000);
        WebElement transfer_funds_amount = driver.findElement(By.xpath("//input[@placeholder='0.00' and @type='number']"));
        transfer_funds_amount.sendKeys("100");
        WebElement transfer_funds_note = driver.findElement(By.xpath("//input[@placeholder='e.g. Rent for October' and @type='text']"));
        transfer_funds_note.sendKeys("test");
        WebElement transfer_funds_continue= driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
        transfer_funds_continue.click();
        WebElement transfer_funds_confirm_transfer= driver.findElement(By.xpath("//button[normalize-space()='Confirm Transfer']"));
        transfer_funds_confirm_transfer.click();
        Thread.sleep(5000);
        WebElement dashboard = driver.findElement(By.xpath("//button[normalize-space()='Dashboard']"));
        dashboard.click();
        Thread.sleep(7000);
        WebElement total_balance_after = driver.findElement(By.xpath("//p[@class='text-blue-100 text-sm font-medium']"));
        System.out.println("total_balance_after is " + total_balance_after.getText());






    }
}
