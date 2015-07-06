package com.leisurepro;

import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 06.07.2015.
 */
public class WebDriverHolder {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        WebDriverHolder.driver = driver;
    }
}
