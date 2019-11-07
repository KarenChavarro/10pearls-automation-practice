package com.etsy.steps.cart;

import com.etsy.pages.cart.ProductDetail;
import net.thucydides.core.annotations.Step;

public class ProductDetailSteps {

    ProductDetail productDetail;

    @Step
    public void addProduct(){
        productDetail = new ProductDetail();
        productDetail.clickOnAddCartBtn();
    }
}
