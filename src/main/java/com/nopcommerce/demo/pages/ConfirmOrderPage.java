package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrderPage extends Utility {
    private static final Logger log = LogManager.getLogger(ConfirmOrderPage.class.getName());
    public ConfirmOrderPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement creditCard;

    @CacheLookup
    @FindBy(css = "li[class='shipping-method'] span[class='value']")
    WebElement shippingMethod;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$698.00')]")
    WebElement totalAmount;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$2,950.00')]")
    WebElement totalAmountComputers;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;


    public String getTextFromPaymentMethodText() {
        log.info("Get tect from payment method text");
        return getTextFromElement(creditCard);
    }

    public String getTextFromShippingMethodText() {
        log.info("Get text from shipping method text" + shippingMethod.toString());
        return getTextFromElement(shippingMethod);
    }

    public String getTextFromTotalAmountField() {
        log.info("get text from toal amountfield" + totalAmount.toString());
        return getTextFromElement(totalAmount);
    }
    public String getTextFromTotalAmountComputersField() {
        log.info("Get text from total Amount computers field" + totalAmountComputers.toString());
        return getTextFromElement(totalAmountComputers);
    }

    public void clickOnConfirmButton() {
        log.info("click on confirm button" + confirmButton.toString());
        clickOnElement(confirmButton);
    }




}
