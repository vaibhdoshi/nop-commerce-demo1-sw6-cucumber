package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingOption extends Utility {
    private static final Logger log = LogManager.getLogger(ShippingOption.class.getName());

    public ShippingOption() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement radioButton2ndDayAir;

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement radioButtonNextDayAir;

    @CacheLookup
    @FindBy(id = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButton;


    public void clickOnButton2ndDayAir() {
        log.info("Click on 2nddayAir button" + radioButton2ndDayAir.toString());
        clickOnElement(radioButton2ndDayAir);
    }

    public void clickOnContinueButton() {
        log.info("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirButton() {
        log.info("Click on next day air button" + radioButtonNextDayAir.toString());
        clickOnElement(radioButtonNextDayAir);
    }


}
