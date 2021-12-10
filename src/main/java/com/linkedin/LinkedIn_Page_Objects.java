package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Note - Creating Page Object Libraries would not be necessary b/c I am doing one task
 * This program only applies jobs on CareerBuilder.com
 */
public class LinkedIn_Page_Objects {
    protected WebDriver driver; // No need to encapsulate this data b/c I'm using this from tester file

    public LinkedIn_Page_Objects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   
}
