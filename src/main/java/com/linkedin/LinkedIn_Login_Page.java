package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Login Page - https://prnt.sc/snwdgj 
 * https://www.pluralsight.com/guides/getting-started-with-page-object-pattern-for-your-selenium-tests 
 * Page Objects for Login Page 
 */

public class LinkedIn_Login_Page extends LinkedIn_Page_Objects {
    // instance variables 

    
    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "button[type='submit'][class='btn__primary--large from__button--floating']")
    private WebElement loginButton;

    public LinkedIn_Login_Page(WebDriver driver){
        super(driver); 
    }

    public LinkedIn_Login_Page login(){
        loginButton.click();
        return new LinkedIn_Login_Page(driver); 
    }

    public boolean isInitialized(){
        return userName.isDisplayed();
    }

    public void enterUserName(String userName){
        this.userName.clear();
        this.userName.sendKeys(userName);
    }

    public void enterPassword(String password){
        this.password.clear();
        this.password.sendKeys(password);
    }
}