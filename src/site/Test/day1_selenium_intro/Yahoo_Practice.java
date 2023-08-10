package src.site.Test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args) throws InterruptedException {


        //TC #1: Yahoo Title Verification
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        //This line opens EMPTY BROWSER
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");
        WebElement dropAgree = driver.findElement(By.cssSelector("[name='agree']"));
        dropAgree.click();

        Thread.sleep(5000);

        //3. Verify title:
        //Expected: Yahoo
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        System.out.println("expectedTitle = " + expectedTitle);

        //actual value
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //creating our verification
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!!!");
        }

        //closing the browser
//        driver.close();
    }
}
