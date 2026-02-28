package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab006_locators_linktext_full_match {
        @Test
        public void test_link_text_full_match(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://app.vwo.com");
            WebElement a_Tag_free_trail_full_match =driver.findElement(By.linkText("Start a free trial"));
            a_Tag_free_trail_full_match.click();

        }

    }
