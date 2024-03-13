package com.codebuster.www.userInterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class RegisterlUI extends PageObject {
    public static final Target INPUT_NOMBRE = Target.the("Input Nombre").locatedBy ("//input[@name='username']");

    public static final Target INPUT_CORREO = Target.the("Input Correo Electronico").locatedBy ("//input[@name='userEmail']");

    public static final Target INPUT_PASWORD = Target.the("Input Contraseña").locatedBy ("//input[@name='password']");

    public static final Target BUTTON_REGISTRATE = Target.the("Button Iniciar Sesion").locatedBy ("//button[@type='submit']");


}
