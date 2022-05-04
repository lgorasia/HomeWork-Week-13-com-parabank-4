package com.parasoft.parabank.pages;


import com.parasoft.parabank.utility.Utility;
import com.sun.org.apache.bcel.internal.classfile.Code;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By signUpIsEasyDisplayField = By.xpath("//h1[@class='title']");
    By firstNameField =By.id("customer.firstName");
    By lastNameField = By.id("customer.lastName");
    By addressField =By.id("customer.address.street");
    By cityField = By.id("customer.address.city");
    By stateField =By.id("customer.address.state");
    By zipcodeField =By.id("customer.address.zipCode");
    By phoneNumberField = By.id("customer.phoneNumber");
    By snnField = By.id("customer.ssn");
    By userNameField = By.id("customer.username");
    By passwordField = By.id("customer.password");
    By confirmPasswordField = By.id("repeatedPassword");
    By registerButton = By.xpath("//input[@value='Register']");
    By accountCreatedSuccessfullyField =By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");



    public String signUpDispaly(){
        return getTextFromElement(signUpIsEasyDisplayField);
    }
    public void enterFirstName(String firstname){
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void enterAddress(String address){
        sendTextToElement(addressField,address);
    }
    public void enterCity(String city){
        sendTextToElement(cityField,city);
    }
    public void enterState(String state){
        sendTextToElement(stateField,state);
    }
    public void enterZipcode(String zipCode){
        sendTextToElement(zipcodeField,zipCode);
    }
    public void enterPhoneNumber(String phoneNumber){
        sendTextToElement(phoneNumberField,phoneNumber);
    }
    public void enterSnnField(String snn){
        sendTextToElement(snnField,snn);
    }
    public void enterUserName(String username){
        sendTextToElement(userNameField,username);
    }
    public void enterPassWord(String password){
        sendTextToElement(passwordField,password);
    }
    public void reEnterPassword( String rePassword){
        sendTextToElement(confirmPasswordField,rePassword);
    }
    public void clickOnRegistrationButton(){
        clickOnElement(registerButton);
    }
    public String accoutCreatedSuccessfully(){
        return getTextFromElement(accountCreatedSuccessfullyField);
    }





}
