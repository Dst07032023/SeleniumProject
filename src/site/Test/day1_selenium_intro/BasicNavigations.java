package src.site.Test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium web driver
        //this line opens a browser
        WebDriver driver = new ChromeDriver();

        //3- get the page for Tesla.com
        driver.get("https://www.tesla.com");

        //puting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(3000);

        //Going back using navigations
        driver.navigate().back();

        //puting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(3000);

        //Going forward using navigations
        driver.navigate().forward();

        //puting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(3000);

        //refreshing the page using navigations
        driver.navigate().refresh();

        //going to another url using . to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: " + driver.getTitle());


    }

}
