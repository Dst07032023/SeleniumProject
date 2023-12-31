package src.site.Test.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {
        //TC #5:	Basic	login	authentication
        //1- Open	a	chrome	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go	to:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3- Verify	title	equals:
        //Expected:	Web	Orders	Login
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Login page title verification PASSED!");
        }else{
            System.out.println("Login page title verification FAILED!!!");

        }
        //4- Enter	username:	Tester
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");

        //5- Enter	password:	test
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");
        //6- Click	“Sign	In”	button
        //7- Verify	title equals:
        //Expected:	Web	Orders

    }
}
