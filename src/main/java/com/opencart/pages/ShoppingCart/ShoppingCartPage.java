package com.opencart.pages.ShoppingCart;

import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage extends BasePage {


    @FindBy(id = "input-payment-firstname")
    private WebElement inputPaymentFirstname;

    @FindBy(id = "input-payment-lastname")
    private WebElement inputPaymentLastname;

    @FindBy(id = "input-payment-email")
    private WebElement inputPaymentEmail;

    @FindBy(id = "input-payment-telephone")
    private WebElement inputPaymentTelephone;

    @FindBy(id = "input-payment-company")
    private WebElement inputPaymentCompany;

    @FindBy(xpath = "//div[@class='form-group required']//input[@id='input-payment-address-1']")
    private WebElement inputPaymentAddress1;

    @FindBy(id = "input-payment-address-2")
    private WebElement inputPaymentAddress2;

    @FindBy(id = "input-payment-city")
    private WebElement inputPaymentCity;

    @FindBy(id = "input-payment-postcode")
    private WebElement inputPaymentPostcode;

    @FindBy(xpath = "//div[@class='checkbox']//input[@type='checkbox' and @value='1']")
    private WebElement myDeliveryAddressSameCheckBox;

    @FindBy(xpath = ".//div[@id='collapse-shipping-method']//textarea[@class='form-control']")
    private WebElement comments1;

    @FindBy(xpath = ".//input[@name='agree']")
    private WebElement checkBox;

    @FindBy(xpath = ".//div[@class='panel panel-default']//input[@type='button' and @value='Continue' and @id='button-account']")
    private WebElement continueAccountButtonStep1;

    @FindBy(id = "button-guest")
    private WebElement continueGuestButtonStep2;

    @FindBy(id = "button-shipping-method")
    private WebElement continueShippingButtonStep4;

    @FindBy(id = "button-payment-method")
    private WebElement continuePaymentButtonsStep5;

    @FindBy(id = "button-payment-method")
    private WebElement confirmButtonStep6;

    @FindBy(xpath = "//*[@class='pull-right']/a[@href]")
    private WebElement continueFinish;

    public WebElement getContinueFinish() {
        return continueFinish;
    }

    public WebElement getSubscribeRadioButtonGuestCheckout(String value) {
        return driver.findElement(By.xpath("//div[@class = 'radio'][2]//input[@value='" + value + "']"));
    }

    public WebElement getPaymentCounty() {
        return driver.findElement(By.xpath("//*[@name='country_id']"));
    }

    public WebElement getPaymentZone() {
        return driver.findElement(By.xpath("//*[@name='zone_id']"));
    }

    public WebElement getInputPaymentFirstname() {
        return inputPaymentFirstname;
    }

    public WebElement getInputPaymentLastname() {
        return inputPaymentLastname;
    }

    public WebElement getInputPaymentEmail() {
        return inputPaymentEmail;
    }

    public WebElement getInputPaymentTelephone() {
        return inputPaymentTelephone;
    }

    public WebElement getInputPaymentCompany() {
        return inputPaymentCompany;
    }

    public WebElement getInputPaymentAddress1() {
        return inputPaymentAddress1;
    }

    public WebElement getInputPaymentAddress2() {
        return inputPaymentAddress2;
    }

    public WebElement getInputPaymentCity() {
        return inputPaymentCity;
    }

    public WebElement getInputPaymentPostcode() {
        return inputPaymentPostcode;
    }

    public WebElement getComments1() {
        return comments1;
    }

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getContinueAccountButtonStep1() {
        return continueAccountButtonStep1;
    }

    public WebElement getContinueGuestButtonStep2() {
        return continueGuestButtonStep2;
    }

    public WebElement getContinueShippingButtonStep4() {
        return continueShippingButtonStep4;
    }

    public WebElement getContinuePaymentButtonsStep5() {
        return continuePaymentButtonsStep5;
    }

    public WebElement getConfirmButtonStep6() {
        return confirmButtonStep6;
    }

}