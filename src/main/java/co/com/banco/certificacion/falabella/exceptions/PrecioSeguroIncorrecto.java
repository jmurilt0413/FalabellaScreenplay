package co.com.banco.certificacion.falabella.exceptions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.LBL_PRECIOS_RESUMEN;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PrecioSeguroIncorrecto extends AssertionError {

  public static final String MENSAJE_PRECIO_SEGURO_INCORRECTO =
      "El precio del seguro no coincide. Valor actual " + LBL_PRECIOS_RESUMEN
          .resolveAllFor(theActorInTheSpotlight()).get(1)
          .getText().replace("$", "");

  public PrecioSeguroIncorrecto(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
