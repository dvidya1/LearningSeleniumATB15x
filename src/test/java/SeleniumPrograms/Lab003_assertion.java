package SeleniumPrograms;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
public class Lab003_assertion {
@Test
    public void testassertion() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
assertThat(driver.getCurrentUrl()).isNotBlank().isNotEmpty().isEqualTo("https://www.google.com/");

}
}
