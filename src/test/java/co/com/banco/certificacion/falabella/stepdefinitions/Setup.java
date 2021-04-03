package co.com.banco.certificacion.falabella.stepdefinitions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.TABLA_RESUMEN;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella;
import co.com.banco.certificacion.falabella.utils.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

public class Setup {


  @Managed(driver = "chrome")
  public WebDriver driver;

  @Before
  public void configurarEscena() {
    final String RUTA_URL = "baseurl";
    String urlBaseFront;
    EnvironmentVariables environmentVariable = Injectors.getInjector()
        .getInstance(EnvironmentVariables.class);
    urlBaseFront =
        EnvironmentSpecificConfiguration.from(environmentVariable).getProperty(RUTA_URL);
    OnStage.setTheStage(new OnlineCast());
    theActorCalled("René").can(BrowseTheWeb.with(driver));
    theActorInTheSpotlight().wasAbleTo(Open.url(urlBaseFront));
  }

  @After
  public void imprimirDatosSolicitadosConsola() {
    Logger.info("PaginaDespachoFalabella.class",
        TABLA_RESUMEN.resolveFor(theActorInTheSpotlight()).getText());
  }

}
