package src.site.Test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

            //1- set up the web driver
            WebDriverManager.chromedriver().setup();
            //System.setProperty("chrome","path of where you saved the driver");

            //2- create the instance of the chrome driver
            WebDriver driver = new ChromeDriver();

            //3- test if driver is working
            driver.get("https://google.com");

        WebElement dropAgree = driver.findElement(By.xpath ("//*[.='Alles accepteren']"));
        dropAgree.click();

        Thread.sleep(3000);
    }
}
