package com.etsy.pages.login;

import com.etsy.driver.Driver;
import com.etsy.utils.WebElementsUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    @FindBy(id = "join_neu_email_field")
    private WebElement txtEmail;

    @FindBy(id = "join_neu_password_field")
    private WebElement txtPassword;

    @FindBy(xpath = "//div[@class='col-group col-flush']//button[@value='sign-in']")
    private WebElement btnSignIn;

    @FindBy(id = "aria-join_neu_password_field-error")
    private WebElement msgErrorPassword;

    @FindBy(xpath = "//div[@id='content']//div[@class='col-xs-12']//h1")
    private WebElement msgSuccessful;

    /**
     * This method allows initializing the screen elements
     */
    public Login (){
        PageFactory.initElements(Driver.driver, this);
    }

    /**
     * This method allows you to enter a value in the Email field
     * @param email corresponds to the email used to log into the system
     */
    public void setEmail(String email){
        WebElementsUtils.sendKeysElement(txtEmail, email);
    }

    /**
     * This method allows you to enter a value in the Password field
     * @param password corresponds to the password used to log into the system
     */
    public void setPassword(String password){
        WebElementsUtils.sendKeysElement(txtPassword, password);
    }

    /**
     * This method allows you to click on the Sign In button
     */
    public void clickOnSignInBtn(){
        WebElementsUtils.clickElement(btnSignIn);
    }

    /**
     * This method allows to obtain the validation message of the Email field
     * @return the email field validation message
     */
    public String getMessageError(){
        return WebElementsUtils.getTextElement(msgErrorPassword);
    }

    /**
     * This method allows you to get the welcome message when you log in
     * @return the welcome message
     */
    public String getMessageSuccessful(){
        String msg = WebElementsUtils.getTextElement(msgSuccessful).substring(0, 12);
        return msg;
    }
}