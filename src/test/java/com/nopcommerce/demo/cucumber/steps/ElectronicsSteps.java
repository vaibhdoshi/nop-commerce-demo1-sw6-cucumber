package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ElectronicsSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^I mouse hover on electronics tab,cell phone tab andd click$")
    public void iMouseHoverOnElectronicsTabCellPhoneTabAnddClick() {
        new ElectronicsCellPhonesPage().mouseHoverOnElectronicPageAndClick();
    }


    @Then("^I should navigate to cell phone page successfully$")
    public void iShouldNavigateToCellPhonePageSuccessfully() {
        String expectedText = "Cell phones";
        Assert.assertEquals("message not displayed correctly", expectedText, new ElectronicsCellPhonesPage().getCellPhonesPageWelcomeText());
    }


    @And("^I click on list view tab$")
    public void iClickOnListViewTab() {
        new ElectronicsCellPhonesPage().clickOnTheListViewTab();
    }

    @And("^I click Nokia Lumia$")
    public void iClickNokiaLumia() {
        new CellPhonesListViewPage().clickOnNokiaLumiaLink();
    }


    @And("^I verify Nokia Lumia product text$")
    public void iVerifyNokiaLumiaProductText() {
        String expectedText = "Nokia Lumia 1020";
        Assert.assertEquals("Text is not matched", expectedText, new CellphoneListViewNokiaLumiaPage().getTextFromNokiaLumiaDisplayText());

    }

    @And("^I verify the product price$")
    public void iVerifyTheProductPrice() {
        String expectedText = "$349.00";
        Assert.assertEquals("price is not matched", expectedText, new CellphoneListViewNokiaLumiaPage().getTextFromNokiaLumiaPrice());
    }

    @And("^I cleared quantity field$")
    public void iClearedQuantityField() {
        new CellphoneListViewNokiaLumiaPage().clearTheQuantityField();
    }

    @And("^I changed quantity to two$")
    public void iChangedQuantityToTwo() {
        new CellphoneListViewNokiaLumiaPage().UpdatedQuantityForNokiaLumia1020("2");
    }

    @And("^I click on add to cart button tab$")
    public void iClickOnAddToCartButtonTab() {
        new CellphoneListViewNokiaLumiaPage().clickOnNokiaLumiaAddToCartButton();
    }

    @And("^I mouse hover on shopping cart$")
    public void iMouseHoverOnShoppingCart() {
        new CellphoneListViewNokiaLumiaPage().mouseHoverOnNokiaLumiaShoppingCartButton();

    }

    @And("^I click on go to cart button$")
    public void iClickOnGoToCartButton() {
        new CellphoneListViewNokiaLumiaPage().clickOnNokiaLumiaGoToCartButton();

    }


    @And("^I verify product has been added to your shopping cart$")
    public void iVerifyProductHasBeenAddedToYourShoppingCart() {
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertEquals("Add to Cart Message is not displayed correctly", expectedText, new CellphoneListViewNokiaLumiaPage().getProductAddedToCartMessage());
    }

    @And("^I click on cross button$")
    public void iClickOnCrossButton() {
        new CellphoneListViewNokiaLumiaPage().closeTheGreenBarByClickingTheCrossButton();
    }


    @And("^I verify message Shopping cart$")
    public void iVerifyMessageShoppingCart() {
        String expectedText = "Shopping cart";
        Assert.assertEquals("Not Matching", expectedText, new ShoppingCartPage().getTextFromDisplayMessage());
    }

    @And("^I verify total$")
    public void iVerifyTotal() {
        String expectedText = "$698.00";
        Assert.assertEquals("Not matching", expectedText, new ShoppingCartPage().getTextFromAmountElement());
    }

    @And("^I click on update shopping cart button$")
    public void iClickOnUpdateShoppingCartButton() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }


    @And("^i click on checkbox terms of service$")
    public void iClickOnCheckboxTermsOfService() {
        new ShoppingCartPage().clickOnTermsAndConditionsAgreeBox();
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @Then("^I verify welcome,please sign in!$")
    public void iVerifyWelcomePleaseSignIn() {
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals("Not Matching", expectedText, new SignInPage().getTextFromWelcomeMessage());

    }

    @And("^I click on Register tab$")
    public void iClickOnRegisterTab() {
        new SignInPage().clickOnRegisterTab();
    }

    @And("^I verify Register text$")
    public void iVerifyRegisterText() {
        String expectedMessage = "Register";
        Assert.assertEquals("Not Matching", expectedMessage, new RegistrationPage().getTextFromRegisterMessage());
    }

    @And("^I click on female radio button$")
    public void iClickOnFemaleRadioButton() {
        new RegistrationPage().clickOnFemaleRadioButton();
    }

    @And("^I enter first name$")
    public void iEnterFirstName() {
        new RegistrationPage().enterFirstName("Rahul" + Utility.getRandomString(5));
    }

    @And("^I enter last name$")
    public void iEnterLastName() {
        new RegistrationPage().enterLastName("Doshi" + Utility.getRandomString(5));
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() {
        new RegistrationPage().enterRandomEmailInTheEmailField("rahul123" + Utility.getRandomString(8) + "@gmail.com");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new RegistrationPage().enterPassword("test123");
    }

    @And("^I enter confirm Password$")
    public void iEnterConfirmPassword() {
        new RegistrationPage().enterConfirmPassword("test123");
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegistrationPage().clickOnRegisterButton();
    }

    @And("^I verify the message your registration completed$")
    public void iVerifyTheMessageYourRegistrationCompleted() {
        String expectedText = "Your registration completed";
        Assert.assertEquals("Not matching", expectedText, new RegistrationCompletePage().getTextFromRegisterationCompleteMessage());
    }

    @And("^I click on continue tab$")
    public void iClickOnContinueTab() {
        new RegistrationCompletePage().clickOnTheContinueButton();
    }

    @And("^I verify text shopping cart$")
    public void iVerifyTextShoppingCart() {
        String expectedText = "Shopping cart";
        Assert.assertEquals("Message is not displyed", expectedText, new ShoppingCartPage().getTextFromDisplayMessage());
    }

    @And("^I click on checkbox agree with terms of service$")
    public void iClickOnCheckboxAgreeWithTermsOfService() {
        new ShoppingCartPage().clickOnTermsAndConditionsAgreeBox();
    }

    @And("^I enter city name$")
    public void iEnterCityName() {
        new BillingPage().enterCityName("London");
    }

    @And("^I enter home address$")
    public void iEnterHomeAddress() {
        new BillingPage().enterAdd1("125 camerose avenue");

    }

    @And("^I enter postcode$")
    public void iEnterPostcode() {
        new BillingPage().enterPostalCode("HA11AY");
    }

    @And("^I enter phone number$")
    public void iEnterPhoneNumber() {
        new BillingPage().enterPhoneNumber("07712345678");
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new BillingPage().clickOnContinueButton();
    }

    @And("^I click on second day air radio button$")
    public void iClickOnSecondDayAirRadioButton() {
        new ShippingOption().clickOnButton2ndDayAir();
    }

    @And("^click on continue button$")
    public void clickOnContinueButton() {
        new ShippingOption().clickOnContinueButton();
    }

    @And("^I select credit card radio button$")
    public void iSelectCreditCardRadioButton() {
        new PaymentMethodPage().clickOnCreditCardRadioButton();
    }

    @And("^click on continue buttonn$")
    public void clickOnContinueButtonn() {
        new PaymentMethodPage().clickOnContinueButton();
    }

    @And("^I select Visa from select credit card dropdown$")
    public void iSelectVisaFromSelectCreditCardDropdown() {
        new PaymentDetailPage().selectCreditCardType(0);
    }

    @And("^I enter card holder name$")
    public void iEnterCardHolderName() {
        new PaymentDetailPage().inputCardHoldersName("Rahul Doshi");
    }

    @And("^I enter card number$")
    public void iEnterCardNumber() {
        new PaymentDetailPage().inputCardNumber("5555 5555 5555 4444");
    }

    @And("^I enter expiry month$")
    public void iEnterExpiryMonth() {
        new PaymentDetailPage().inputExpireMonth("12");
    }

    @And("^I enter expiry year$")
    public void iEnterExpiryYear() {
        new PaymentDetailPage().inputExpireYear("2025");
    }

    @And("^I enter card code$")
    public void iEnterCardCode() {
        new PaymentDetailPage().inputCardCode("143");
    }

    @And("^I verify payment method is credit card$")
    public void iVerifyPaymentMethodIsCreditCard() {
        new PaymentDetailPage().clickOnContinueButton();
    }


}