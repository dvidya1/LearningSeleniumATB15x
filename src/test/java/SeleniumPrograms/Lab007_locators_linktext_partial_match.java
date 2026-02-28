package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab007_locators_linktext_partial_match {
    @Test
    public void test_link_text_partial_match(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        WebElement a_tag_partial_match =driver.findElement(By.partialLinkText("Start a f"));
        a_tag_partial_match.click();

    }
}

