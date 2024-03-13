package com.codebuster.www.task;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.codebuster.www.userInterface.LoginlUI.*;
import static com.codebuster.www.userInterface.PaginaPrincipalUI.BUTTON_INGRESAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class InicioSesionTask implements Task {

    String email, contrasenha;

    boolean mainPage;
    public InicioSesionTask(String email, String contrasenha, boolean mainPage) {
        this.email = email;
        this.contrasenha = contrasenha;
        this.mainPage=mainPage;
    }

    public InicioSesionTask() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (email==null){email=actor.recall("email");}
        if (contrasenha==null){contrasenha=actor.recall("contrasenha");}

        if(mainPage){
            actor.attemptsTo(
                    Click.on(BUTTON_INGRESAR)
            );
        }
        actor.attemptsTo(
                WaitUntil.the(BUTTON_INICIAR_SESION,isClickable()).forNoMoreThan(30).seconds(),
                Enter.theValue(email).into(INPUT_CORREO_ELECTRONICO),
                Enter.theValue(contrasenha).into(INPUT_CONTRASENHA),
                Click.on(BUTTON_INICIAR_SESION)
        );
    }

    public static InicioSesionTask ir (String email, String contrasenha){
        return new InicioSesionTask(email, contrasenha, true);
    }
    public static InicioSesionTask ir (){
        return new InicioSesionTask();
    }
}
