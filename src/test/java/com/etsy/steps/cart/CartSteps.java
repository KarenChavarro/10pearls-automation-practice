package com.etsy.steps.cart;

import com.etsy.driver.Driver;
import com.etsy.pages.cart.Cart;
import com.etsy.utils.Constants;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps {

    Cart cart;

    @Step
    public void validateProduct(String nameProduct){
        cart = new Cart();
        Assert.assertEquals(Constants.Messages.ADD_PRODUCT_ERROR_MESSAGE, nameProduct, cart.getNameProduct());
    }

    @Step
    public void closeDriver(){
        Driver.driver.quit();
    }

}