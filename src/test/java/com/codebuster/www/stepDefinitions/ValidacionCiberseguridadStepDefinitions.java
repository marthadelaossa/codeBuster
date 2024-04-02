package com.codebuster.www.stepDefinitions;


import com.codebuster.www.task.ValidarCiberseguridadTask;
import com.codebuster.www.task.ValidarRetoTask;
import io.cucumber.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidacionCiberseguridadStepDefinitions {

    @Y("el usuario ingresa al menu Ciberseguridad y valida el contenido")
    public void elUsuarioIngresaAlMenuCiberseguridadYValidaElContenido() {
        theActorInTheSpotlight().attemptsTo(ValidarCiberseguridadTask.ir());

    }

}
