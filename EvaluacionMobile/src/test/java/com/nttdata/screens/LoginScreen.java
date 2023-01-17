package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement inputUser;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement inputPassword;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement buttonLogin;

    public void loginWithUserAndPassword(String user, String password){
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        inputUser.sendKeys(user);
        inputPassword.sendKeys(password);
        buttonLogin.click();
    }

}
