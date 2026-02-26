package SeleniumPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab001 {
    public static void main(String[] args) {
       ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com");
        String actualtitle= driver.getTitle();
        if(actualtitle.equals("Login - VWO")) {
            System.out.println("test case passed");
        }else{
            System.out.println("test case failed");
        }
        driver.close();
    }
}
