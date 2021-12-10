package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Login Page - https://prnt.sc/snwdgj 
 * https://www.pluralsight.com/guides/getting-started-with-page-object-pattern-for-your-selenium-tests 
 * Page Objects for Login Page 
 */

public class LinkedIn_Job_Page extends LinkedIn_Page_Objects {
    // instance variables 
    @FindBy(css = "input[id ^='jobs-search-box-keyword-id-ember']") 
    private WebElement jobTitle;

    @FindBy(css = "input[id ^='jobs-search-box-location-id-ember']") 
    private WebElement jobLocation;

    @FindBy(className = "jobs-search-box__submit-button")
    private WebElement searchButton;

    public LinkedIn_Job_Page(WebDriver driver){
        super(driver); 
    }

    public void enterJobTitleAndLocation(String jobTitle, String jobLocation){
        this.jobTitle.clear();
        this.jobTitle.sendKeys(jobTitle);

        this.jobLocation.clear();
        this.jobLocation.sendKeys(jobLocation);
    }
    public LinkedIn_Job_Page search(){
        searchButton.click();
        return new LinkedIn_Job_Page(driver);
    }
}