package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage extends Utility {

    private static final Logger log = LogManager.getLogger(BillingPage.class.getName());

    public BillingPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = " //select[@id='BillingNewAddress_CountryId']")
    WebElement countryName;
    @CacheLookup
    @FindBy(xpath = " //input[@id='BillingNewAddress_City']")
    WebElement cityName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement add1;
    @CacheLookup
    @FindBy(xpath = " //input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postalCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement pNumber;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Email")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;

    public void selectCountryName(String countryName) {
        log.info("select country" + country.toString());
        selectByVisibleTextFromDropDown(country, countryName);
    }


    public void enterCityName(String cName) {
        log.info("Enter city name" + cName + " to cpassword field" + cityName.toString());
        sendTextToElement(cityName, cName);
    }

    public void enterAdd1(String adderess) {
        log.info("Enter Adderess" + adderess + " to cpassword field" + add1.toString());
        sendTextToElement(add1, adderess);
    }

    public void enterPostalCode(String pCode) {
        log.info("Enter postal code" + pCode + " to cpassword field" + postalCode.toString());
        sendTextToElement(postalCode, pCode);
    }

    public void enterPhoneNumber(String number) {
        log.info("Enter Phone number" + number + " to cpassword field" + pNumber.toString());
        sendTextToElement(pNumber, number);
    }

    public void clickOnContinueButton() {
        log.info("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void enterNameInTheFirstNameField(String name) {
        log.info("Enter First name +" + name + "to first name field" + firstName.toString());
        sendTextToElement(firstName, name);

    }

    public void enterLastNameInTheLastNameField(String lastname) {
        log.info("Enter last name " + lastname + " to cpassword field" + lastname.toString());
        sendTextToElement(lastName, lastname);

    }

    public void enterRandomEmailInTheEmailField() {
        log.info("Enter email" + email.toString());
        sendTextToElement(email, getRandomString(4));
    }

    public void waitForElement() {
        waitUntilVisibilityOfElementLocated(By.cssSelector("#BillingNewAddress_City"), 2000);
    }

    public void selectCountry(String cName) {
        selectByVisibleTextFromDropDown(countryName, cName);
    }

}
