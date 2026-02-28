package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Lab004_navigation {
    @Test
        public void testnavigation() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
     driver.navigate().to("https://www.bing.com/");
     driver.navigate().back();
     driver.navigate().refresh();
     driver.navigate().forward();
     driver.quit();
    }
}
