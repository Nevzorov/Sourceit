package com.leisurepro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.leisurepro.WebDriverHolder.*;

/**
 * Created by admin on 06.07.2015.
 */
public class WaitingUtils {

    public static void  setImplicitWait(long time, TimeUnit unit){
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static FluentWait waitFor(ExpectedCondition<List<WebElement>> conditions){
        return new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS);    }
    public static  void sleep (long time){
        try{
            new Thread().sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
