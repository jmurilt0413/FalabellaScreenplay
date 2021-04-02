package co.com.banco.certificacion.falabella.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Setup {

  @Before
  public void configurarEscena() {
    OnStage.setTheStage(new OnlineCast());
    theActorCalled("René");
  }

}
