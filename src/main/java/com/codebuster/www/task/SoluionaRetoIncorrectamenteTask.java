package com.codebuster.www.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.codebuster.www.userInterface.RetosUI.BUTTON_RESPUESTA;
import static com.codebuster.www.userInterface.RetosUI.INPUT_RESPUESTA;

public class SoluionaRetoIncorrectamenteTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("Juan").into(INPUT_RESPUESTA),
                Click.on(BUTTON_RESPUESTA)
        );

    }

      public static SoluionaRetoIncorrectamenteTask ir (){
        return new SoluionaRetoIncorrectamenteTask();
    }
}
