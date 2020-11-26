package com.opencart.pages.SuccessPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessShoppingCartPage {

    @FindBy(xpath = "//div[@id='content']/p[1]")
    private WebElement successTitle;

    public WebElement getSuccessTitle() {
        return successTitle;
    }
}
