package com.codebuster.www.userInterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class LoginlUI extends PageObject {
    public static final Target INPUT_CORREO_ELECTRONICO = Target.the("Input Correo Electronico").locatedBy ("//input[@name='login']");

    public static final Target INPUT_CONTRASENHA = Target.the("Input Contraseña").locatedBy ("//input[@name='password']");
    public static final Target BUTTON_INICIAR_SESION = Target.the("Button Iniciar Sesion").locatedBy ("//button[@type='submit']");
    public static final Target LINK_REGISTRARSE = Target.the("Link Registrarse").locatedBy ("//a[@href='/auth/register']");

}
