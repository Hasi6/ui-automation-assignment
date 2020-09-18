package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginPage.java - class to verify Login Page functions Created by SrirankanK
 * on 10/3/2018.
 */
public class LoginPage extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
    private static By usernameText = By.id("username");
    private static By passwordText = By.id("password");
    private static By submitButton = By.xpath("//button[@type='submit']");

    public static void setUsernamePassword(String userName,String password){
        getDriver().findElement(usernameText).sendKeys(userName);
        getDriver().findElement(passwordText).sendKeys((password));
    }

    public static void clickSubmit(){
        getDriver().findElement(submitButton).click();
    }
}
