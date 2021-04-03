package co.com.banco.certificacion.falabella.questions;

import static co.com.banco.certificacion.falabella.userinterface.PaginaDespachoFalabella.PRECIOS_RESUMEN;
import static co.com.banco.certificacion.falabella.utils.enums.EnumVariableSesion.PRECIO_SEGURO_PAGINA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PrecioSeguro implements Question<Boolean> {

  private String precioSeguro;

  public PrecioSeguro(String precioSeguro) {
    this.precioSeguro = precioSeguro;
  }

  public static PrecioSeguro conValor(String precioSeguro) {
    return new PrecioSeguro(precioSeguro);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    actor.remember(PRECIO_SEGURO_PAGINA.getVariableSesion(),
        PRECIOS_RESUMEN.of(precioSeguro).resolveFor(actor));
    return PRECIOS_RESUMEN.of(precioSeguro).resolveFor(actor).isVisible();
  }
}
