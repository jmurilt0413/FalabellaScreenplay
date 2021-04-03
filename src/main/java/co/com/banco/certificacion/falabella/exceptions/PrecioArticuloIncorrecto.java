package co.com.banco.certificacion.falabella.exceptions;

import static co.com.banco.certificacion.falabella.utils.enums.EnumVariableSesion.PRECIO_ARTICULO_PAGINA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PrecioArticuloIncorrecto extends AssertionError {

  public static final String MENSAJE_PRECIO_ARTICULO_INCORRECTO =
      "Los precios del articulo no coinciden. Valor actual" + theActorInTheSpotlight()
          .recall(PRECIO_ARTICULO_PAGINA.getVariableSesion());

  public PrecioArticuloIncorrecto(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }

}
