package com.etsy.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features/CreateAccount.feature"},
        glue = {"com.etsy.stepdefinitions.account"}
)
public class CreateAccountTest {
}