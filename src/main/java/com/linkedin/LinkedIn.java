package com.linkedin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Functional Test
 * @see https://www.pluralsight.com/guides/getting-started-with-page-object-pattern-for-your-selenium-tests
 * This is the 'One Driver to Rule them All'(LOTR) idea 
 */
public class LinkedIn
{
    protected static WebDriver driver; 

    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/oscarleung/Selenium Drivers/chromedriver"); 
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
    }

    public static void cleanUp() {
        driver.manage().deleteAllCookies(); 
    }

    public static void tearDown(){
        driver.close();
    }
}
