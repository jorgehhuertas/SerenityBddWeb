package com.eccomers.Iterations;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.eccomers.interfaces.MainPageInterfaces.LINK_BOLSOS;

public class MainPageIteration {

    public static final String IR_PAGINA_BOLSOS = "{0} da click en Boton para ir a la Pagina de Bolsos";

    public static Performable irPaginaBolsos() {
        return Task.where(IR_PAGINA_BOLSOS, Click.on(LINK_BOLSOS));
    }

}
