package com.codebuster.www.task;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.codebuster.www.userInterface.PaginaPrincipalUI.BUTTON_INGRESAR;
import static com.codebuster.www.userInterface.PaginaPrincipalUI.MENU_CIBERSEGURIDAD;
import static com.codebuster.www.userInterface.CiberSeguridadUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarCiberseguridadTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(MENU_CIBERSEGURIDAD,isClickable()).forNoMoreThan(30).seconds(),
                Click.on(MENU_CIBERSEGURIDAD)
        );


        actor.attemptsTo(
                WaitUntil.the(LBL_AMENAZAS,isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(LBL_CIBERSEGURIDAD),
                WaitUntil.the(LBL_CIBERSEGURIDAD,isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(LBL_CDATOS ),
                WaitUntil.the(LBL_CDATOS ,isVisible()).forNoMoreThan(30).seconds()
        );
    }

      public static ValidarCiberseguridadTask ir (){
        return new ValidarCiberseguridadTask();
    }
}
