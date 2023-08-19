package src.site.Test.day3_reviews_prctices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #4: Facebook header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        WebElement dropAgree = driver.findElement(By.xpath ("//*[.='Allow all cookies']"));
        dropAgree.click();

        Thread.sleep(3000);

        //3. Verify “Create a page” link href value contains text:
        //Expected: “registration_form”
    }
}
