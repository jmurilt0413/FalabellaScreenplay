package co.com.banco.certificacion.falabella.questions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.PRECIOS_RESUMEN;
import static co.com.banco.certificacion.falabella.utils.enums.EnumVariableSesion.PRECIO_ARTICULO_PAGINA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PrecioArticulo implements Question<Boolean> {

  private String precio;

  public PrecioArticulo(String precio) {
    this.precio = precio;
  }

  public static PrecioArticulo conValor(String precio) {
    return new PrecioArticulo(precio);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    actor.remember(PRECIO_ARTICULO_PAGINA.getVariableSesion(),
        PRECIOS_RESUMEN.of(precio).resolveFor(actor));
    return PRECIOS_RESUMEN.of(precio).resolveFor(actor).isVisible();

  }
}
