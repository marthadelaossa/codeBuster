package com.codebuster.www.task;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static com.codebuster.www.userInterface.PaginaPrincipalUI.*;

public class CargaPaginaInicialTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BUTTON_INGRESAR, isClickable()).forNoMoreThan(40).seconds(),
                WaitUntil.the(IMG_COODEBUSTER, isClickable()).forNoMoreThan(40).seconds(),
                WaitUntil.the(MENU_RETOS, isClickable()).forNoMoreThan(40).seconds(),
                WaitUntil.the(MENU_CIBERSEGURIDAD, isClickable()).forNoMoreThan(40).seconds(),
                Scroll.to(FOOTER),
                Scroll.to(BUTTON_INGRESAR)
        );

    }

    public static CargaPaginaInicialTask verificar (){
        return new CargaPaginaInicialTask();
    }

}
