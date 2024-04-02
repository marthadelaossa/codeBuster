package com.codebuster.www.task;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.codebuster.www.userInterface.LoginlUI.INPUT_CORREO_ELECTRONICO;
import static com.codebuster.www.userInterface.PaginaPrincipalUI.MENU_RETOS;
import static com.codebuster.www.userInterface.RegisterlUI.BUTTON_REGISTRATE;
import static com.codebuster.www.userInterface.RetosUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SoluionaRetoCorrectamenteTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("Eddie Murphy").into(INPUT_RESPUESTA),
                Click.on(BUTTON_RESPUESTA)
        );

    }

      public static SoluionaRetoCorrectamenteTask ir (){
        return new SoluionaRetoCorrectamenteTask();
    }
}
