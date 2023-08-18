package src.site.Test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) throws InterruptedException {

        //TC #4: Google search
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        WebElement dropAgree = driver.findElement(By.cssSelector("[name='Alles accepteren']"));
        dropAgree.click();

        Thread.sleep(5000);

        //3- Write "apple" in search box
        //4- Click google search button
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

        //5- Verify title:
        //Expected: Title should start with "apple" word
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
        System.out.println("Title verification FAILED!");
        }
    }
}
