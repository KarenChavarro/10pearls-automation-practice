package com.etsy.pages.cart;

import com.etsy.driver.Driver;
import com.etsy.utils.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

    @FindBy(xpath = "//a[@class='listing-title text-gray break-word']")
    private WebElement lblTitleProduct;

    /**
     * This method allows initializing the screen elements
     */
    public Cart (){
        PageFactory.initElements(Driver.driver, this);
    }

    /**
     * This method allows to obtain the product name
     * @return the product name
     */
    public String getNameProduct(){
        return lblTitleProduct.getAttribute(Constants.Attributes.DATA_TITLE);
    }
}
