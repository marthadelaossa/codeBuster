package com.codebuster.www.stepDefinitions;
import com.codebuster.www.task.RegistroUsuarioTask;
import io.cucumber.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroDeUsuarioSesionStepDefinitions {

    @Y("el usuario se registra de manera exitosa")
    public void elUsuarioSeRegistraDeManeraExitosa() {
        theActorInTheSpotlight().attemptsTo(RegistroUsuarioTask.ir());

    }
}
