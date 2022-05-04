package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LonginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
   // loginPage.clickOnLogin();
    loginPage.enterUserName("Abc_156789");
    loginPage.enterPassword("123456789");
    loginPage.clickOnLogin();
    String expectedText = "Accounts Overview";
    String actualText = loginPage.accoutOverview();
    Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void verifyTheErrorMessage(){
        loginPage.enterUserName("abd1254ldk");
        loginPage.enterPassword("987654321");
        loginPage.clickOnLogin();
        String actualText = loginPage.longinError();
        String expectedText = "The username and password could not be verified.";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        loginPage.enterUserName("Abc_156789");
        loginPage.enterPassword("123456789");
        loginPage.clickOnLogin();
        loginPage.logOut();
        String actualText = loginPage.customerLogin();
        String expectedText ="Customer Login";
        Assert.assertEquals(actualText,expectedText);


    }
}
