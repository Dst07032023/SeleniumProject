package src.site.Test.day3_reviews_prctices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practie_1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://ok.ru/");

        WebElement dropAgree = driver.findElement(By.xpath("//*[.='Accept all']"));
        dropAgree.click();

        Thread.sleep(3000);

        WebElement inputUserName = driver.findElement(By.id("field_email"));
        inputUserName.sendKeys("asjaasfsfkhakfkkl");

        WebElement inputPassword = driver.findElement(By.id("field_password"));
        inputPassword.sendKeys("23deddads" + Keys.ENTER);

        String expectedTitle ="OK social network. Communication with friends on OK. Your meeting place with classmates";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");

        }
        driver.close();
    }
}
