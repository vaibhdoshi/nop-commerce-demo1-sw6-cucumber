package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerMessage;
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleRadioButton ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(css = "#Email")
    WebElement randomEmail;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @FindBy(xpath = "button[onclick='Billing.save()']")
    WebElement cityName;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
    WebElement add1;


    public String getTextFromRegisterMessage() {
        log.info("Get txt from Register message" + registerMessage.toString());
        return getTextFromElement(registerMessage);
    }

    public void clickOnFemaleRadioButton(){
        clickOnElement(femaleRadioButton);
        log.info(" click on male radio button : "+ femaleRadioButton.toString());
    }


    public void enterFirstName(String fName) {
        log.info("Enter firstname " + fName + " to firstname field " + firstName.toString());
        sendTextToElement(firstName, fName);
    }

    public void enterLastName(String lName) {
        log.info("Enter lastname " + lName + " to firstname field " + lastName.toString());
        sendTextToElement(lastName, lName);
    }


    public void enterPassword(String pWord) {
        log.info("Enter password " + pWord + " to password field" + password.toString());
        sendTextToElement(password, pWord);
    }

    public void enterConfirmPassword(String cPWord) {
        log.info("Enter confirm password " + cPWord + " to cpassword field" + confirmPassword.toString());
        sendTextToElement(confirmPassword, cPWord);
    }

    public void clickOnRegisterButton() {
        log.info("Click on registration buttton" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public void enterCityName(String cName) {
        log.info("Enter city name" + cName + " to cpassword field" + cityName.toString());
        sendTextToElement(cityName, cName);
    }

    public void enterAdd1(String adderess) {
        sendTextToElement(add1, adderess);
    }

    public void enterRandomEmailInTheEmailField(String email) {
        log.info("enter email address" + email + "in email field" + randomEmail.toString());
        sendTextToElement(randomEmail, email);
    }


}
