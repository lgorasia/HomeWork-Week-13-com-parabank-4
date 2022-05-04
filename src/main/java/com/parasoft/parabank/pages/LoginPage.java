package com.parasoft.parabank.pages;


import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By registerLink = By.linkText("Register");
    By userNamefield = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@value='Log In']");
    By accoutOverviewField = By.xpath("//h1[contains(text(),'Accounts Overview')]");
    By loginErrorField = By.xpath("//p[contains(text(),'The username and password could not be verified.')]");
    By logOutField = By.xpath("//a[contains(text(),'Log Out')]");
    By customerLoginField = By.xpath("//h2[contains(text(),'Customer Login')]");


    public void clickOnRegisterButton() {
        clickOnElement(registerLink);
    }

    public void enterUserName(String username) {
        sendTextToElement(userNamefield, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLogin() {
        clickOnElement(loginButton);
    }

    public String accoutOverview() {
        return getTextFromElement(accoutOverviewField);
    }

    public String longinError() {
       return getTextFromElement(loginErrorField);
    }
    public void logOut(){
        clickOnElement(logOutField);
    }
    public String customerLogin(){
        return getTextFromElement(customerLoginField);
    }




}
