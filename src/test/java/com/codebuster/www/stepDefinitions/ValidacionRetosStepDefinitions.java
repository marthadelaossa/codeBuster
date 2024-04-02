package com.codebuster.www.stepDefinitions;


import com.codebuster.www.task.SolicitudPistaTask;
import com.codebuster.www.task.SoluionaRetoCorrectamenteTask;
import com.codebuster.www.task.SoluionaRetoIncorrectamenteTask;
import com.codebuster.www.task.ValidarRetoTask;
import io.cucumber.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ValidacionRetosStepDefinitions {

    @Y("el usuario ingresa a un reto y valida la informacion")
    public void elUsuarioIngresaAunRetoYValidaLaInformacion() {
        theActorInTheSpotlight().attemptsTo(ValidarRetoTask.ir());

    }

    @Y("el usuario soluciona el reto correctamente")
    public void elUsuarioSolucionaElRetoCorrectamente() {
        theActorInTheSpotlight().attemptsTo(SoluionaRetoCorrectamenteTask.ir());

    }

    @Y("el usuario soluciona el reto incorrectamente")
    public void elUsuarioSolucionaElRetoIncorrectamente() {
        theActorInTheSpotlight().attemptsTo(SoluionaRetoIncorrectamenteTask.ir());

    }
    @Y("el usuario solicita una pista")
    public void elUsuarioSolicitaUnaPista() {
        theActorInTheSpotlight().attemptsTo(SolicitudPistaTask.ir());

    }

}
