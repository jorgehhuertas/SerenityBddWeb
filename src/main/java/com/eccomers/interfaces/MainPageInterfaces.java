package com.eccomers.interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class MainPageInterfaces {

    private static final String DESCRIPCION_LINK = "Link para  ir a la Pagina de compras de Bolsos'";

    public static final Target LINK_BOLSOS = Target.the(DESCRIPCION_LINK).
            located(By.cssSelector("#menu-item-8"));
}
