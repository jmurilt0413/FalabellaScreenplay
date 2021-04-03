package co.com.banco.certificacion.falabella.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.banco.certificacion.falabella.tasks.FiltrarCompra;
import co.com.banco.certificacion.falabella.tasks.IngresarDesdeGoogle;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import java.util.Map;

public class CompraCelularStepDefinition {

  @Dado("René ingresa a la página de {word} desde el buscador de Google")
  public void ingresarPaginaDesdeGoogle(String nombrePagina) {
    theActorInTheSpotlight().attemptsTo(IngresarDesdeGoogle.ToPagina(nombrePagina));
  }

  @Cuando("René busca por {word}")
  public void filtrarArticulo(String nombreProducto) {
    theActorInTheSpotlight().attemptsTo(FiltrarCompra.porArticulo(nombreProducto));
  }

  @Y("selecciona el artículo {string}")
  public void seleccionarArticulo(String referenciaArticulo) {

  }

  @Y("asegura su producto con {string}")
  public void asegurarArticulo(String coberturaArticulo) {
  }

  @Entonces("el resumen de la orden es")
  public void validarResumenOrden(Map<String, String> resumenOrden) {
  }
}
