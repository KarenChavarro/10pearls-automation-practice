package com.etsy.steps.login;

import com.etsy.driver.Driver;
import com.etsy.pages.login.Login;
import com.etsy.utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps {

    Login login;

    @Step
    public void setUserName(String userName) {
        login = new Login();
        login.setEmail(userName);
    }

    @Step
    public void setPassword(String password){
        login.setPassword(password);
    }

    @Step
    public void clickOnSignInBtn(){
        login.clickOnSignInBtn();
    }

    @Step
    public void validateErrorMessage(String messageExpected){
        String messageActual = login.getMessageError();
        Assert.assertEquals(Constants.Messages.LOGIN_ERROR_MESSAGE, messageExpected, messageActual);
    }

    @Step
    public void validateSuccessfulMessage(String messageExpected){
        String messageActual = login.getMessageSuccessful();
        Assert.assertEquals(Constants.Messages.LOGIN_ERROR_MESSAGE, messageExpected, messageActual);
    }

    @Step
    public void closeDriver(){
        Driver.driver.quit();
    }
}
