package com.eccomers.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static com.eccomers.utils.Environment.URL_WEB;

public class OpenBrowser implements Task {

    private String enviroment;

    public static OpenBrowser openBrowser() {
        return Tasks.instrumented(OpenBrowser.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        enviroment = URL_WEB;
        actor.attemptsTo(Open.url(enviroment));

    }
}
