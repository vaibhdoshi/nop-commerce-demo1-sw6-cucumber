package com.nopcommerce.demo;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartDisplayMessage;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsAndConditionsBox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityBox;
    @CacheLookup
    @FindBy(xpath = "//div[@class='common-buttons']/child::button[1]")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement totalAmount;

    @CacheLookup
    @FindBy(xpath = "termsofservice")
    WebElement tAndCBox;

    @CacheLookup
    @FindBy(css = "button[onclick='Billing.save()']")
    WebElement continueButton;


    public String getTextFromDisplayMessage() {
        return getTextFromElement(shoppingCartDisplayMessage);
    }


    public void clearTheQuantityField() {
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
    }

    public void updateTheQuantityField(String quantity) {
        log.info("Updat the quantity field" + quantity.toString());
        sendTextToElement(quantityBox, quantity);
    }

    public void clickOnUpdateShoppingCart() {
        log.info("Click on Update shopping cart" + updateShoppingCart.toString());
        clickOnElement(updateShoppingCart);
    }

    public String getTextFromAmountElement() {
        log.info("Get tect from amount element" + totalAmount.toString());
        return getTextFromElement(totalAmount);
    }

    public void clickOnTermsAndConditionsAgreeBox() {
        log.info("click on term and conditions agreebox" + termsAndConditionsBox.toString());
        clickOnElement(termsAndConditionsBox);
    }

    public void clickOnCheckoutButton() {
        log.info("click on checkout button" + checkoutButton.toString());
        clickOnElement(checkoutButton);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }


}
