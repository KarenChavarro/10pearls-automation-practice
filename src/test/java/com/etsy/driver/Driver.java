package com.etsy.driver;

import com.etsy.utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    public static WebDriver driver;

    public static void initDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.get(Constants.Url.URL);

//        WebDriverManager.firefoxdriver().setup();
//        FirefoxOptions optionsFirefox = new FirefoxOptions();
//        optionsFirefox.addArguments("--kiosk");
//        driver = new FirefoxDriver(optionsFirefox);
//        driver.get(Constants.Url.URL);
    }
}