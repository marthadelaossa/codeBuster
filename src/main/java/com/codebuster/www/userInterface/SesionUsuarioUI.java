package com.codebuster.www.userInterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class SesionUsuarioUI extends PageObject {
     public static final Target BUTTON_SESION = Target.the("Button Usuario").locatedBy ("//div[@class='flex justify-between w-40 items-center h-12 bg-purple-500 rounded-xl text-white p-2']/button");
    public static final Target BUTTON_CERRAR_SESION = Target.the("Button Cerrar Sesion").locatedBy ("//span[text()='Cerrar sesión']");

}
