package com.leisurepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.leisurepro.UiUtils.*;
import static com.leisurepro.WaitingUtils.*;
import static com.leisurepro.WebDriverHolder.getDriver;
import static org.openqa.selenium.By.*;

/**
 * Created by admin on 06.07.2015.
 */
public class Page {
    public static final String LOGIN_INPUT = "#login-email";
    public static final String PASSWORD_INPUT = "#login-pwd";
    public static final String SUBMIT_BUTTON = ".button.radius.primary";
    public static final String ERROR_TEXT = ".message.error";
    public static final String PROTECT = "https://sandbox.leisurepro.com/protectsandbox.aspx";
    public static final String LOGIN_PAGE = "https://sandbox.leisurepro.com/myaccount#dashboard";
    public static final String GREETING = "#accountGreet";

    public void open() {
        maximizeWindow();
        setImplicitWait(5, TimeUnit.SECONDS);
        goTo(PROTECT);
        goTo(LOGIN_PAGE);
    }


    public void login(String name, String pass){
        $(cssSelector(LOGIN_INPUT)).sendKeys(name);
        $(cssSelector(PASSWORD_INPUT)).sendKeys(pass);
        waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy(cssSelector(SUBMIT_BUTTON)));
        $(cssSelector(SUBMIT_BUTTON)).click();

    }

    public String getErrorMsg(){
        return getDriver().findElement(By.cssSelector(ERROR_TEXT)).getText();
    }

    public String getGreeting(){
        return getDriver().findElement(By.cssSelector(GREETING)).getText();
    }

    public List<WebElement> getSignInList(){
        $(cssSelector(".head-account a")).click();
        return getDriver().findElements((By.cssSelector(".nav-logged-out")));}
}
