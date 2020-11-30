package com.opencart.steps.ShoppingCart;

import com.opencart.datamodel.ShoppingCart.ShoppingCartModel;
import com.opencart.pages.ShoppingCart.ShoppingCartPage;
import com.opencart.pages.SuccessPage.SuccessShoppingCartPage;
import com.opencart.repository.shoppingCart.ShoppingCartModelRepository;
import com.opencart.util.DriverUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.Driver;


public class ShoppingCartPageBL {

    private ShoppingCartPage shoppingCartPage;
    private SuccessShoppingCartPage successShoppingCartPage;

    public ShoppingCartPageBL() {
        shoppingCartPage = new ShoppingCartPage();
    }

    public ShoppingCartPageBL ShoppingNewOrder() throws InterruptedException {

        ShoppingCartModel shoppingCartModel = ShoppingCartModelRepository.getShoppingCartModel();
        clickSubscribeRadioButtonGuestCheckout("guest");
        Thread.sleep(2000);
        clickOnContinueButtonStep1();                               //Step 1
        inputFirstName(shoppingCartModel.getFirstName());
        inputLastName(shoppingCartModel.getLastName());
        inputEmail(shoppingCartModel.getEmail());
        inputTelephone(shoppingCartModel.getTelephone());
        inputCompany(shoppingCartModel.getCompany());
        inputAddress1(shoppingCartModel.getAddress1());
        inputAddress2(shoppingCartModel.getAddress2());
        inputPaymentCity(shoppingCartModel.getCity());
        inputPosCode(shoppingCartModel.getPostcode());
        chosePaymentCountry("220");
        chosePaymentZone("3493");
        clickOnContinueButtonStep2();                               //Step 2
        inputComments(shoppingCartModel.getCommentsOrder());
        clickOnContinueButtonStep4();                               //Step 4
        clickPolicyCheckbox();
        clickOnContinueButtonStep5();                               //Step 5
//        acc();
        clickOnContinueButtonStep6();                               //Step 6 Confirm

        Thread.sleep(1000);

//        successShoppingCartPage = new SuccessShoppingCartPage();
        return this;
    }

//    private void acc(){
//        shoppingCartPage.getacc().click();
//        shoppingCartPage.getas();
//
//    }

    private void inputFirstName(String firstName) {
        shoppingCartPage.getInputPaymentFirstname().clear();
        shoppingCartPage.getInputPaymentFirstname().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        shoppingCartPage.getInputPaymentLastname().clear();
        shoppingCartPage.getInputPaymentLastname().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        shoppingCartPage.getInputPaymentEmail().clear();
        shoppingCartPage.getInputPaymentEmail().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        shoppingCartPage.getInputPaymentTelephone().clear();
        shoppingCartPage.getInputPaymentTelephone().sendKeys(telephone);
    }

    private void inputCompany(String company) {
        shoppingCartPage.getInputPaymentCompany().clear();
        shoppingCartPage.getInputPaymentCompany().sendKeys(company);
    }

    private void inputAddress1(String address1) {
        shoppingCartPage.getInputPaymentAddress1().clear();
        shoppingCartPage.getInputPaymentAddress1().sendKeys(address1);
    }

    private void inputAddress2(String address2) {
        shoppingCartPage.getInputPaymentAddress2().clear();
        shoppingCartPage.getInputPaymentAddress2().sendKeys(address2);
    }

    private void inputPaymentCity(String city) {
        shoppingCartPage.getInputPaymentCity().clear();
        shoppingCartPage.getInputPaymentCity().sendKeys(city);
    }

    private void inputPosCode(String postCode) {
        shoppingCartPage.getInputPaymentPostcode().clear();
        shoppingCartPage.getInputPaymentPostcode().sendKeys(postCode);
    }

    private void inputComments(String comments) {
        shoppingCartPage.getComments1().clear();
        shoppingCartPage.getComments1().sendKeys(comments);
    }

    private void clickSubscribeRadioButtonGuestCheckout(String value) {
        new DriverUtils().clickOnElementJS(shoppingCartPage.getSubscribeRadioButtonGuestCheckout(value));
    }

    public void chosePaymentCountry(String value) {
        new Select(shoppingCartPage.getPaymentCounty()).selectByValue(value);
    }

    public void chosePaymentZone(String value) {
        new Select(shoppingCartPage.getPaymentZone()).selectByValue(value);
    }

    private void clickPolicyCheckbox() {
        new DriverUtils().clickOnElementJS(shoppingCartPage.getCheckBox());
    }

    private void clickOnContinueButtonStep1() {
        shoppingCartPage.getContinueAccountButtonStep1().click();
    }

    private void clickOnContinueButtonStep2() {
        shoppingCartPage.getContinueGuestButtonStep2().click();
    }

    private void clickOnContinueButtonStep4() {
        shoppingCartPage.getContinueShippingButtonStep4().click();
    }

    private void clickOnContinueButtonStep5() {
        shoppingCartPage.getContinuePaymentButtonsStep5().click();
    }

    private void clickOnContinueButtonStep6() {
        shoppingCartPage.getConfirmButtonStep6().click();
    }

    public void verifyUserBuy() {
        String expectedMessage = "Your order has been successfully processed!";
        Assert.assertEquals(successShoppingCartPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }
}
