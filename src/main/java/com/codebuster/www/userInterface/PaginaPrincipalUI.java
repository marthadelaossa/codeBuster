package com.codebuster.www.userInterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class PaginaPrincipalUI extends PageObject {
    public static final Target BUTTON_INGRESAR = Target.the("Boton Ingresar").locatedBy ("//a[@href='/auth/login']");

    public static final Target IMG_COODEBUSTER = Target.the("Logo CodeBuster").locatedBy ("//img[@alt='Logo Code Buster']");
    public static final Target MENU_RETOS = Target.the("Menu Retos").locatedBy ("//a[@href='/retos']");
    public static final Target MENU_CIBERSEGURIDAD = Target.the("Menu Ciberseguridad").locatedBy ("//a[@href='/ciberseguridad']");
    public static final Target MENU_CONOCENOS = Target.the("Menu Conocenos").locatedBy ("//a[@href='/conocenos']");
    public static final Target FOOTER = Target.the("Footer").locatedBy ("//*[@id='footer-heading']");

}
