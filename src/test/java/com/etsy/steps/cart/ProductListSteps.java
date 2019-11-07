package com.etsy.steps.cart;

import com.etsy.pages.cart.ProductList;
import com.etsy.utils.WebElementsUtils;
import net.thucydides.core.annotations.Step;

public class ProductListSteps {

    ProductList productList;
    public String nameProduct;

    @Step
    public void selectFirstProduct(){
        productList = new ProductList();
        nameProduct = productList.getNameProduct();
        productList.clickOnFirstProduct();
    }

    @Step
    public void changeTab(){
        WebElementsUtils.changeTab();
    }
}