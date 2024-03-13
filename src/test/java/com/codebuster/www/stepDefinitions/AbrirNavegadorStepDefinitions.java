package com.codebuster.www.stepDefinitions;

import com.codebuster.www.interactions.AbrirNavegador;
import com.codebuster.www.task.CargaPaginaInicialTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AbrirNavegadorStepDefinitions {


    public static WebDriver driver;

    @Before
    public void actorSetUp() {
        setTheStage(new OnlineCast());
        theActorCalled("Tester").can(BrowseTheWeb.with(driver));
    }

    @Dado("que el usuario ingresa a la pagina de CodeBuster (.*)$")
    public void queElUsuarioIngresaALaPaginaDeCodeBuster  (String url) {
        theActorInTheSpotlight().attemptsTo(AbrirNavegador.ir(url));
    }

    @Dado("el usuario verifica que la página carga correctamente")
    public void elUsuarioVerificaQueLaPáginaCargaCorrectamente() {
        theActorInTheSpotlight().attemptsTo(CargaPaginaInicialTask.verificar());
    }
}
