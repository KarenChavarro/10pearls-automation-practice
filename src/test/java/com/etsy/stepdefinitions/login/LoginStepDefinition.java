package com.etsy.stepdefinitions.login;

import com.etsy.steps.home.HomePageSteps;
import com.etsy.steps.login.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    LoginSteps loginSteps;

    @Given("^the user is on the Etsy home page$")
    public void the_user_is_on_the_Etsy_home_page() {
        homePageSteps.enterEtsy();
    }

    @When("^the user wants to login on the page$")
    public void the_user_wants_to_login_on_the_page() {
        homePageSteps.clickOnSignInLink();
    }

    @When("^the user enters the user as \"([^\"]*)\" and the password as \"([^\"]*)\"$")
    public void the_user_enters_the_user_as_and_the_password_as(String user, String password) {
        loginSteps.setUserName(user);
        loginSteps.setPassword(password);
        loginSteps.clickOnSignInBtn();
    }

    @Then("^the system shows the message \"([^\"]*)\"$")
    public void the_system_shows_the_message(String message) {
        loginSteps.validateErrorMessage(message);
        loginSteps.closeDriver();
    }

    @Then("^the system displays the success message \"([^\"]*)\"$")
    public void the_system_shows_the_success_message(String message) {
        loginSteps.validateSuccessfulMessage(message);
        loginSteps.closeDriver();
    }
}