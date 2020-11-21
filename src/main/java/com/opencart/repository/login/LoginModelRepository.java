package com.opencart.repository.login;

import com.opencart.datamodel.login.LoginModel;

public class LoginModelRepository {

    private LoginModelRepository(){
    }

    public static LoginModel getLoginModel() {
        return LoginModel.builder()
                .email("asd@gmail.com")
                .password("123456")
                .build();
    }
}
