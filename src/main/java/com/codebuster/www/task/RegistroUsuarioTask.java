package com.codebuster.www.task;


import com.codebuster.www.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.codebuster.www.userInterface.LoginlUI.*;
import static com.codebuster.www.userInterface.PaginaPrincipalUI.*;
import static com.codebuster.www.userInterface.RegisterlUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistroUsuarioTask implements Task {
    Datos datos = new Datos();
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_INGRESAR)
        );
        actor.attemptsTo(
                WaitUntil.the(LINK_REGISTRARSE,isClickable()).forNoMoreThan(30).seconds(),
                Click.on(LINK_REGISTRARSE)
        );
        String nombre=(datos.getNombre()+" "+datos.getApellido());
        String email=datos.getCorreo();
        String contrasenha="Codebuster123#";
        actor.remember("email",email);
        actor.remember("contrasenha",contrasenha);
        actor.attemptsTo(
                WaitUntil.the( BUTTON_REGISTRATE,isClickable()).forNoMoreThan(30).seconds(),
                Enter.theValue(nombre).into(INPUT_NOMBRE),
                Enter.theValue(email).into(INPUT_CORREO),
                Enter.theValue(contrasenha).into(INPUT_PASWORD),
                Click.on( BUTTON_REGISTRATE)
        );
        actor.attemptsTo(
                WaitUntil.the( BUTTON_INICIAR_SESION,isClickable()).forNoMoreThan(30).seconds()
        );

    }

    public static RegistroUsuarioTask ir (){
        return new RegistroUsuarioTask();
    }

}
