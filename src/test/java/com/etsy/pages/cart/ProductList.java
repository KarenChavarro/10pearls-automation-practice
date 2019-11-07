package com.etsy.pages.cart;

import com.etsy.driver.Driver;
import com.etsy.utils.WebElementsUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductList {

    @FindBy(xpath = "(//div[@class = 'height-placeholder'])[1]")
    private WebElement firstProduct;

    @FindBy(xpath = "(//h2[contains(@class, 'text-gray')])[1]")
    private WebElement firstProductTitle;

    /**
     * This method allows initializing the screen elements
     */
    public ProductList (){
        PageFactory.initElements(Driver.driver, this);
    }

    /**
     * This method allows you to click on the first product in the list
     */
    public void clickOnFirstProduct(){
        WebElementsUtils.clickElement(firstProduct);
    }

    /**
     * This method allows to obtain the product name
     * @return the product name
     */
    public String getNameProduct(){
        return WebElementsUtils.getTextElement(firstProductTitle);
    }
}