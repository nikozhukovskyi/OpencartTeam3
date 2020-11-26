package com.opencart.repository.shoppingCart;

import com.opencart.datamodel.ShoppingCart.ShoppingCartModel;
import org.apache.commons.lang3.RandomStringUtils;

public class ShoppingCartModelRepository {

    private ShoppingCartModelRepository(){
    }

    public static ShoppingCartModel getShoppingCartModel(){
        return ShoppingCartModel.builder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .email(RandomStringUtils.randomAlphabetic(5)+"@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .company(RandomStringUtils.randomAlphabetic(10))
                .address1(RandomStringUtils.randomAlphabetic(8))
                .address2(RandomStringUtils.randomAlphabetic(8))
                .city(RandomStringUtils.randomAlphabetic(5))
                .postcode(RandomStringUtils.randomNumeric(4))
                .commentsOrder(RandomStringUtils.randomAlphabetic(20))
                .build();

    }
}
