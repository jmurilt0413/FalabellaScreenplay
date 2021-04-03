package co.com.banco.certificacion.falabella.exceptions;

import static co.com.banco.certificacion.falabella.utils.enums.EnumVariableSesion.PRECIO_SEGURO_PAGINA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PrecioSeguroIncorrecto extends AssertionError {

  public static final String MENSAJE_PRECIO_SEGURO_INCORRECTO =
      "El precio del seguro no coincide. Valor actual" + theActorInTheSpotlight()
          .recall(PRECIO_SEGURO_PAGINA.getVariableSesion());

  public PrecioSeguroIncorrecto(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
