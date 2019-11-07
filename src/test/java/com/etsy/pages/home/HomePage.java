package com.etsy.pages.home;

import com.etsy.driver.Driver;
import com.etsy.utils.Constants;
import com.etsy.utils.WebElementsUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "register")
    private WebElement linkRegister;

    @FindBy(id = "sign-in")
    private WebElement linkSignIn;

    @FindBy(id = "global-enhancements-search-query")
    private WebElement txtSearch;

    @FindBy(xpath = "//button[@aria-controls='wt-locale-picker-overlay']")
    private WebElement btnLanguage;

    @FindBy(id = "locale-overlay-select-language_code")
    private WebElement cmbLanguage;

    @FindBy(id = "locale-overlay-save")
    private WebElement btnSaveLanguage;

    /**
     * This method allows initializing the screen elements
     */
    public HomePage (){
        PageFactory.initElements(Driver.driver, this);
    }

    /**
     * This method allows you to click on the Register link
     */
    public void clickOnRegisterLink(){
        WebElementsUtils.clickElement(linkRegister);
    }

    /**
     * This method allows you to click on the Sign In link
     */
    public void clickOnSignInLink(){
        WebElementsUtils.clickElement(linkSignIn);
    }

    /**
     * This method allows you to enter a value in the search field
     * @param product, is the value for which it is to be searched
     */
    public void setSearch(String product){
        WebElementsUtils.sendKeysElement(txtSearch, product);
    }

    /**
     * This method allows Enter in the search field
     */
    public void enterOnSearchField(){
        WebElementsUtils.enterElement(txtSearch);
    }

    /**
     * This method allows you to click on the language option
     */
    public void clickOnLanguageOption(){
        WebElementsUtils.rollDownElementLocated(btnLanguage);
        WebElementsUtils.clickElement(btnLanguage);
    }

    /**
     * This method allows you to select the English language
     */
    public void selectLanguage(){
        WebElementsUtils.selectElementListByValue(cmbLanguage, Constants.Language.ENGLISH);

    }

    /**
     * This method allows you to click on the Save button
     */
    public void clickOnSaveButton(){
        WebElementsUtils.clickElement(btnSaveLanguage);
    }
}