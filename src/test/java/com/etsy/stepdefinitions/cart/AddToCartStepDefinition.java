package com.etsy.stepdefinitions.cart;

import com.etsy.steps.cart.CartSteps;
import com.etsy.steps.home.HomePageSteps;
import com.etsy.steps.cart.ProductDetailSteps;
import com.etsy.steps.cart.ProductListSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddToCartStepDefinition {

    String nameProduct;

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    ProductListSteps productListSteps;

    @Steps
    ProductDetailSteps productDetailSteps;

    @Steps
    CartSteps cartSteps;

    @Given("^the user is on the Etsy home page$")
    public void the_user_is_on_the_Etsy_home_page() {
        homePageSteps.enterEtsy();
    }

    @When("^the user searches for the product \"([^\"]*)\"$")
    public void the_user_searches_for_the_product(String product) throws InterruptedException {
        homePageSteps.searchProduct(product);
        Thread.sleep(4000);
    }

    @When("^the user adds the product to the cart$")
    public void the_user_adds_the_product_to_the_cart() {
        productListSteps.selectFirstProduct();
        nameProduct = productListSteps.nameProduct;
        productListSteps.changeTab();
        productDetailSteps.addProduct();
    }

    @Then("^The system adds the product to the shopping cart$")
    public void the_system_adds_the_product_to_the_shopping_cart() {
        cartSteps.validateProduct(nameProduct);
        cartSteps.closeDriver();
    }
}