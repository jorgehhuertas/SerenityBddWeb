package com.eccomers.stepDefinitios;

import com.eccomers.actor.Actor_name;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import com.eccomers.tasks.MainPageTask;
import com.eccomers.tasks.OpenBrowser;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class MyStepdefs {

    @Dado("^que estoy en la página de login$")
    public void que_estoy_en_la_página_de_login() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(Actor_name.createActor().getName()).wasAbleTo(OpenBrowser.openBrowser());
        theActorInTheSpotlight().attemptsTo(MainPageTask.perform());
    }

    @Y("ingreso el bolso Cartera en cuero en el carrito")
    public void ingresoElBolsoCarteraEnCueroEnElCarrito() {
    }

    @Entonces("valido que en el carrito este {string} en la pagina principal")
    public void validoQueEnElCarritoEsteEnLaPaginaPrincipal(String arg0) {
    }
}



