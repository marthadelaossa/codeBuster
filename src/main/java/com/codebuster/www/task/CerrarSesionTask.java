package com.codebuster.www.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.codebuster.www.userInterface.LoginlUI.*;
import static com.codebuster.www.userInterface.PaginaPrincipalUI.BUTTON_INGRESAR;
import static com.codebuster.www.userInterface.SesionUsuarioUI.BUTTON_CERRAR_SESION;
import static com.codebuster.www.userInterface.SesionUsuarioUI.BUTTON_SESION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CerrarSesionTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the( BUTTON_SESION ,isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_SESION),
                WaitUntil.the( BUTTON_CERRAR_SESION,isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_CERRAR_SESION)
        );
        actor.attemptsTo(
                WaitUntil.the(BUTTON_INGRESAR, isClickable()).forNoMoreThan(40).seconds()
                );
    }

    public static CerrarSesionTask ir (){
        return new CerrarSesionTask();
    }

}
