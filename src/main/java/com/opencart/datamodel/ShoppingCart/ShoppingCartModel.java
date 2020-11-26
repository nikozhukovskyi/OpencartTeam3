package com.opencart.datamodel.ShoppingCart;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder


public class ShoppingCartModel {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String postcode;
    private String country;
    private String region;
    private String commentsOrder;

}
