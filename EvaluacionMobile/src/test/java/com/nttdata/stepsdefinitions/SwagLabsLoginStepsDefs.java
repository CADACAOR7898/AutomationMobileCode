package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabsInventorySteps;
import com.nttdata.steps.SwagLabsLoginSteps;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwagLabsLoginStepsDefs {

    @Steps
    SwagLabsLoginSteps swagLabsLoginSteps;

    @Steps
    SwagLabsInventorySteps swagLabsInventorySteps;

    @Given("que me encuentro en la página de login de Saucedemo")
    public void que_me_encuentro_en_la_página_de_login_de_saucedemo() {
        System.out.println("Aplication open");
    }

    @When("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario(String user, String password) {
        swagLabsLoginSteps.loginWithUserAndPassword(user, password);
    }

    @Then("valido que debería aparecer el título de {string}")
    public void valido_que_debería_aparecer_el_título(String titleText) {
        Assert.assertEquals(swagLabsInventorySteps.getTitleText(), titleText);
    }

    @And("también valido que el item {string} existe")
    public void también_valido_que_al_menos_exista_un_item(String item) {
        Assert.assertEquals(swagLabsInventorySteps.getItemName(), item);
    }

}
