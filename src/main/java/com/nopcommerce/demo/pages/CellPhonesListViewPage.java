package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesListViewPage extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonesListViewPage.class.getName());

    public CellPhonesListViewPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='products-wrapper']//a[@href='/nokia-lumia-1020']")
    WebElement nokiaLumia1020;


    public void clickOnNokiaLumiaLink() {
        log.info("Click on nokialumia 1020" + nokiaLumia1020.toString());
        try {
            clickOnElement(nokiaLumia1020);
        } catch (
                StaleElementReferenceException e) {
            clickOnElement(By.xpath("//div[@class='products-wrapper']//a[@href='/nokia-lumia-1020']"));
        }

    }


}
