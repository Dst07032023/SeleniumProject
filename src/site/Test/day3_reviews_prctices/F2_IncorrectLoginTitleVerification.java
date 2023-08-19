package src.site.Test.day3_reviews_prctices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //use the 'driver' object created to use selenium methods
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        WebElement dropAgree = driver.findElement(By.xpath ("//*[.='Allow all cookies']"));
        dropAgree.click();

        Thread.sleep(3000);

        //Locating the web element using id locator and stories it in WebElement type.
        WebElement inputUsername = driver.findElement(By.id("email"));

        //3. Enter incorrect username
        inputUsername.sendKeys("something1213@gmail.com");

        //Locate the web element using
        WebElement inputPassword = driver.findElement(By.id("pass"));

        //4. Enter incorrect password
        inputPassword.sendKeys("some wrong password" + Keys.ENTER);

        //5. Verify title changed to:
        //Expected: "Log into Facebook"


    }
}
