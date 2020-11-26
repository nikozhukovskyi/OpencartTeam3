package com.opencart.pages.Search;

import com.opencart.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Getter

public class SearchPage extends BasePage {

    @FindBy(id = "input-search")
    private WebElement SearchInput;

    @FindBy(id = "button-search")
    private WebElement SearchButton;


    public WebElement clickProductDescription(int value){
        return driver.findElement(By.xpath("//div[@id='content']/p//input[@type='checkbox' and @id='description' and @value='"+value+"']"));
    }
}
