package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages {

    private WebDriver driver;

    //1. By Locators

    private By emailID = By.id("email");
    private By password = By.id("passwd");
    private By signInButton = By.id("submit login");
    private By forgotpasswordlink = By.id("forgotpassword");



    //2. Constructor on the Page Class

    public  LoginPages(WebDriver driver){
        this.driver = driver;

    }


    //3.Page actions

    public String getLoginPageTitle(){
       return driver.getTitle();
    }

    public boolean isForgotPasswordLinkExist(){
      return  driver.findElement(forgotpasswordlink).isDisplayed();

    }

    public void enterUserName(String username){
    driver.findElement(emailID).sendKeys(username);
    }

    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickOnLogin(){
        driver.findElement(signInButton).click();
    }


}
