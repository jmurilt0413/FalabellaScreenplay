package co.com.banco.certificacion.falabella.stepdefinitions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_CANTIDAD_PRODUCTOS;
import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_CODIGO_PRODUCTO;
import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_MARCA_EMPRESA;
import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_NOMBRE_CELULAR;
import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_PRECIOS_RESUMEN;
import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_PRECIO_TOTAL_ARTICULO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.banco.certificacion.falabella.models.ResumenCompra;
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
    Logger.info("ResumenCompra.class",
        new ResumenCompra(
            LBL_NOMBRE_CELULAR.resolveFor(theActorInTheSpotlight()).getText(),
            LBL_MARCA_EMPRESA.resolveFor(theActorInTheSpotlight()).getText(),
            LBL_PRECIO_TOTAL_ARTICULO.resolveFor(theActorInTheSpotlight()).getText(),
            LBL_PRECIOS_RESUMEN.resolveAllFor(theActorInTheSpotlight()).get(0).getText(),
            LBL_PRECIOS_RESUMEN.resolveAllFor(theActorInTheSpotlight()).get(1).getText(),
            LBL_CANTIDAD_PRODUCTOS.resolveFor(theActorInTheSpotlight()).getText().replace("(", "")
                .replace(")", ""),
            LBL_CODIGO_PRODUCTO.resolveFor(theActorInTheSpotlight()).getText()).toString());
  }

}
