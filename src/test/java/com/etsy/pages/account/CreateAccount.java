package com.etsy.pages.account;

import com.etsy.driver.Driver;
import com.etsy.utils.WebElementsUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {

    @FindBy(id = "join_neu_email_field")
    private WebElement txtEmail;

    @FindBy(id = "join_neu_first_name_field")
    private WebElement txtFirstName;

    @FindBy(id = "join_neu_password_field")
    private WebElement txtPassword;

    @FindBy(xpath = "//div[@class='col-group col-flush']//button[@value='register']")
    private WebElement btnRegister;

    @FindBy(id = "aria-join_neu_email_field-error")
    private WebElement msgEmailError;

    @FindBy(id = "aria-join_neu_first_name_field-error")
    private WebElement msgFirstNameError;

    @FindBy(id = "aria-join_neu_password_field-error")
    private WebElement msgPasswordError;

    @FindBy(xpath = "//div[@id='content']//div[@class='col-xs-12']//h1")
    private WebElement msgSuccessful;

    //Create Account with Google
    @FindBy(xpath = "//div[@class='mb-xs-2']/div//button[contains(@class, 'btn-secondary')]")
    private WebElement btnGoogle;

    @FindBy(id = "identifierId")
    private WebElement txtEmailGoogle;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement txtPasswordGoogle;

    @FindBy(xpath = "//span[text()='Siguiente']")
    private WebElement btnNext;


    /**
     * This method allows initializing the screen elements
     */
    public CreateAccount (){
        PageFactory.initElements(Driver.driver, this);
    }

    /**
     * This method allows you to enter a value in the Email field
     * @param email corresponds to the email with which the account will be created
     */
    public void setEmail(String email){
        WebElementsUtils.sendKeysElement(txtEmail, email);
    }

    /**
     * This method allows you to enter a value in the First Name field
     * @param firstName corresponds to the first name with which the account will be created
     */
    public void setFirstName(String firstName){
        WebElementsUtils.sendKeysElement(txtFirstName, firstName);
    }

    /**
     * This method allows you to enter a value in the Password field
     * @param password corresponds to the password used to log into the system
     */
    public void setPassword(String password){
        WebElementsUtils.sendKeysElement(txtPassword, password);
    }

    /**
     * This method allows you to click on the Register button
     */
    public void clickOnRegisterBtn(){
        WebElementsUtils.clickElement(btnRegister);
    }

    /**
     * This method allows to obtain the validation message of the Email field
     * @return the email field validation message
     */
    public String getEmailMessageError(){
        return WebElementsUtils.getTextElement(msgEmailError);
    }

    /**
     * This method allows to obtain the validation message of the First Name field
     * @return the first name field validation message
     */
    public String getFirstNameMessageError(){
        return WebElementsUtils.getTextElement(msgFirstNameError);
    }

    /**
     * This method allows to obtain the validation message of the Password field
     * @return the password field validation message
     */
    public String getPasswordMessageError(){
        return WebElementsUtils.getTextElement(msgPasswordError);
    }

    /**
     * This method allows you to get the welcome message when the account is created
     * @return the welcome message
     */
    public String getMessageSuccessful(){
        String msg = WebElementsUtils.getTextElement(msgSuccessful).substring(0, 12);
        return msg;
    }

    /**
     * This method allows you to click on the Google button
     */
    public void clickOnGoogleBtn(){
        WebElementsUtils.clickElement(btnGoogle);
    }

    /**
     * This method allows you to enter a value in the Email field
     * @param emailGoogle corresponds to the email with which the account will be created
     */
    public void setEmailGoogle(String emailGoogle){
        WebElementsUtils.sendKeysElement(txtEmailGoogle, emailGoogle);
    }

    /**
     * This method allows you to enter a value in the Password field
     * @param passwordGoogle corresponds to the password used to log into the system
     */
    public void setPasswordGoogle(String passwordGoogle){
        WebElementsUtils.sendKeysElement(txtPasswordGoogle, passwordGoogle);
    }

    /**
     * This method allows you to click on the Next button
     */
    public void clickOnNextButton(){
        WebElementsUtils.clickElement(btnNext);
    }
}