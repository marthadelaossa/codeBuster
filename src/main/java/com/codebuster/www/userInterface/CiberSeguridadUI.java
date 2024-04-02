package com.codebuster.www.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CiberSeguridadUI extends PageObject {

    public static final Target LBL_CIBERSEGURIDAD= Target.the("Detalle La Ciberseguridad").locatedBy ("//h2[text()='La ciberseguridad']");

    public static final Target LBL_AMENAZAS= Target.the("Detalle Tipo de amenazas").locatedBy ("//h2[text()='Tipo de amenazas']");

    public static final Target LBL_CDATOS= Target.the("Detalle Protege tus datos").locatedBy ("//h2[text()='Protege tus datos!']");

}
