package com.codebuster.www.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RetosUI extends PageObject {
    public static final Target BUTTON_RETO_POPULARES=  Target.the("RETO LA PREMIERE").locatedBy ("(//a[@href='/challenge-details/14'])[2]");

    public static final Target LBL_RETO = Target.the("Detalle Reto").locatedBy ("//p[@class='text-lg']");

    public static final Target INPUT_RESPUESTA = Target.the("Input Ingrese su Respuesta").locatedBy ("//input[@placeholder='Ingrese su respuesta']");

    public static final Target BUTTON_RESPUESTA=  Target.the("Button Respuesta").locatedBy ("(//button)[2]");

    public static final Target BUTTON_PISTA=  Target.the("Button Pista").locatedBy ("//button[text()='Pista']");

    public static final Target BUTTON_PASAR_NIVEL  = Target.the("Button pasar Nivel").locatedBy ("//button[text()='500 pts']");

}
