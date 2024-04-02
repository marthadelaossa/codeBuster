package com.codebuster.www.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.codebuster.www.userInterface.CiberSeguridadUI.LBL_CIBERSEGURIDAD;
import static com.codebuster.www.userInterface.RetosUI.*;

public class SolicitudPistaTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_PISTA),
                Scroll.to(BUTTON_PISTA)
        );

    }

      public static SolicitudPistaTask ir (){
        return new SolicitudPistaTask();
    }
}
