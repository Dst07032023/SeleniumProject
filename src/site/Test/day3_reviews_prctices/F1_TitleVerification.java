package src.site.Test.day3_reviews_prctices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: Facebook title verification
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

        //3. Verify title:
        //Expected: "Facebook - Log In or Sign up"
        String expectedTitle = "Facebook - log in or sign up";

        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!!!");

        }
        driver.close();
    }
}
