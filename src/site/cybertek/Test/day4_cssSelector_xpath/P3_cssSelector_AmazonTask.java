package src.site.cybertek.Test.day4_cssSelector_xpath;

import org.openqa.selenium.WebDriver;
import src.site.cybertek.utilities.WebDriverFactory;

public class P3_cssSelector_AmazonTask {

    public static void main(String[] args) {

        //TC #3: Amazon link number verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Enter search term (use cssSelector to locate search box)
        //4. Verify title contains search term
    }
}
