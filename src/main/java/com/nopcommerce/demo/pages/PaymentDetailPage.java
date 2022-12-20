package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetailPage extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentDetailPage.class.getName());

    public PaymentDetailPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCard;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expiryMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expiryYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton;

    public void selectCreditCardType(int index) {
        log.info("Select creditcard type" + creditCard.toString());
        selectByIndexFromDropDown(creditCard, index);
    }

    public void inputCardHoldersName(String name) {
        log.info("inputeCared holders name" + cardHolderName.toString());
        sendTextToElement(cardHolderName, name);
    }

    public void inputCardNumber(String num) {
        log.info("Input card number" + cardNumber.toString());
        sendTextToElement(cardNumber, num);
    }

    public void inputExpireMonth(String mon) {
        log.info("Inpute ExpireMonth" + expiryMonth.toString());
        sendTextToElement(expiryMonth, mon);
    }

    public void inputExpireYear(String yr) {
        log.info("Input expire year" + yr + "to field" + expiryYear.toString());
        sendTextToElement(expiryYear, yr);
    }

    public void inputCardCode(String code) {
        log.info("input card code" + cardCode.toString());
        sendTextToElement(cardCode, code);
    }

    public void clickOnContinueButton() {
        log.info("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }


}
