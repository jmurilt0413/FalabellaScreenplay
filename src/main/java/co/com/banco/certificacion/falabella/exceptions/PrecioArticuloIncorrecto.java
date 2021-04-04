package co.com.banco.certificacion.falabella.exceptions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_PRECIOS_RESUMEN;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PrecioArticuloIncorrecto extends AssertionError {

  public static final String MENSAJE_PRECIO_ARTICULO_INCORRECTO =
      "Los precios del articulo no coinciden. Valor actual" + LBL_PRECIOS_RESUMEN
          .resolveAllFor(theActorInTheSpotlight()).get(0)
          .getText().replace("$", "");

  public PrecioArticuloIncorrecto(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }

}
