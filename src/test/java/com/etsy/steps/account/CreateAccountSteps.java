package com.etsy.steps.account;

import com.etsy.driver.Driver;
import com.etsy.pages.account.CreateAccount;
import com.etsy.utils.Constants;
import com.etsy.utils.WebElementsUtils;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CreateAccountSteps extends ScenarioSteps {

    CreateAccount createAccount;
    String parentWindowHandler;

    @Step
    public void setEmail(String email){
        createAccount = new CreateAccount();
        createAccount.setEmail(email);
    }

    @Step
    public void setFirstName(String firstName){
        createAccount.setFirstName(firstName);
    }

    @Step
    public void setPassword(String password){
        createAccount.setPassword(password);
    }

    @Step
    public void clickOnRegisterBtn(){
        createAccount = new CreateAccount();
        createAccount.clickOnRegisterBtn();
    }

    @Step
    public void validateSuccessfulMessage(String messageExpected){
        String messageActual = createAccount.getMessageSuccessful();
        Assert.assertEquals(Constants.Messages.CREATE_ACCOUNT_ERROR_MESSAGE, messageExpected, messageActual);
    }

    @Step
    public void validateMandatoryFieldsMsg(String messageExpected){
        Assert.assertEquals(Constants.Messages.CREATE_ACCOUNT_ERROR_MESSAGE, messageExpected, createAccount.getEmailMessageError());
        Assert.assertEquals(Constants.Messages.CREATE_ACCOUNT_ERROR_MESSAGE, messageExpected, createAccount.getFirstNameMessageError());
        Assert.assertEquals(Constants.Messages.CREATE_ACCOUNT_ERROR_MESSAGE, messageExpected, createAccount.getPasswordMessageError());
    }

    @Step
    public void changeTab(){
        parentWindowHandler = Driver.driver.getWindowHandle(); //Store your current window
        WebElementsUtils.changeTab();
    }

    @Step
    public void clickOnGoogleBtn(){
        createAccount = new CreateAccount();
        createAccount.clickOnGoogleBtn();
    }

    @Step
    public void setEmailGoogle(String emailGoogle){
        createAccount.setEmailGoogle(emailGoogle);
    }

    @Step
    public void setPasswordGoogle(String passwordGoogle){
        createAccount.setPasswordGoogle(passwordGoogle);
    }

    @Step
    public void clickOnNextButton(){
        createAccount.clickOnNextButton();
    }

    @Step
    public void closeDriver(){
        Driver.driver.quit();
    }

    @Step
    public void returnInitialWindow(){
        Driver.driver.switchTo().window(parentWindowHandler);
    }
}