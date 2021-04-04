package co.com.banco.certificacion.falabella.stepdefinitions;

import static co.com.banco.certificacion.falabella.exceptions.PrecioArticuloIncorrecto.MENSAJE_PRECIO_ARTICULO_INCORRECTO;
import static co.com.banco.certificacion.falabella.exceptions.PrecioSeguroIncorrecto.MENSAJE_PRECIO_SEGURO_INCORRECTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

import co.com.banco.certificacion.falabella.exceptions.PrecioArticuloIncorrecto;
import co.com.banco.certificacion.falabella.exceptions.PrecioSeguroIncorrecto;
import co.com.banco.certificacion.falabella.questions.Cantidad;
import co.com.banco.certificacion.falabella.questions.Codigo;
import co.com.banco.certificacion.falabella.questions.Marca;
import co.com.banco.certificacion.falabella.questions.Nombre;
import co.com.banco.certificacion.falabella.questions.PrecioArticulo;
import co.com.banco.certificacion.falabella.questions.PrecioSeguro;
import co.com.banco.certificacion.falabella.questions.PrecioTotal;
import co.com.banco.certificacion.falabella.tasks.AgregarCompraArticulo;
import co.com.banco.certificacion.falabella.tasks.FiltrarCompra;
import co.com.banco.certificacion.falabella.tasks.IngresarDesdeGoogle;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Entonces;
import java.util.Map;

public class CompraCelularStepDefinition {

  @Dado("que René ingresa a la página de {word} desde el buscador de Google")
  public void ingresarPaginaDesdeGoogle(String nombrePagina) {
    theActorInTheSpotlight().attemptsTo(IngresarDesdeGoogle.ToPagina(nombrePagina));
  }

  @Cuando("René busca por {word}")
  public void filtrarArticulo(String nombreProducto) {
    theActorInTheSpotlight().attemptsTo(FiltrarCompra.porArticulo(nombreProducto));
  }

  @E("inicia una intención de compra para un {string} con seguro {string}")
  public void agregarArticuloBolsa(String referenciaArticulo, String coberturaSeguro) {
    theActorInTheSpotlight().attemptsTo(
        AgregarCompraArticulo.conNombre(referenciaArticulo, coberturaSeguro));
  }

  @Entonces("el resumen de la orden es")
  public void validarResumenOrden(Map<String, String> resumenOrden) {
    then(theActorInTheSpotlight()).should(
        seeThat(
            PrecioArticulo.valor(), equalTo(resumenOrden.get("Valor celular"))).orComplainWith(
            PrecioArticuloIncorrecto.class, MENSAJE_PRECIO_ARTICULO_INCORRECTO),
        seeThat(
            PrecioSeguro.valor(), equalTo(resumenOrden.get("Valor seguro"))).orComplainWith(
            PrecioSeguroIncorrecto.class, MENSAJE_PRECIO_SEGURO_INCORRECTO),
        seeThat(
            Nombre.celular(), equalTo(resumenOrden.get("Nombre Celular"))),
        seeThat(
            Marca.empresa(), equalTo(resumenOrden.get("Marca"))),
        seeThat(
            PrecioTotal.valor(), equalTo(resumenOrden.get("Valor total"))),
        seeThat(
            Cantidad.productos(), equalTo(resumenOrden.get("Cantidad de productos"))),
        seeThat(
            Codigo.numero(), equalTo(resumenOrden.get("Codigo"))));
  }
}
