package com.etsy.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver;

    public static void initDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}
