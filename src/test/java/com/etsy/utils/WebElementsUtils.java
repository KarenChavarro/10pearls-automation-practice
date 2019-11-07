package com.etsy.utils;

import com.etsy.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;

public class WebElementsUtils {

    public static void sendKeysElement(WebElement element, String value) {
        WebElement webElement = (new WebDriverWait(Driver.driver, Constants.Time.Seconds.TEN))
            .until(ExpectedConditions.visibilityOf(element));
        webElement.sendKeys(value);
    }

    public static void clickElement(WebElement element) {
        WebElement webElement = (new WebDriverWait(Driver.driver, Constants.Time.Seconds.TEN))
                .until(ExpectedConditions.elementToBeClickable(element));
        webElement.click();
    }

    public static String getTextElement(WebElement element) {
        WebElement webElement = (new WebDriverWait(Driver.driver, Constants.Time.Seconds.TEN))
                .until(ExpectedConditions.visibilityOf(element));
        return webElement.getText();
    }

    public static void enterElement(WebElement element) {
        WebElement webElement = (new WebDriverWait(Driver.driver, Constants.Time.Seconds.TEN))
                .until(ExpectedConditions.visibilityOf(element));
        webElement.sendKeys(Keys.RETURN);
    }

    public static void changeTab(){
        Set<String> tabHandles = Driver.driver.getWindowHandles();
        int numberOfTabs = tabHandles.size();
        int newTabIndex = numberOfTabs-1;
        Driver.driver.switchTo().window(tabHandles.toArray()[newTabIndex].toString());
    }

    public static void selectElementListByValue(WebElement element, String value) {
        new Select(element).selectByValue(value);
    }

    public static void rollDownElementLocated(WebElement element) {
        ((JavascriptExecutor) Driver.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static String generateRandomNumeric() {
        String numericValue = String.valueOf(Math.round(Math.random() * (999 - 100 + 1) + 1));
        return numericValue;
    }
}