package com.etsy.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features/AddToCart.feature"},
        glue = {"com.etsy.stepdefinitions.cart"}
)
public class AddToCartTest {
}