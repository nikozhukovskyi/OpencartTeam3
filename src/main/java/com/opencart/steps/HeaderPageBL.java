package com.opencart.steps;

import com.opencart.pages.HeaderPage;
import com.opencart.steps.ShoppingCart.ShoppingCartPageBL;
import com.opencart.steps.login.LoginPageBL;
import com.opencart.steps.register.RegisterPageBL;
import com.opencart.steps.search.SearchPageBL;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public ShoppingCartPageBL clickAddToCart() throws InterruptedException {
        headerPage.getAddToCartButton().click();
        Thread.sleep(1000);
        headerPage.getShoppingCart().click();
        Thread.sleep(1000);
        headerPage.getCheckoutButton().click();
        Thread.sleep(2000);
        return new ShoppingCartPageBL();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }                                                   //MyAccount

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }                                                   //RegisterBTN

    public LoginPageBL clickOnLoginButton(){
        headerPage.getLoginButton().click();
        return new LoginPageBL();
    }                                                   //LoginBTN

    public SearchPageBL clickOnSearchButton(){
        headerPage.getSearchButton().click();
        return  new SearchPageBL();
    }                                                   //SearchBTN

}
