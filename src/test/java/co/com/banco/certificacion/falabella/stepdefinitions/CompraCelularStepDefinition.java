package co.com.banco.certificacion.falabella.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.banco.certificacion.falabella.tasks.FiltrarCompra;
import co.com.banco.certificacion.falabella.tasks.IngresarDesdeGoogle;
import co.com.banco.certificacion.falabella.tasks.AgregarCompraArticulo;
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

  @Y("compra un {string} con seguro {string}")
  public void agregarArticuloBolsa(String referenciaArticulo, String coberturaSeguro) {
    theActorInTheSpotlight().attemptsTo(
        AgregarCompraArticulo.conNombre(referenciaArticulo, coberturaSeguro));
  }

  @Entonces("el resumen de la orden es")
  public void validarResumenOrden(Map<String, String> resumenOrden) {
  }
}
