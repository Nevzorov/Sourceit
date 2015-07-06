package com.leisurepro;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import static com.leisurepro.WebDriverHolder.getDriver;

/**
 * Created by admin on 06.07.2015.
 */
public class UiUtils {
    public static WebElement $(By by) {
        return getDriver().findElement(by);
    }

    public static void  maximizeWindow (){
        getDriver().manage().window().maximize();
    }

    public static void  maximizeWindowTo (int width, int height){
        getDriver().manage().window().setSize(new Dimension(width, height));
    }

    public static void goTo (String url){
        getDriver().get (url);
    }
}
