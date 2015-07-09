package com.leisurepro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static com.leisurepro.WaitingUtils.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by admin on 30.06.2015.
 */
public class TestLeisurepro {
    WebDriver driver;
    Page page;
    List <WebElement> signInList;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        WebDriverHolder.setDriver(driver);
        page = new Page();
    }

   /* @Test
    public void shouldBeErrorMessage(){
        page.open();
        page.login("asdfa@gmail.com", "asdf123");
        sleep(5000);
        String error = page.getErrorMsg();
        assertThat(error, equalTo("Wrong Email or Password"));
    }

    @Test
    public void shouldBeLoggedIn(){
        page.open();
        page.login("nevzorovia15@gmail.com", "asdf123");
        sleep(5000);
        String sucees = page.getGreeting().substring(0, 5);
        assertThat(sucees, equalTo("Hello"));
    }*/

    @Test
    public void testSignInList(){
        page.open();
        signInList = page.getSignInList();
        for (WebElement element : signInList) {
            //assertThat(element.getText(), equalTo("Login"));
            System.out.println(element.getText());
        }
    }

    @After
    public void closeDriver() {
        driver.close();
    }
}
