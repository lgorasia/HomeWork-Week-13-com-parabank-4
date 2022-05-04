package com.parasoft.parabank.testsuite;


import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay(){
        loginPage.clickOnRegisterButton();
        String actualText =registerPage.signUpDispaly();
        String expectedText = "Signing up is easy!";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        loginPage.clickOnRegisterButton();
        registerPage.enterFirstName("Pavann");
        registerPage.enterLastName("Kumarr");
        registerPage.enterAddress("28 ABC Street");
        registerPage.enterCity("London");
        registerPage.enterState("Gujarat");
        registerPage.enterZipcode("382345");
        registerPage.enterPhoneNumber("1234567891");
        registerPage.enterSnnField("A2315DHV215");
        registerPage.enterUserName("Abc_156789");
        registerPage.enterPassWord("123456789");
        registerPage.reEnterPassword("123456789");
        registerPage.clickOnRegistrationButton();
        String actualText =registerPage.accoutCreatedSuccessfully();
        String expectedText= "Your account was created successfully. You are now logged in.";
        Assert.assertEquals(actualText,expectedText);


    }
}
