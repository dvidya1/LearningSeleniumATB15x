package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab011_web_tables {
    @Test
    public void test_lab011() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        String first_part = "//table[@id='customers']/tbody//tr[";
        String second_part = "]//td[";
        String third_part = "]";
        Integer row =driver.findElements(By.xpath("//table[@id='customers']/tbody//tr")).size();
        Integer column =driver.findElements(By.xpath("//table[@id='customers']/tbody//tr[2]//td")).size();
                        for (int i=2;i<=row;i++){
                        for (int j=1;j<=column;j++){
                            String dynamic_path = first_part+i+second_part+j+third_part;
                            System.out.println(dynamic_path);
                            String dynamic_path_text = driver.findElement(By.xpath(dynamic_path)).getText();
                            System.out.println(dynamic_path_text);
                            if(dynamic_path_text.contains("Helen Bennett")){
                                String country = dynamic_path+ "/following-sibling::td";
                                String country_text =driver.findElement(By.xpath(country)).getText();
                                String company = dynamic_path+ "/preceding-sibling::td";
                                String company_text =driver.findElement(By.xpath(company)).getText();
                                System.out.println("Helen Bennett works in " + country_text + " works for " + company_text);
                            }
                        }

        }
    }
}
