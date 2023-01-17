package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;

public class SwagLabsLoginSteps {

    LoginScreen loginScreen;

    @Step("Logueo con usuario y contraseña")
    public void loginWithUserAndPassword(String user, String password){
        loginScreen.loginWithUserAndPassword(user,password);
    }

}
