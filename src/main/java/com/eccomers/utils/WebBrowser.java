package com.eccomers.utils;

import net.serenitybdd.screenplay.Ability;
import org.openqa.selenium.WebDriver;

public class WebBrowser implements Ability {

    private WebDriver driver;

    public WebBrowser(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static WebBrowser withDriver(WebDriver driver) {
        return new WebBrowser(driver);
    }

}
