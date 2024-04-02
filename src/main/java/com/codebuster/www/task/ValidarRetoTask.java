package com.codebuster.www.task;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.codebuster.www.userInterface.PaginaPrincipalUI.MENU_RETOS;
import static com.codebuster.www.userInterface.RetosUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarRetoTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(MENU_RETOS,isClickable()).forNoMoreThan(30).seconds(),
                Click.on(MENU_RETOS)
        );
        actor.attemptsTo(
                WaitUntil.the(BUTTON_RETO_POPULARES,isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_RETO_POPULARES)
        );

        actor.attemptsTo(
                WaitUntil.the(LBL_RETO,isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(INPUT_RESPUESTA,isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(BUTTON_PISTA,isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(BUTTON_PASAR_NIVEL ,isVisible()).forNoMoreThan(30).seconds()
        );
    }

      public static ValidarRetoTask ir (){
        return new ValidarRetoTask();
    }
}
