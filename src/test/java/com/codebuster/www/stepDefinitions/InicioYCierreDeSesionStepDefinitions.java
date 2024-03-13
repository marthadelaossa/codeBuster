package com.codebuster.www.stepDefinitions;
import com.codebuster.www.task.CerrarSesionTask;
import com.codebuster.www.task.InicioSesionTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.codebuster.www.userInterface.SesionUsuarioUI.BUTTON_SESION;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioYCierreDeSesionStepDefinitions {

    @Entonces("el usuario inicia sesion")
    public void elUsuarioIniciaSesion() {
        theActorInTheSpotlight().attemptsTo(InicioSesionTask.ir());
    }

    @Entonces("el usuario cierra sesion")
    public void elUsuarioCierraSesion() {
        theActorInTheSpotlight().attemptsTo(CerrarSesionTask.ir());
    }

    @Entonces("el usuario inicia sesion con los datos {string} {string}")
    public void elUsuarioIniciaSesionConLosDatos(String email, String contrasenha) {
               theActorInTheSpotlight().attemptsTo(InicioSesionTask.ir(email, contrasenha));
    }

    @Entonces("el usuario valida el inicio de sesion exitoso")
    public void elUsuarioValidaElInicioDeSesionExitoso() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(BUTTON_SESION).isDisplayed()
        );
    }

    @Entonces("el usuario valida el inicio de sesion no exitoso")
    public void elUsuarioValidaElInicioDeSesionNOExitoso() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(BUTTON_SESION).isNotDisplayed()
        );
    }
}
