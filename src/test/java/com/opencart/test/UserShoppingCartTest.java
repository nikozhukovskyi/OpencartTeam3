package com.opencart.test;

import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.ShoppingCart.ShoppingCartPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserShoppingCartTest extends BaseTest {

    @Test
    public void shoppingCartUserWithValidParameters() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPageBL()

                .clickAddToCart()
                .ShoppingNewOrder();
       // shoppingCartPageBL.verifyUserBuy();
    }
}
