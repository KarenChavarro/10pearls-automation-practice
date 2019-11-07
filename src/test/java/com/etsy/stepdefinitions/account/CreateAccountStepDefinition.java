package com.etsy.stepdefinitions.account;

import com.etsy.steps.account.CreateAccountSteps;
import com.etsy.steps.home.HomePageSteps;
import com.etsy.utils.Constants;
import com.etsy.utils.WebElementsUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CreateAccountStepDefinition {

    @Steps
    CreateAccountSteps createAccountSteps;

    @Steps
    HomePageSteps homePageSteps;

    @Given("^the user is on the Etsy home page$")
    public void the_user_is_on_the_Etsy_home_page() {
        homePageSteps.enterEtsy();
    }

    @When("^the user selects the Register option$")
    public void the_user_selects_the_Register_option() {
        homePageSteps.clickOnRegisterLink();
    }

    @When("^the user completes the form$")
    public void the_user_completes_the_form() {
        String email = Constants.Datos.EMAIL_FIRST_PART + WebElementsUtils.generateRandomNumeric() + Constants.Datos.EMAIL_SECOND_PART;
        createAccountSteps.setEmail(email);
        createAccountSteps.setFirstName(Constants.Datos.NAME);
        createAccountSteps.setPassword(Constants.Datos.PASSWORD);
        createAccountSteps.clickOnRegisterBtn();
    }

    @When("^the user clicks on the Register button$")
    public void the_user_clicks_on_the_register_button() {
        createAccountSteps.clickOnRegisterBtn();
    }

    @When("^the user clicks on the 'Continue with Google' button$")
    public void the_user_clicks_on_the_google_button() {
        createAccountSteps.clickOnGoogleBtn();
    }

    @When("^the user enters the user as \"([^\"]*)\" and the password as \"([^\"]*)\"$")
    public void the_user_enters_the_user_as_and_the_password_as(String email, String password) throws InterruptedException {
        createAccountSteps.changeTab();
        createAccountSteps.setEmailGoogle(email);
        createAccountSteps.clickOnNextButton();
        createAccountSteps.setPasswordGoogle(password);
        createAccountSteps.clickOnNextButton();
        Thread.sleep(4000);
        createAccountSteps.returnInitialWindow();
    }

    @Then("^the system displays the success message \"([^\"]*)\"$")
    public void the_system_shows_the_success_message(String message) {
        createAccountSteps.validateSuccessfulMessage(message);
        createAccountSteps.closeDriver();
    }

    @Then("^the result should be \"([^\"]*)\"$")
    public void the_result_should_be(String message) {
        createAccountSteps.validateMandatoryFieldsMsg(message);
        createAccountSteps.closeDriver();
    }
}