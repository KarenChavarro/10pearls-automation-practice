package com.etsy.pages.cart;

import com.etsy.driver.Driver;
import com.etsy.utils.WebElementsUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetail {

    @FindBy(xpath = "//div[@class='btn-text' and text()= 'Add to cart']")
    private WebElement btnAddCart;

    /**
     * This method allows initializing the screen elements
     */
    public ProductDetail (){
        PageFactory.initElements(Driver.driver, this);
    }

    /**
     * This method allows you to click on the Add Cart button
     */
    public void clickOnAddCartBtn(){
        WebElementsUtils.clickElement(btnAddCart);
    }
}
