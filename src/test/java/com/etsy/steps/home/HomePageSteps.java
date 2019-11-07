package com.etsy.steps.home;

import com.etsy.driver.Driver;
import com.etsy.pages.home.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomePageSteps extends ScenarioSteps {

    HomePage homePage;

    @Step
    public void enterEtsy() {
        Driver.initDriver();
        homePage = new HomePage();
        this.clickOnLanguageOption();
        this.selectLanguage();
        this.clickOnSaveLanguageButton();
    }

    @Step
    public void clickOnRegisterLink(){
        homePage.clickOnRegisterLink();
    }

    @Step
    public void clickOnSignInLink(){
        homePage.clickOnSignInLink();
    }

    @Step
    public void searchProduct(String product) {
        homePage = new HomePage();
        homePage.setSearch(product);
        homePage.enterOnSearchField();
    }

    @Step
    public void clickOnLanguageOption(){
        homePage.clickOnLanguageOption();
    }

    @Step
    public void selectLanguage(){
        homePage.selectLanguage();
    }

    @Step
    public void clickOnSaveLanguageButton(){
        homePage.clickOnSaveButton();
    }
}