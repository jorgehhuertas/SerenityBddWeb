package com.eccomers.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import com.eccomers.Iterations.MainPageIteration;

public class MainPageTask implements Task {


    public static MainPageTask perform() {
        return Tasks.instrumented(MainPageTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MainPageIteration.irPaginaBolsos());

    }
}
