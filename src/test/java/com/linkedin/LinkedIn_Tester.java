package com.linkedin;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



class LinkedInTester extends LinkedIn {
    public static void main(String[] args) throws InterruptedException {
        LinkedIn.setUp();
        driver.get("https://www.linkedin.com/login");
        

        LinkedIn_Login_Page llp = new LinkedIn_Login_Page(driver);
        llp.enterUserName("oscarleung1@gmail.com");
        llp.enterPassword("Bumblebee1");
        llp.login();

        driver.findElement(By.cssSelector("a[data-test-global-nav-link='jobs']")).click();

        LinkedIn_Job_Page ljp = new LinkedIn_Job_Page(driver);
        ljp.enterJobTitleAndLocation("Software Quality Assurance", "San Francisco Bay Area");
        driver.findElement(By.className("msg-overlay-bubble-header")).click(); 
        ljp.search();

        // System.out.println("The current title is: " + driver.getTitle());
        // System.out.println("The current url is: " + driver.getCurrentUrl());
        // for each data-job-id by iterating the li, check if it contains easy apply, and

        List <WebElement> lst = driver.findElements(By.cssSelector("li[id ^= 'ember'][class = 'occludable-update artdeco-list__item--offset-2 artdeco-list__item p0 ember-view']"));
        System.out.println("The size of the list of web elements is " + lst.size());
    }
}
